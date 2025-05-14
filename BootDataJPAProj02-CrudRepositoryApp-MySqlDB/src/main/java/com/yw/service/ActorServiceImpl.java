package com.yw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yw.entities.Actor;
import com.yw.repository.IActorRepo;

@Service("actorService")
public class ActorServiceImpl implements IActorService {

	@Autowired
	private IActorRepo actorRepo;
	
	@Override
	public String registerActor(Actor actor) {
		if(actor != null) {
			actorRepo.save(actor);
			return "Actor with ID : "+actor.getActorId()+" saved successfully...";
		}else {
			return "Actor not saved....";
		}
	}

}
