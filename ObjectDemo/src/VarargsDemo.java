	class Vararg{
		
		public int add ( int ...n) {
			int sum=0;
			for(int i:n) {
				sum=sum+i;
			}
			return sum;
		}
		
	}
	
	public class VarargsDemo {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		
	    Vararg obj = new Vararg(); 
				
		System.out.println( obj.add( 2,3,4,5));
	 
	}
}