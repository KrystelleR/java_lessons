class Fibonacci{
	public static void main(String[] args) {
		long[] array = new long[100];
		populateArray(array);
		printArray(array);
	}

	//populating array
	public static void populateArray(long[] array){
		array[0] = 0;
		array[1] = 1;
		for(int i =2; i<array.length; i++){
			array[i] = array[i-2] + array[i-1];
		}
	}

	//printing array
	public static void printArray(long[] array){
		for(long element: array){
			System.out.println(element);
		}
	}
}