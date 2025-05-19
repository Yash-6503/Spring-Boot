package com.yw.Repository;

import org.springframework.data.repository.CrudRepository;

import com.yw.entities.Doctor;

public interface IDoctorRepository extends CrudRepository<Doctor, Integer>
{}
