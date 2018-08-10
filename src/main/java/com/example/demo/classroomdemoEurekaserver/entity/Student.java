package com.example.demo.classroomdemoEurekaserver.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="student")
public class Student implements Serializable{
	
	private static final long serialVersionUID = 2L;

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer roll;
	
	private String name;

	public Integer getRoll() {
		return roll;
	}

	public void setRoll(Integer roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 
}
