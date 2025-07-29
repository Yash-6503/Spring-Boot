package com.yw.configs;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.AccessDeniedHandlerImpl;
import org.springframework.security.web.authentication.LoginUrlAuthenticationEntryPoint;


@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	/* OLD and Deprecated it will not run.. */
	
//	public void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication().withUser("raja").password("{noop}rani").authorities("USER");
//		auth.inMemoryAuthentication().withUser("ramesh").password("{noop}ramesh").authorities("ADMIN");
//	}
	
//	public void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests().requestMatchers("/").permitAll()
//		.requestMatchers("/users").authenticated()
//		.requestMatchers("/allusers").hasRole("ADMIN")
//		.anyRequest().authenticated()
//		.and().formLogin()
//		.and().exceptionHandling();
//	}
	
	
	/* NEW it will run.. */
	
	@Bean
	public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder) {
		UserDetails user1 = User.withUsername("raja")
				.password(passwordEncoder.encode("rani"))
				.roles("USER")
				.build();
		
		UserDetails user2 = User.withUsername("system")
				.password(passwordEncoder.encode("tiger"))
				.roles("ADMIN")
				.build();
		
		return new InMemoryUserDetailsManager(user1, user2);
	}
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
		http
					.authorizeHttpRequests(auth -> auth
								.requestMatchers("/admin/**").hasRole("ADMIN")
								.requestMatchers("/user/**").hasRole("USER")
					            .anyRequest().authenticated()
							)
					 .formLogin(form -> form
					            .loginPage("/signin")
					            .permitAll()
					            .loginProcessingUrl("/dologin")
					            .defaultSuccessUrl("/home", true) // Redirect to /home after successful login
					            .failureUrl("/signin?error=true")
					        )
					 .logout(logout -> logout
							    .logoutRequestMatcher(request -> 
							        "GET".equals(request.getMethod()) && "/logout".equals(request.getRequestURI()))
							    .logoutSuccessUrl("/signin?logout=true")
							)
					 
					 .exceptionHandling(ex->ex
							 .authenticationEntryPoint(new LoginUrlAuthenticationEntryPoint("/signin"))
							 .accessDeniedHandler(new AccessDeniedHandlerImpl())
							 
							 );
		
		return http.build();
	}
	

	@Bean
	public PasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder();
	}
}
