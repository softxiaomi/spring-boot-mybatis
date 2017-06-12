package com.wajiu.demo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
//被保护的类
@Retention(RetentionPolicy.RUNTIME)
public @interface WajiuLogin {
}
