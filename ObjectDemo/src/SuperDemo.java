class Coin1 {
	public Coin1() {
		System.out.println( "huge maintance" );
	}
	public Coin1 ( String m1) {
		System.out.println( " cannot carry more " + m1 );
	}
}
	
class Coin2 extends Coin1 {
		public Coin2() {
			
			System.out.print(" diffucult ");
		}
		public Coin2( String m2 ) {
			super(" 3  ");
			System.out.println( " easy handling " + m2 );		
		}
	}
		
	 

 
public class SuperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A objA = new A();
		Coin2 r1 = new Coin2("  ");
		
	}

}
