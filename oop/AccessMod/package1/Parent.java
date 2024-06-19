package package1;
public class Parent {

	public Parent(){
			
	}

	public Parent(String a, String b)  throws NumberFormatException{
		System.out.println("I am a Parent constructor");
	}

	protected static void family(){
		System.out.println("I am a parent.");
	}

	protected static void myMethod1(){
		System.out.println("I belong here.");
	}
}