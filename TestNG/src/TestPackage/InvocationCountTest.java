package TestPackage;

//import org.testng.annotations.Test;

public class InvocationCountTest {

//	@Test(invocationCount=10)
//	public void sum() {
//		int a= 10;
//		int b= 20;
//		int c= a+b;
//		System.out.println(" sum is summ " + c);
public static void main(String[] args)
{
	
	Abc obj1 = Abc.getInstance();
	Abc obj21 = Abc.getInstance();
	
		
	}
	
	
	class Abc{
		static Abc obj = new Abc();
		private Abc() {
			System.out.println(" jhvc ");
		}
	
		public static Abc getInstance()
		{
			return obj;
		}
		}	

	}

	
	
	
	

