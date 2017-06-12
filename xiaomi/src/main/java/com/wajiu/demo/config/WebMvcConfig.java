package com.wajiu.demo.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }
    
    @Bean
    public AuthInterceptor authenticationInterceptor() {
        return new AuthInterceptor();
    }
    
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
          registry.addInterceptor(authenticationInterceptor()).addPathPatterns("/**");   
      super.addInterceptors(registry);
    }


}
