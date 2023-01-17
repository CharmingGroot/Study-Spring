package aop03;

import org.springframework.stereotype.Component;

@Component
public class Man implements Developer{

	@Override
	public String develop() {
		return "자바로 개발한다.";
		
	}

	@Override
	public void play() {
		System.out.println("풋살 하고 논다");
		
	}
	
	
}
