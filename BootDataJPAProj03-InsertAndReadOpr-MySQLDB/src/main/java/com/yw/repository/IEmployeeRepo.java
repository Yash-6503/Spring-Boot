package com.yw.repository;

import org.springframework.data.repository.CrudRepository;

import com.yw.entites.Employee;

public interface IEmployeeRepo extends CrudRepository<Employee, Integer> 
{}
