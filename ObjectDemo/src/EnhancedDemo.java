
public class EnhancedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1,2,3,4};
		int b[] = { 2,3,4,5};
		int c [] = { 3,4,5,6};
		
		int d[][] = {
				{3,4,5,6},
				{4,6,7},
				{5,6,7,8,9}
		};
		
//		for(int p:a) {
//			System.out.print(" " + p);
//		}
	 
		for (int k[]:d)
		{
			for (int l:k)
			{
				System.out.print( "  " + l);
			}
			
			System.out.println();
			}
	
	}	

}
