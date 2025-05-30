package com.yw.service;

import java.util.Optional;

import com.yw.entities.JobSeeker;

public interface IJobSeekerService {
	public String registerJobSeeker(JobSeeker seeker);
	public Optional<JobSeeker> searchJobSeekerById(Integer id);
}
