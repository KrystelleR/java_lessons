public class CatchingEg3 {
	public void doSomething() throws RupnarainException{
		int i = 42;
		
		if(i > 30){
			throw new RupnarainException("An error occurred");
		}
		System.out.println("Doing something...");
	}
}
