package com.wajiu.demo.config;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author mifuxing
 *关于exception的视图渲染
 */
@ControllerAdvice
public class AdviceExceptionHandler {
//      private static Logger log = LoggerFactory.getLogger(AdviceExceptionHandler.class);
      @ExceptionHandler(Throwable.class)
      @ResponseBody
      public Map<String,Object> handlerException(HttpServletRequest request, Exception ex, HttpServletResponse response) {
            Map<String,Object> map = new HashMap<String, Object>();
            map.put("status", 100);
            map.put("msg", ex.getMessage());
        return map; 
    } 
}
