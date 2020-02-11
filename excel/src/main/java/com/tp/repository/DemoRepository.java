package com.tp.repository;

import org.springframework.data.repository.CrudRepository;
import com.tp.model.EntityDemo;

public interface DemoRepository extends CrudRepository<EntityDemo, Long>{
	
}
