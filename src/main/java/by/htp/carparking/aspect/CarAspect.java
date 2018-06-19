package by.htp.carparking.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CarAspect {

	/*@Before("execution(public String getCars())")
	public void getNameAdvice() {
		System.out.println("Executing Advice on getCars()");
	}*/
//	@Pointcut("within(@org.springframework.stereotype.Controller *)")
//	public void controller() {
//	}

	@Before("execution(* by.htp.carparking.service.impl.CarServiceImpl.getCars(..))")
	public void doSmth() {
		System.out.println("-------------------------------");
		System.out.println("Service method getCars() called");
	}

}
