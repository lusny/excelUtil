package com.tp.service;
import java.util.List;

import com.tp.model.DemoModel;

public interface DemoService {
	
	void sava(DemoModel demoModel);
	List<DemoModel> show(int id);
}
