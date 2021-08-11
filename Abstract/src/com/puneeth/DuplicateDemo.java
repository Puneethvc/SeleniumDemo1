package com.puneeth;



public class DuplicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String names[] = {" java "," python ", " c ", " javascript ", " java " };  
		
		for ( int i=0;i<names.length;i++) {
			
			for ( int j=0;j<i;j++) {
				
//				System.out.println(names[i]);
//				System.out.println(names[j]);
//				
				if (names[i] == names[j] ) {
					
					System.out.println(" duplicate elements is : " + names[j]);
				}
			}
		}
	 

	}}
