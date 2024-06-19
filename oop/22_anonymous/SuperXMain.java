public class SuperXMain {
	public static void main(String[] args) {
		ConcreteSuperX superX = new ConcreteSuperX(){
			public void doSomething() {
				System.out.println("Doing something ...");
			}
		};
		
		superX.doSomething();
	}
}
