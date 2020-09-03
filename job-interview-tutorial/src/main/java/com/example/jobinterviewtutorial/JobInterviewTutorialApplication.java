package com.example.jobinterviewtutorial;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JobInterviewTutorialApplication {

	public static void main(String[] args) {

		Logger logger = LoggerFactory.getLogger(JobInterviewTutorialApplication.class);
		ConfigurableApplicationContext applicationContext = SpringApplication.run(JobInterviewTutorialApplication.class, args);
		Zoo zoo = applicationContext.getBean(Zoo.class);
		Zoo zoo2 = applicationContext.getBean(Zoo.class);
		logger.info("{}",zoo);
		logger.info("{}",zoo2);
		logger.info("{}",zoo.getEmployee());
		logger.info("{}",zoo2.getEmployee());
		logger.info("{}",zoo.animalSound());
	}

}
