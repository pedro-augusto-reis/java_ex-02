package com.github.pedroaugustoreis.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

    @Pointcut("@annotation(com.github.pedroaugustoreis.springaop.aspect.TrackTime)")
    public void trackTimeAnnotation(){}
}
