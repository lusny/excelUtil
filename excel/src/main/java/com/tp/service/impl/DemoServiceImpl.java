package com.tp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tp.dao.DemoDao;
import com.tp.model.DemoModel;
import com.tp.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService{
	
	@Autowired
	DemoDao demoDao;
	
	@Override
	public void sava(DemoModel demoModel){
		demoDao.save(demoModel);
	}

	@Override
	public List<DemoModel> show(int id) {
		return demoDao.show(id);
	}

}
