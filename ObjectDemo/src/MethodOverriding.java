class Animal{
	 public void eat() {
		System.out.println( " eating ");
	}
}
class Dog extends Animal{
	public void eat() {
		System.out.println( " eating bread ");
		}
}
class Cat extends Animal{
	  public void eat() {
		System.out.println( " eating rat ");
		}
}
class Lion extends Animal{
	public void eat() {
		System.out.println( " eating meat ");
	}
}

public class MethodOverriding{
	public static void main(String[] args) { 
		
		Animal a1 = new Dog() ;
		a1.eat();
		
		a1 = new Cat();
		a1.eat();
		
		a1 = new Lion();
		a1.eat();
		
	
	}
} 