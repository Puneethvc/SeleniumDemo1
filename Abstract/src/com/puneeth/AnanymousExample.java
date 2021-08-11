	package com.puneeth;
	
	 class A
	{
		public void show () {
			System.out.println( " an empty ");
		}
		
	}
	 
	public class AnanymousExample {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	
			
			A obj = new A()
					{
				public void show() {
					  System.out.println( " im goood ");
				
					}
					};
			obj.show();
		}
	
	}
