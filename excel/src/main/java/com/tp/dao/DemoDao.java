package com.tp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.tp.model.DemoModel;

@Mapper
public interface DemoDao {
	void save(DemoModel demoModel);
	List<DemoModel> show(int id);
}
