public class MyMainClass{
	public static void main(String[] args) {
		MyOuterClass outer = new MyOuterClass();
		MyOuterClass.MyInnerClass inner = outer.new MyInnerClass();
	}
}