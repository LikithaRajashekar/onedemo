package com.springboothibsqlapplication.entity;

import javax.persistence.CascadeType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Passport")
public class Passport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name="issueplace")
	private String issueplace;
	
	@Column(name="issuecountry")
	private String issuecountry;
	
	@OneToOne(fetch=FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "passport")
	private Person person;
	
	public Passport() {
		
	}
	
	
	public Passport(String name, String issueplace, String issuecountry) {
		super();
		this.name = name;
		this.issueplace = issueplace;
		this.issuecountry = issuecountry;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIssueplace() {
		return issueplace;
	}
	public void setIssueplace(String issueplace) {
		this.issueplace = issueplace;
	}
	public String getIssuecountry() {
		return issuecountry;
	}
	public void setIssuecountry(String issuecountry) {
		this.issuecountry = issuecountry;
	}
	
	public Person getperson() {
		return person;
	}
	
	public void setperson(Person person) {
		this.person = person;
	}

}
