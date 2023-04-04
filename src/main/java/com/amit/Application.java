package com.amit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.amit.repo.BookRepository;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		BookRepository repo = ctx.getBean(BookRepository.class);

		//repo.insertBook(104,"py",456.00);
		
		repo.updateBookName(102, "vue");
		
		//repo.deleteBookId(101);
	}
}
