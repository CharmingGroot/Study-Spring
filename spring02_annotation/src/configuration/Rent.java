package configuration;

import org.springframework.beans.factory.annotation.Autowired;

public class Rent {
	@Autowired
	private User user;
	@Autowired
	private Book book;
	
	public Rent(User user, Book book) {
		super();
		this.user = user;
		this.book = book;
	}

	public Rent() {
		// TODO Auto-generated constructor stub
	}

	public void info() {
		System.out.println(user.getName() + "이"+ book.getTitle() + "을 대여하였습니다");
	}
}
