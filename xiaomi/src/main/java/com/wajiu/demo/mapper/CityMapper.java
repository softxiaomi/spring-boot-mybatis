package com.wajiu.demo.mapper;

import java.util.List;

import com.wajiu.demo.model.City;
import com.wajiu.demo.utils.MyMapper;

public interface CityMapper extends MyMapper<City> {
	
	List<City> selectParamAll();
}
