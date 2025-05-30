package com.yw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.yw.entities.JobSeeker;

public interface JobSeekerRepository extends JpaRepository<JobSeeker, Integer>, CrudRepository<JobSeeker, Integer> 
{}
