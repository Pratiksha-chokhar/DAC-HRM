package com.springhrms.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

	private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

	@Pointcut("execution(* com.springhrms.service.*.*(..)) ")
	public void serviceGetMethodPointCut() {
	}

	@Before("serviceGetMethodPointCut()")
	public void loggerAdvice(JoinPoint joinPoint) {
		logger.info(joinPoint.getTarget().getClass().getSimpleName() + "'s "
				+ joinPoint.getSignature().getName() + "() method executed");
	}
}
