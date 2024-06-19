public class MyLambda{
	public static void main(String[] args) {
		MyInterface1 myInterface1 = ()->{
			System.out.println("implementation complete");
		};
		myInterface1.testingLambdas();
	}
}