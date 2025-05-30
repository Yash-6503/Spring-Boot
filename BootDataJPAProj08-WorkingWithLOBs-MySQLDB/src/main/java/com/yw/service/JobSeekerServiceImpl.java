package com.yw.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yw.entities.JobSeeker;
import com.yw.repository.JobSeekerRepository;

@Service
public class JobSeekerServiceImpl implements IJobSeekerService {

	@Autowired
	private JobSeekerRepository jobSeekerRepo;
	
	@Override
	public String registerJobSeeker(JobSeeker seeker) {
		return "Job Seeker with Id : "+jobSeekerRepo.save(seeker).getId()+" registered successfully...";
	}

	@Override
	public Optional<JobSeeker> searchJobSeekerById(Integer id) {
		return jobSeekerRepo.findById(id);
	}

}
