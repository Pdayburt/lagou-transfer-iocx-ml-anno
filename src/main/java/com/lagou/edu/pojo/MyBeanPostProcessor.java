package com.lagou.edu.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("lazyResult".equalsIgnoreCase(beanName)){
            System.out.println("MyBeanPostProcessor before method......拦截处理lazyResult");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if ("lazyResult".equalsIgnoreCase(beanName)){
            System.out.println("MyBeanPostProcessor after method......拦截处理lazyResult");
        }
        return bean;
    }
}
