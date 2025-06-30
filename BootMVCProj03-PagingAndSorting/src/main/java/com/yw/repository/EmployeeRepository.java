package com.yw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.yw.entity.Employee_Info;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee_Info, Integer>, JpaRepository<Employee_Info, Integer> {

}
