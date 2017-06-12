package com.wajiu.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.wajiu.demo.mapper.CityMapper;
import com.wajiu.demo.model.City;

@Service
public class CityService {
    @Autowired
    private CityMapper cityMapper;
    
    public List<City> selectParamAll(){
        return cityMapper.selectParamAll();
    }

   
    public List<City> getAll(City city) {
        if (city.getPage() != null && city.getRows() != null) {
            PageHelper.startPage(city.getPage(), city.getRows());
        }
        return cityMapper.selectAll();
    }
    public City getById(Integer id) {
        return cityMapper.selectByPrimaryKey(id);
    }
    public void deleteById(Integer id) {
        cityMapper.deleteByPrimaryKey(id);
    }
    public void save(City country) {
        if (country.getId() != null) {
            cityMapper.updateByPrimaryKey(country);
        } else {
            cityMapper.insert(country);
        }
    }
}
