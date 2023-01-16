package bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {
	public static void main(String[] args) {
		//
		// Spring의 ApplicationConetext 객체
		// ApplicationConetext객체는 Spring bean의 생명주기, 의존성 주입을 관리하는 객체
		// 스프링안에서 동작하는 객체들의 관계를 관리하는 객체.
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("bean/config.xml");
		
		// config.xml 파일의 bean요소의 id속성으로 받아올 수 있음.
		User anony = (User) context.getBean("anonymous");
		System.out.println(anony);
		
		User hong = context.getBean("hong",User.class);
		System.out.println(hong);
		
		User lee = context.getBean("lee",User.class);
		System.out.println(lee);
	}
}
