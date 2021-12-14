package com.VtigerGenric;

import java.util.Random;
 /**
  *@author dell
  *Description 
  */

import com.github.javafaker.Faker;

public class javafaker {
	public static javafaker objForJavautil() {
		javafaker jv = new javafaker();
		return jv;
	}

	public int genrateRandomNubmer() {
		Random r = new Random();
		return r.nextInt(1000);
	}

	public String getFullName() {
		Faker faker = new Faker();
		return faker.name().fullName();
	}

	public String getFistName() {
		Faker faker = new Faker();
		return faker.name().firstName();
	}

	public String getLastName() {
		Faker faker = new Faker();
		return faker.name().lastName();
	}
	
	public String getphonenumber() {
		Faker faker = new Faker();
		return faker.phoneNumber().cellPhone();
	}


}