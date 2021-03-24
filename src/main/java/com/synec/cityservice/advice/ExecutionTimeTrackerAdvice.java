package com.synec.cityservice.advice;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class ExecutionTimeTrackerAdvice {

    @Around("@annotation(com.synec.cityservice.advice.ExecutionTimeTracker)")
    public Object trackTime(ProceedingJoinPoint pjp) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object obj = pjp.proceed();
        long endTime = System.currentTimeMillis();
        log.info(pjp.getTarget().getClass().getName() + "." + pjp.getSignature().getName() + ": " + (endTime - startTime) + " msec");
        return obj;
    }
}
