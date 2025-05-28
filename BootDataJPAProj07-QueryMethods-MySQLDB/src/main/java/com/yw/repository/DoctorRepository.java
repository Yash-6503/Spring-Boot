package com.yw.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.yw.entities.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer>, CrudRepository<Doctor, Integer> 
{
	@Query("FROM Doctor")
	public List<Doctor> showAllDoctors();
	
	@Query("FROM Doctor WHERE fee BETWEEN ?1 and ?2")
	public List<Doctor> showDoctorsByFeeRange(double min, double max);
	
	@Query("FROM Doctor WHERE docName LIKE ?1")
	public List<Doctor> showDoctorsByNameFirstChars(String initialChars);
	
//	@Query("FROM Doctor WHERE docName > :noChars")
//	public List<Doctor> showDoctorsByNameLength(@Param("noChars") Integer noChars);
	
	@Query("UPDATE Doctor SET fee=?1 WHERE docId = ?2")
	@Modifying
	@Transactional
	public void updateDoctorFeeById(Double fee, Integer docId);
	
	@Query("DELETE FROM Doctor WHERE fee < :lowFee")
	@Modifying
	@Transactional
	public void deleteDoctorHavingLessFee(@Param("lowFee") Double lowFee);
	
}
