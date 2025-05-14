package com.yw.repository;

import org.springframework.data.repository.CrudRepository;

import com.yw.entities.Actor;

public interface IActorRepo extends CrudRepository<Actor, Integer>
{
}
