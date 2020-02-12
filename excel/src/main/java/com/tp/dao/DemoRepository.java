package com.tp.dao;

import org.springframework.data.repository.CrudRepository;
import com.tp.model.DemoModel;

public interface DemoRepository extends CrudRepository<DemoModel, Long>{
	
}
