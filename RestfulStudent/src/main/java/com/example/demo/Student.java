package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "result1")
	private float result1;
	
	@Column(name = "result2")
	private float result2;
	
	@Column(name = "result3")
	private float result3;
	
	@Column(name = "GPA")
	private float GPA;

	/**
	 * 
	 */
	public Student() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param name
	 * @param result1
	 * @param result2
	 * @param result3
	 */
	public Student(String name, float result1, float result2, float result3) {
		super();
		this.name = name;
		this.result1 = result1;
		this.result2 = result2;
		this.result3 = result3;
	}
	
	public Student(String name, float result1, float result2, float result3, float GPA) {
		super();
		this.name = name;
		this.result1 = result1;
		this.result2 = result2;
		this.result3 = result3;
		this.GPA = (result1 + result2 + result3)/3;
	}
	
	

	public float getGPA() {
		return GPA;
	}

	public void setGPA(float gPA) {
		GPA = (result1 + result2 + result3)/3;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getResult1() {
		return result1;
	}

	public void setResult1(float result1) {
		this.result1 = result1;
	}

	public float getResult2() {
		return result2;
	}

	public void setResult2(float result2) {
		this.result2 = result2;
	}

	public float getResult3() {
		return result3;
	}

	public void setResult3(float result3) {
		this.result3 = result3;
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", result1=" + result1 + ", result2=" + result2 + ", result3="
				+ result3 + "]";
	}
}
