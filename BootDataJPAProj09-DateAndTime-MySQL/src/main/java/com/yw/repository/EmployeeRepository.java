package com.yw.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.yw.entities.Employee_Date_Time;

public interface EmployeeRepository extends JpaRepository<Employee_Date_Time, Integer>
{
	@Query(nativeQuery=true, value="SELECT YEAR(CURRENT_TIMESTAMP) - YEAR(DOB) FROM EMPLOYEE_DATE_TIME WHERE DESIG=?1")
	public List<Integer> getEmployeeAgesByDesig(String desig);
}
