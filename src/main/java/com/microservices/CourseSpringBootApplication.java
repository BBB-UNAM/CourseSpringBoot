package com.microservices;

import com.microservices.services.InterfacePeopleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseSpringBootApplication implements CommandLineRunner {

	private static Logger LOG =  LoggerFactory.getLogger(CourseSpringBootApplication.class);
	@Autowired
	private InterfacePeopleService service;
	public static void main(String[] args) {
		SpringApplication.run(CourseSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//System.out.println("Hola coders desde spring boot consola");
		//LOG.info("Hola coders desde spring boot consola");
		LOG.warn("advirtiendo algo");

		//service = new PeopleServiceImpl();
		service.register("This text must be displayed ion the log");
	}
}
