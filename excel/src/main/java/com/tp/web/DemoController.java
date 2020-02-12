package com.tp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tp.service.DemoService;
import com.tp.model.DemoModel;

@RestController
@RequestMapping("/demo")
public class DemoController {
	
	@Autowired
	DemoService demoService;
	
	@RequestMapping("/save")
	public DemoModel sava(){
		DemoModel d = new DemoModel();
		d.setName("mario");
		demoService.sava(d);
		return d;
	}
	
	@RequestMapping("/show")
	public List<DemoModel> show(int id){
		return demoService.show(id);
	}

}
