package com.example.jobinterviewtutorial.employees;

import org.springframework.stereotype.Component;

@Component
public class Visitor implements Proffesion {

	@Override
	public String whoAmI() {
		return "im visiting here";
	}

}
