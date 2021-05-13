package com.hp.pojo.repository;

import org.springframework.data.repository.CrudRepository;

import com.hp.pojo.Pojo;

public interface Repository extends CrudRepository<Pojo, Integer> {

}
