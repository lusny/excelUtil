package com.tp.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tp.repository.DemoRepository;
import com.tp.service.DemoService;
import com.tp.model.EntityDemo;

@Service
public class DemoServiceImpl implements DemoService{
	
	@Resource
	DemoRepository demoRepository;
	
	@Override
	public void sava(EntityDemo entityDemo){
		demoRepository.save(entityDemo);
	}

}
