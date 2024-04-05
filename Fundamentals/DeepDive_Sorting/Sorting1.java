class Sorting1{
	public static void main(String[] args) {
		int[] array = new int[50];
		populateArray(array);
		printArray("Original Array: ", array);
		array = add(array, 60, 20); //where you adding, the value being added, the index where it will be added
		array = add(array, 61, 61);
		printArray("Changed Array: ", array);
	}

	public static void populateArray(int[] array){
		for(int i =0; i<array.length; i++){
			array[i] = i;
		}
	}

	public static void printArray(String description, int[] array){
		System.out.println(description);
		for(int element : array){
			System.out.print(element + " ");
		}
		System.out.println("\n");
	}

	public static int[] add(int[] array, int value, int index){
		if(index >= array.length){
			int[] newArray = new int [index+1];
			for(int i =0; i< array.length; i++){
				newArray[i] = array[i];
			}
			newArray[index] = value;
			return newArray;
		}
		else{
			array[index] = value;
			return array;
		}
	}
}