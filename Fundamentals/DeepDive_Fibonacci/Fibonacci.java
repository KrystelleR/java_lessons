class Fibonacci{
	public static void main(String[] args) {
		int[] array = new int[100];
		populateArray(array);
		printArray(array);
	}

	//populating array
	public static void populateArray(int[] array){
		array[0] = 0;
		array[1] = 1;
		for(int i =2; i<array.length; i++){
			array[i] = array[i-2] + array[i-1];
		}
	}

	//printing array
	public static void printArray(int[] array){
		for(int element: array){
			System.out.println(element);
		}
	}
}