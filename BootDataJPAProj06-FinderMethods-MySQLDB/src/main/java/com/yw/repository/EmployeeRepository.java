package com.yw.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.yw.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>, CrudRepository<Employee, Integer> 
{
	public List<Employee> findByeName(String name);
	public List<Employee> findBysalBetween(double d, double e);
	public List<Employee> findByjob(String name);
	public List<Employee> findByeNameStartingWith(String nameChars);
	public List<Employee> findByeNameEndingWith(String nameChars);
	public List<Employee> findByeNameContainingIgnoreCase(String nameChars);
	public List<Employee> findByeNameLikeIgnoreCase(String pattern);
//	public List<Employee> findByeNameInOrderByeNameAsc(List<String> empList);
	public List<Employee> findByeNameIn(List<String> eNames);
}
