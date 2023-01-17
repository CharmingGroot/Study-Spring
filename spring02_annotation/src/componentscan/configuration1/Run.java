package componentscan.configuration1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Run {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext("configuration");
		
		Book harry = context.getBean("lon", Book.class);
		System.out.println(harry);
		
	}

}
