package com.github.pedroaugustoreis.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

// AOP
// Configuration
@Configuration
@Aspect
public class UserAccessAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    // What kind of methods calls I would intercept
    // which method do you want to intercept
    // execution(* PACKAGE.*.*(..))

    @Before("execution(* com.github.pedroaugustoreis.springaop.business.*.*(..))")
    public void before(JoinPoint joinPoint){
        // what to do?
        logger.info("Check for user access ");
        logger.info("Allowed execution for {}", joinPoint);
    }

}
