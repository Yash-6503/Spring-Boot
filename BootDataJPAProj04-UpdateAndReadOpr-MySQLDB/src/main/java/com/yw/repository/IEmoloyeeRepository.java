package com.yw.repository;

import org.springframework.data.repository.CrudRepository;

import com.yw.entities.Employee;

public interface IEmoloyeeRepository extends  CrudRepository<Employee, Integer>
{}
