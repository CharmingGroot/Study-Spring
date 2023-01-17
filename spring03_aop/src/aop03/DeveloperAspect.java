package aop03;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


// @Aspect 어노테이션을 붙이면 @Aspect 표현식을 사용할 수 있음
@Component
@Aspect
public class DeveloperAspect {

	
	@Before("execution(* aop03.*.*(..))")
	public void before() {
		System.out.println("출근 카드를 찍는다.");
	}

	@After("execution(* aop03.*.*(..))")
	public void after() {
		System.out.println("집에간다");
	}
	
	// 성공했을 때
	@AfterReturning(pointcut = "execution(* aop03.*.*(..))", returning = "res")
	public void afterReturning(Object res) {
		System.out.println(res);
		System.out.println("퇴근을 한다.");
	}
	
	
	// 실패했을 때
	@AfterThrowing(pointcut = "execution(* aop03.*.*(..))", throwing = "ex")
	public void afterThrowing(Exception ex) {
		System.out.println(ex.getMessage());
		System.out.println("쉬는날 이었다");
	}

	
}
