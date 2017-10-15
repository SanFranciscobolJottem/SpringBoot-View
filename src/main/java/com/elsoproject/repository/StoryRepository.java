package com.elsoproject.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.elsoproject.domain.Story;

public interface StoryRepository extends CrudRepository<Story, Long> {

	List<Story> findAll();
	
}
