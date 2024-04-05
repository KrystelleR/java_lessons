import java.util.StringTokenizer;

class Strings1{
	public static void main(String[] args) {
		int[] array = new int[0];
		String line = "1,4,3,2,3,7,5,6,9"; 
		array = convertToIntArray(line);
		printArray("Original array: ", array);
		ascending(array, 0, array.length-1);
		printArray("Array ascending: ", array);
		descending(array, 0, array.length-1);
		printArray("Array descending: ", array);
	}

	public static int[] convertToIntArray(String line){
		StringTokenizer st = new StringTokenizer(line, ",");
		int size = st.countTokens();
		int[] array = new int[size];

		int i =0;
		while(st.hasMoreTokens()){
			String current = st.nextToken();
			array[i++] = Integer.parseInt(current);
		}
		return array;
	}

	public static void printArray(String message, int[] array){
		System.out.print(message);
		for(int i =0; i <array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println("\n");
	}

	public static void ascending(int[] array, int lowIndex, int highIndex){
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
		ascending(array, lowIndex, leftPointer-1);
		ascending(array, leftPointer+1, highIndex);
	}

	public static void descending(int[] array, int lowIndex, int highIndex){
		if(lowIndex >= highIndex){
			return;
		}
		int pivot = array[highIndex];

		int leftPointer =lowIndex;
		int rightPointer =highIndex;

		while(leftPointer < rightPointer){
			while(array[leftPointer] >= pivot && leftPointer < rightPointer){
				leftPointer++;
			}

			while(array[rightPointer] <= pivot && leftPointer < rightPointer){
				rightPointer--;
			}
			swap(array, leftPointer, rightPointer);
		}
		
		swap(array, leftPointer, highIndex);
		descending(array, lowIndex, leftPointer-1);
		descending(array, leftPointer+1, highIndex);
	}

	public static void swap(int[] array, int index1, int index2){
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
}