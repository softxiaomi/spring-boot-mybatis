package com.wajiu.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class IndexRestController {
      @RequestMapping
      public String demo(){
            return "hello world";
      }
}
