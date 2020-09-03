package com.example.jobinterviewtutorial.animals;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("dog")
public class Dog implements AnimalSound{
	
	public String makeASound()
	{
		return ("Bark!");
	}
}
