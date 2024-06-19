public class GarbageMain{
	public static void main(String[] args) {
		Garbage gc1 = new Garbage("Garbage1");
		Garbage gc2 = new Garbage("Garbage2");
		Garbage gc3 = new Garbage("Garbage3");
		Garbage gc4 = new Garbage("Garbage4");
		Garbage gc5 = new Garbage("Garbage5");

		gc1.finalize();
		gc2.finalize();
		gc3.finalize();
		gc4.finalize();
		gc5.finalize();

		System.gc();

		for(int i =1; i <=5; i++){
			Garbage gc = new Garbage("Garbage" + i);
		}

		System.gc();
	}
}