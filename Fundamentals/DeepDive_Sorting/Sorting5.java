class Sorting5{
	public static void main(String[] args) {
		int[] array = new int[50];
		populateArray(array);
		printArray("Original Array: ", array);
		array = add(array, 60, 20); //where you adding, the value being added, the index where it will be added
		array = add(array, 61, 61);
		quickSort(array, 0, array.length-1);
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

	//bubble sort (descending)
	public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                	swapped = true;
            	}
        	}
        	// If no two elements were swapped in the inner loop, array is sorted
	        if (!swapped) {
	            break;
	        }
    	}
    }

    //quick sort (descending)
	public static void quickSort(int[] array, int lowIndex, int highIndex){
		if(lowIndex >= highIndex){
			return;
		}
		int pivot = array[highIndex];

		int leftPointer =lowIndex;
		int rightPointer =highIndex;

		while(leftPointer < rightPointer){
			while(array[leftPointer] <= pivot && leftPointer < rightPointer){
				leftPointer++;
			}

			while(array[rightPointer] >= pivot && leftPointer < rightPointer){
				rightPointer--;
			}
			swap(array, leftPointer, rightPointer);
		}
		
		swap(array, leftPointer, highIndex);
		quickSort(array, lowIndex, leftPointer-1);
		quickSort(array, leftPointer+1, highIndex);
	}

	public static void swap(int[] array, int index1, int index2){
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
}