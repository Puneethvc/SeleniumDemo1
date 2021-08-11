package com.puneeth;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Demo1();
		Demo2();
		Startnow();
	}

	public static void Demo1() {

		try {

			System.out.println("Hello");
		} catch (Exception e)

		{
			System.out.println("Bye");
		}

		finally {
			System.out.println("Bye");
		}
	}

	public static void Demo2() {

		try {
			System.out.println(" in side sing song ");
		} catch (Exception e) {
			System.out.println(" out  side writing anual exams ");

		} finally {
			System.out.println(" having fun ");

		}
	}

	public static void Startnow() {

		int i=1;
		int j=5;
		double d  = (i/j);
		
		try {
			System.out.println( " value of double  is + " );
			
		}
		catch ( Exception e)
		{
			System.out.println( " out of bound value ");
			
			
		}
		finally {
			System.out.println( " the great  value ");
		}
	}

}
