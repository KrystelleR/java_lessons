public class CatchingEg3 {
	public void doSomething() throws Exception{
		int i = 29;
		
		if(i > 30){
			throw new Exception("An error occurred");
		}
		System.out.println("Doing something...");
	}
}
