package com.yw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yw.entity.Actor;
import com.yw.repository.ActorRepository;

@Service
public class ActorServiceImpl implements ActorService {

	@Autowired
	private ActorRepository actorRepo;
	
	@Override
	public List<Actor> allActors() {
		return actorRepo.findAll();
	}

}
