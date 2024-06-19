public class LambdaRunnable{
	public static void main(String[] args) {
		Runnable printName = () -> {
			for(int i =0; i <5; i++){
			System.out.println("Krystelle");
			}
		};

		printName.run();
	}
}