import package2.Child;
public class Main extends Child{
	public static void main(String[] args) {
		Child child = new Child("a", "b", "c");
		Child.myMethod1();
		Child.myMethod2();
		Child.child();
		Child.family();
	}
}