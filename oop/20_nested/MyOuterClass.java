public class MyOuterClass{
	public MyOuterClass(){
		System.out.println("Constructing outer");
	}
	public class MyInnerClass{
		public MyInnerClass(){
			System.out.println("Constructing inner");
		}
	}
}