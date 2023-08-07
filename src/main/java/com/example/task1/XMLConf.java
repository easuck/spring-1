package com.example.task1;

import com.example.task1.XMLConfiguration.Ason;
import com.example.task1.XMLConfiguration.Vanya;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class XMLConf {

	public static void main(String[] args) {
		SpringApplication.run(XMLConf.class, args);
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
