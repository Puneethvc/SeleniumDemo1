interface Demo{

		void abc();
		static void show() {
			System.out.println( " in demo show ");
		}
	}

interface MyDemo{
		default void show() {
			System.out.println( " in my demoshow ");
		}
	}

class demoimpl  implements Demo,MyDemo {
	public void abc() {
		System.out.println(" asdff "); 
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		Demo.super.show();
	}
	
}
public class InterfaceDemo{
	public static void main (String [] args) {
	
		Demo.show();
	}
}