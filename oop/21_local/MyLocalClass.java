public class MyLocalClass{
	public static void main(String[] args) {
		MyLocalClass obj = new MyLocalClass();
		obj.print1();
	}
	//void method
	public void print1(){
		System.out.println("Printing 1");
	}
	//constructor
	public MyLocalClass(){
		System.out.println("Constructing class");
	}
	//static instance initializer
	static String name(){
		System.out.println("static instance initializer");
		return "Krystelle";
	}
	//instance initializer
	String surname(){
		System.out.println("instance initializer");
		return "Rupnarain";
	}
	public static void age(){
		//ordinary block within method
		{
			System.out.println("My age is 21");
		}
	}
}