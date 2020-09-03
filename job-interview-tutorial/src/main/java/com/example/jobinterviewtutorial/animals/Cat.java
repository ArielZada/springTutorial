package com.example.jobinterviewtutorial.animals;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("cat")
public class Cat implements AnimalSound{
	
	public String makeASound()
	{
		return ("meow!");
	}
}
