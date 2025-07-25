package com.yw.config;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @SuppressWarnings("removal")
	@Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/", "/login", "/home").permitAll()
                .anyRequest().authenticated()
            )
            .formLogin(withDefaults())  // Enable form login
            .httpBasic(withDefaults()) // Enable basic auth (optional)
            .oauth2Login();

        return http.build();
    }
}
