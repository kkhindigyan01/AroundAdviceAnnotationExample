package com.kkhindigyan.org.service.aop;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.kkhindigyan.org.model.Account;

@Aspect
@Component
public class AccountServiceAspect {

	private static Log log =  LogFactory.getLog(AccountServiceAspect.class.getName());
	
	@Around(value = "selectAll()")
	public void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		log.info("Before Method:"+proceedingJoinPoint.getSignature());
		
		try {
			Object object = proceedingJoinPoint.proceed();
			if( object instanceof Account) {
				System.out.println((Account)object);
			}
		} catch (Throwable e) {
			log.error("There is an exception :"+e.toString());
		}
		log.info("After Method:"+proceedingJoinPoint.getSignature());
	}
	
	@Pointcut("execution(* com.kkhindigyan.org.service.impl.AccountServiceImpl.*(..))")
	public void selectAll() {
		
	}
}
