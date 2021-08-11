package com.puneeth;

public class Demo2 extends Human
{
	 
	 private int teid;
	 private int salary;
	 
	 public  void write(int num) {
			System.out.println(" Demo2 is  writing " +num );
			
		}
	 
	 

	public int getTeid() {
		return teid;
	}



	public void setTeid(int teid) {
		this.teid = teid;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	


	



	public int annaulsalary()
	{
	return salary*12;
		}
	
}

 