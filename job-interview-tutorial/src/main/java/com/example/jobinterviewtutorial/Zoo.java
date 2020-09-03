package com.example.jobinterviewtutorial;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.example.jobinterviewtutorial.animals.AnimalSound;
import com.example.jobinterviewtutorial.employees.Employee;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Zoo {
	Logger logger = LoggerFactory.getLogger(JobInterviewTutorialApplication.class);

	private static final String name = "dog"; 
	@Autowired
	@Qualifier(name)
	AnimalSound animalSound;
	
	@Autowired
	Employee employee;
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Zoo(AnimalSound animalSound)
	{
		super();
		this.animalSound = animalSound;
		logger.info("in Constructor");

	}
	public Zoo()
	{
		logger.info("in default Constructor");
	}
	
	public String animalSound()
	{
		return animalSound.makeASound();
	}
	
	@PostConstruct
	public void postConstruct ()
	{
		logger.info("in postConstruct");
	}
	
	@PreDestroy
	public void preDestroy ()
	{
		logger.info("in preDestroy");
	}
}
