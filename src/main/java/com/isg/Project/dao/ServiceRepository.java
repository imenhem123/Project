package com.isg.Project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.isg.Project.entities.Service;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Long>, QuerydslPredicateExecutor<Service> {
	
}
