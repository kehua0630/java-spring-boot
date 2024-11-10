/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.springboots;

import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 *
 * @author kehuachao
 */
// @Aspect:和@Component一起使用，加在class上，用來宣告該class是個切面
@Aspect
@Component
public class MyAspect {

    // 切入點：CannonPrinter裡的所有方法
    // Around: 在切入點的方法前&後執行
    @Around("execution(* com.example.springboots.CannonPrinter.*(..))")
    public Object around(ProceedingJoinPoint pip) throws Throwable {
        System.out.println("Around After(Aspect)::");
        Date start = new Date();
        // 執行切入點的方法(ex. CannonPrinter的print)
        Object obj = pip.proceed();
        Date end = new Date();

        long duration = end.getTime() - start.getTime();
        System.out.println("Around After(Aspect)::");
        System.out.println("total duration::" + duration + " ms");
        return obj;
    }

    // Before: 在切入點的方法前執行
    @Before("execution(* com.example.springboots.CannonPrinter.*(..))")
    public void before() {
        System.out.println("Before(Aspect)::");
    }

    // After: 在切入點的方法後執行
    @After("execution(* com.example.springboots.CannonPrinter.*(..))")
    public void after() {
        System.out.println("After(Aspect)::");
    }

}
