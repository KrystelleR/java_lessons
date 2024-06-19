public class MyClass2{
	public static void main(String[] args) {
		int myInt = 9;
		int myInt1 = 10;
		int myInt2 = 5;

		MyFunctionalInterface mfi = (value)->{
			return ++value;
		};
		System.out.println(mfi.increment(myInt));

		MyFunctionalInterface2 mfi2 = (value1, value2)->{
			return value1 + value2;
		};
		System.out.println(mfi2.add(myInt1, myInt2));
	}
}