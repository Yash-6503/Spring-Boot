package com.yw.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.yw.entities.Doctor;

public interface IDoctorRepository extends PagingAndSortingRepository<Doctor, Integer>
{
}
