package com.Microservices.ProducerService.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* com.Microservices.ProducerService.Service.*.*(..))")
    public void logBeforeServiceMethods(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        logger.info("Method '{}' called with arguments: {}", methodName, args);
    }

    @AfterReturning(pointcut = "execution(* com.Microservices.ProducerService.Service.*.*(..))", returning = "result")
    public void logAfterReturningServiceMethods(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();
        logger.info("Method '{}' returned: {}", methodName, result);
    }

}
