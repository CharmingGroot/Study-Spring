package aop03;

import org.springframework.stereotype.Component;

@Component
public class Woman implements Developer{

	@Override
	public String develop() {
		return "자바스크립트로 개발한다.";
		
	}

	@Override
	public void play() {
		System.out.println("맛집을  간다");
		
	}
	
	
}
