public class CatchingEg3Main {
	public static void main(String[] args) {
		try{
			CatchingEg3 myObject = new CatchingEg3();
			myObject.doSomething();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			System.out.println("Finished");	
		}
	}
}
