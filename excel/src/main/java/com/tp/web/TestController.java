package com.tp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tp.service.DemoService;
import com.tp.model.EntityDemo;

@RestController
@RequestMapping("/testCon")
public class TestController {
	
	@Autowired
	DemoService demoService;
	
	@RequestMapping("/save")
	public EntityDemo sava(){
		EntityDemo d = new EntityDemo();
		d.setName("mario");
		demoService.sava(d);
		return d;
	}
	
	@RequestMapping("/show")
	public String show(){
		return "Hello World";
	}

}
