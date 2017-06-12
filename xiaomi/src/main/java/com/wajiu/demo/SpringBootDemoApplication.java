package com.wajiu.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.wajiu.demo.utils.MyMapper;

@EnableWebMvc
@SpringBootApplication
@MapperScan(basePackages = "com.wajiu.demo.mapper", markerInterface = MyMapper.class)
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
}
