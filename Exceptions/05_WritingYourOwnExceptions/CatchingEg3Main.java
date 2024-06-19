public class CatchingEg3Main {
	public static void main(String[] args) {
		try{
			CatchingEg3 myObject = new CatchingEg3();
			myObject.doSomething();
		}
		catch(RupnarainException e){
			e.printStackTrace();
		}
		finally{
			System.out.println("Finished");	
		}
	}
}
