package com.puneeth;

abstract public class Human 
{
	private String name;
	private int Age;
	
	
	public  void write() {
		System.out.println(" human is  writing ");
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	

	
	}


