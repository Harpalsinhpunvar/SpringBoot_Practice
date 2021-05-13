package com.hp.Businessman.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hp.Businessman.Businessman;

public interface BusinessmanRepository extends JpaRepository<Businessman, Integer> {
 
	Businessman findByName(String name);
}
