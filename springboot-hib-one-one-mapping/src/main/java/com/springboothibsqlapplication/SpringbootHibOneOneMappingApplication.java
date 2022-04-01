package com.springboothibsqlapplication;

import java.time.LocalDate;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboothibsqlapplication.entity.Passport;
import com.springboothibsqlapplication.entity.Person;
import com.springboothibsqlapplication.repository.PassportRepository;
import com.springboothibsqlapplication.repository.PersonRepository;

@SpringBootApplication
public class SpringbootHibOneOneMappingApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHibOneOneMappingApplication.class, args);
	}

	@Autowired
	private PersonRepository personRepository;
	
	@Autowired
	private PassportRepository passportRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		//person object
	//Person person = new Person();
		//person.setName("Likitha");
	//	person.setBirthOfDate(LocalDate.of(1999, 10, 26));
		
	//	//passport
	//	Passport passport = new Passport();
	//	passport.setName("Likitha");
	//	passport.setIssueplace("Bangalore");
	//	passport.setIssuecountry("India");
		
		//add
	//	person.setPassport(passport);
	//	passport.setperson(person);
		
	//	personRepository.save(person);
		
		//Person person = new Person();
		//person.setName("naga");
		//person.setBirthOfDate(LocalDate.of(1999, 07, 26));
		
		//passport
		//Passport passport = new Passport();
		//passport.setName("naga");
		//passport.setIssueplace("new york");
		//passport.setIssuecountry("usa");
		
		//add
		//person.setPassport(passport);
		//passport.setperson(person);
		
		//personRepository.save(person);
		
	//	Person person = new Person();
	//	person.setName("Lucky");
	//	person.setBirthOfDate(LocalDate.of(2000, 05, 10));
		
		//passport
	//	Passport passport = new Passport();
	//	passport.setName("Lucky");
	//	passport.setIssueplace("chennai");
	//	passport.setIssuecountry("India");
		
		//add
	//	person.setPassport(passport);
	//	passport.setperson(person);
		
	//	personRepository.save(person);
		
		
			
		}
	}
	
	


