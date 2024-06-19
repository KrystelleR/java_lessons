package package2;
import package1.Parent;

public class Child extends Parent{

	public Child(){

	}

	public Child(String a, String b){
		super(a, b);
	}

	public Child(String a, String b, String c){
		this(a, b);
	}

	protected static void myMethod2(){
		Parent.myMethod1();
		System.out.println("I am a child.");
	}

	protected static void child(){
		Parent.family();
		System.out.println("we are family.");
	}
}