package tn.esprit.tpfoyer.Config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class AOPConfig {
    @Before("execution(* tn.esprit.tpfoyer.Services.*.*(..))")
    public void logMethodEntry( JoinPoint joinPoint) {
        log.info("Entering in Method :  " + joinPoint.getSignature().getName());
        log.info("Class Name :  " + joinPoint.getSignature().getDeclaringTypeName());
        log.info("Arguments :  " + joinPoint.getArgs());
        log.info("Target class : " + joinPoint.getTarget().getClass().getName());
    }
    @After("execution(* tn.esprit.tpfoyer.Services.*.*(..))")
    public void logMethodExit(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("Exiting method: " + name);
        log.info("Exiting method: " + joinPoint.getSignature().getName());
        log.info("Exiting method: " + joinPoint.getSignature().getDeclaringTypeName());
        log.info("Exiting method: " + joinPoint.getArgs());
        log.info("Exiting method: " + joinPoint.getTarget().getClass().getName());

    }

    }
