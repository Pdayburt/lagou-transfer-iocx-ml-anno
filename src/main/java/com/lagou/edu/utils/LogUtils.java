package com.lagou.edu.utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
@Aspect
@EnableAspectJAutoProxy
public class LogUtils {

    @Pointcut("execution(* com.lagou.edu.service.impl.TransferServiceImpl.*(..))")
    public void pt1(){}

    @Before("pt1()")
    public void beforeMethod(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        Arrays.stream(args).forEach(System.out::println);
        System.out.println("业务逻辑执行之前执行。。。。。。");
    }


    @After("pt1()")
    public void afterMethod(){
        System.out.println("业务逻辑执行之后执行，无论异常与否都执行。。。。。。");
    }

    @AfterThrowing("pt1()")
    public void methodException(){
        System.out.println("业务逻辑异常之后执行。。。。。。");
    }

    @AfterReturning(value = "pt1()",returning = "retVal")
    public void methodSuccess(Object retVal){
        System.out.println("业务逻辑正常时执行。。。。。。");
    }

//    @Around("pt1()")
    public void aroundMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object proceed = proceedingJoinPoint.proceed();

        System.out.println("环绕执行。。。。。。");
    }
}
