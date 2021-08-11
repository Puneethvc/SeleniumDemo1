abstract class Writer{
	public abstract void write() ; 
}

class Pen extends Writer{
	
	public void write() {
	
		System.out.print( " writing using PEN ");
	}
}

class Pencil extends Writer {
	public void write() {
		System.out.println( " writing using PENCIL ");
	}
} 

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Writer obj = new Pencil();
		obj.write();
	}

}