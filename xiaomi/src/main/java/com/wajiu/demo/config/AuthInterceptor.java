package com.wajiu.demo.config;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.wajiu.demo.annotation.WajiuLogin;
import com.wajiu.demo.model.User;

public class AuthInterceptor implements HandlerInterceptor {
      
	  @Override
      public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
            // 如果不是映射到方法直接通过
        if (!(handler instanceof HandlerMethod)) {
            return true;
        }
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();
       
       
        // 判断接口是否需要登录
        WajiuLogin methodAnnotation = method.getAnnotation(WajiuLogin.class);
       
        if(methodAnnotation!=null){
            String token =request.getParameter("token");
            
            if(token==null||token.equals("")){
                  throw new RuntimeException("token无效，请重新登录");
            }
            if(!token.equals("123456")){
                  throw new RuntimeException("token无效，请重新登录");
                  
            }else{
                  User user = new User("xiaomi",18,token);
                  request.setAttribute("user", user);
            }
            
        }
       
        return true;
      }

      @Override
      public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
                  throws Exception {
            
      }
      @Override
      public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
                  throws Exception {
      }
}
