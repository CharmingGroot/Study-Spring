package aop02;

import org.springframework.stereotype.Component;

@Component
public class Man implements Developer{

	@Override
	public void develop() {
		System.out.println("자바로 개발한다.");
		
	}

	@Override
	public void play() {
		System.out.println("풋살 하고 논다");
		
	}
	
	
}
