package com.wajiu.demo.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wajiu.demo.annotation.WajiuLogin;
import com.wajiu.demo.model.User;

@RestController
@RequestMapping
public class LoginRestController {
	
      @WajiuLogin
      @RequestMapping(value="login")
      public Map<String, Object> login(HttpServletRequest request){
            Map<String,Object> map = new HashMap<String,Object>();
            User user =(User) request.getAttribute("user");
            map.put("user", user);
            return map;
      }
}
