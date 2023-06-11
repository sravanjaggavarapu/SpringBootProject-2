package com.pack.secondproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		Operations operations = context.getBean("operations", Operations.class);
		operations.add();
		operations.mul();
		Book book = context.getBean("book", Book.class);
		System.out.println(book.getBookId() + " " + book.getBookName() + " " + book.getBookAuthor());
	}
}
