package componentscan;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;


// @Component : Spring의 Application Context에 @Component가 선언된 클래스의 인스턴스를 자동으로 bean에 추가
//				bean의 id는 타입명을 따라간다. Logger => logger
//				value 속성을 지정할 경우 id가 value값이 된다.


// Component : 구성요소. Spring Application 의 전체적인 구조의 구성요소 역할을 하는 클래스를 bean으로 등록할 때 사용
// Component 어노테이션을 사용해 등록한 bean은 Spring 어플리케이션의 어디에서 호출하든 늘 같은 객체가 반환




@Component(value = "warn")
public class Logger {
	
	public void warn(String msg) {
		System.out.println("[system:wran]" + LocalDateTime.now() + " : "+ msg);
	}
}
