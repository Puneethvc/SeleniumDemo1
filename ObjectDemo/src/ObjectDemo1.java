

class calc{
	
	int num1 ;
	int num2 ;
    int sum ;
    int diff;
    int quo;
    int prod;
    int rem;
    public void add()
    {
    	sum = num1 + num2;
    	diff= num2 - num1;
    	quo = num1 / num1;
    	prod = num1* num1;
    	rem = num2 % num1;
    }
			
}


public class ObjectDemo1 {

  public static void main ( String [] args ) {
 
	  calc obj = new calc();
	  
	  obj.num1 = 10;
	  obj.num2 = 20;
	  
	  obj.add();
	  
	  System.out.println(obj.sum);
	  System.out.println(obj.diff);
	  System.out.println(obj.quo);
	  System.out.println(obj.prod);
	  System.out.println(obj.rem);
}
}