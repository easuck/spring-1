package com.example.task1;

import com.example.task1.Entities.Ason;
import com.example.task1.Entities.Vanya;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Task1Application {

	public static void main(String[] args) {
		SpringApplication.run(Task1Application.class, args);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml"
		);

		Ason ason = context.getBean("ason", Ason.class);
		Vanya vanya = context.getBean("vanya", Vanya.class);
		ason.printAge();
		vanya.printAge();
		vanya.printJob();
	}

}
