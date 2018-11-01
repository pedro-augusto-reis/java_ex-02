package com.github.pedroaugustoreis.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

// AOP
// Configuration
@Configuration
@Aspect
public class AfterAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    // What kind of methods calls I would intercept
    // which method do you want to intercept
    // execution(* PACKAGE.*.*(..))

    @After("execution(* com.github.pedroaugustoreis.springaop.business.*.*(..))")
    public void after(JoinPoint joinPoint){
        // what to do?
        logger.info("after execution of {}", joinPoint);
    }

    @AfterReturning(
            value="execution(* com.github.pedroaugustoreis.springaop.business.*.*(..))",
            returning="result")
    public void afterReturning(JoinPoint joinPoint, Object result){
        // what to do?
        logger.info("{} returned with value {}", joinPoint, result);
    }

    // intercept any exception that may be thrown
    @AfterThrowing(
            value="execution(* com.github.pedroaugustoreis.springaop.business.*.*(..))", throwing = "exception")
    public void afterThrowing(JoinPoint joinPoint, Exception exception){
        // what to do?
        logger.info("returned with value {}", joinPoint);
    }

}
