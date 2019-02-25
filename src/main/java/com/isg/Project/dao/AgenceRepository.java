package com.isg.Project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.isg.Project.entities.Agence;

@Repository
public interface AgenceRepository extends JpaRepository<Agence, Long>, QuerydslPredicateExecutor<Agence> {
	
}