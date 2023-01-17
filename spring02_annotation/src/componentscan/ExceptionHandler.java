package componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "ex")
public class ExceptionHandler {
	
	
	// @Autowired : Spring의 bean중에서 @Autowired 어노테이션이 지정된 레퍼런스의 타입에 맞는 bean을 찾아서 자동으로 주입해준다.
	//			생성자의 선언부에 선언하면 생성자의 매개변수를 통해 의존성을 주입받게 된다.
	//			생성자를 통해 필드를 주입받는 것을 권장함.
	// @Qualifier : @Qualifier로 의존성 주입을 받을 때, 해당 타입의 빈이 여러개 있을 경우 빈의 id를 명시하여 특정 빈을 주입한다.
//	@Autowired
//	@Qualifier("warn")
	private Logger logger;
	// @Autowired안쓰면 NullPoionterException발생함
	
	
	
	public void handle(Exception e) {
		logger.warn(e.getMessage());
		System.out.println(e.getMessage() + "를 개발자에게 전송합니다 ");
	}
	
	// 이렇게 쓰는게 좋다. 안정성 측면에서.
	@Autowired
	public ExceptionHandler(Logger logger) {
		super();
		this.logger = logger;
		System.out.println("ExceptionHandler의 매개변수가 있는 생성자를 통해 빈 생성");
	}
}
