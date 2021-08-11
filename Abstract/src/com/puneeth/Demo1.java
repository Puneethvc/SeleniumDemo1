package com.puneeth;

public class Demo1 extends Human 
{
	
	 private int rollno;
	 private int marks;
	 
	 public  void write(String name) {
			System.out.println(" Demo1 is  writing " + name); 	
			}
	 
	

	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	


public void setmarks(int m) {
	
	if (m>=0)
	marks=m;
	else
		marks=0;
}
	
	
	public double getpercent() {

	return ( marks*1.0/625)*100;
		
}

		
	
	}
	
