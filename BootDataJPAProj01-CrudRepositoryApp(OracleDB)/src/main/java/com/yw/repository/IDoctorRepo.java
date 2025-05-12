package com.yw.repository;

import org.springframework.data.repository.CrudRepository;

import com.yw.entity.Doctor;

public interface IDoctorRepo extends CrudRepository<Doctor, Integer>
{}
