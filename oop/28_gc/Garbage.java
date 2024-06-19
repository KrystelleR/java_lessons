public class Garbage{
	public String name;

	public Garbage(String paramName){
		this.name = paramName;
	}

	@Override
	public void finalize(){
		System.out.println("Finalizing just before garbage collection");
	}
}