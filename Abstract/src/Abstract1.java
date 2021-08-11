	interface Subjects{
	
	 void subject (); 
	 
	   }
	
	class kanna implements Subjects
	{
		 public void subject () 
		 {
			System.out.println( " read engg ");
		   }
	}
		
	
	class Engg implements  Subjects
	{
		 public void subject () 
		 {
			System.out.println( " read kannada ");
		   }
		}
	class ki 
	{
		public void readsomething(Subjects s)
		{
		s.subject();
	}
	}
	public class Abstract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ki k =  new ki();
		
		Subjects e = new Engg();
		
		k.readsomething(e);
	}

}
