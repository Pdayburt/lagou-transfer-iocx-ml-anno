package com.lagou.edu.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author 应癫
 */
@Component("lazyResult")
public class Result implements BeanNameAware , BeanFactoryAware , ApplicationContextAware, InitializingBean , DisposableBean {

    private String status;
    private String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Result{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("注册我成为bean的id为：" + name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("管理我的beanFactory为：" + beanFactory);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("高级容器接口ApplicationContext=====》" + applicationContext);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("=====lazyResult  afterPropertiesSet======");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("=====lazyResult  destroy======");
    }


//    @PostConstruct
//    public void initMethod(){
//        System.out.println("========lazyResult initMethod=====");
//    }
}
