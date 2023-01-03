package com.siva.goal.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Slf4j
@Component
public class GeneralAspect {

    //For all classes and methods of all argument type inside restcontoller folder
    @Pointcut("execution(* com.siva.goal.restcontroller.*.*(..))")
    public void loggingPointCut() {

    }

    @Before("loggingPointCut()")
    public void beforeAdvice(JoinPoint joinPoint) {
        log.info("Before method invoke:: " + joinPoint.getSignature());
    }

    @After("loggingPointCut()")
    public void afterAdvice(JoinPoint joinPoint) {
        log.info("After method invoke:: " + joinPoint.getSignature());
    }

}
