import java.util.Random;

class CodeAlong2_1{
	public static void main(String[] args) {
		//declarations
		int[] myOriginalArray = new int[100];
		int[] mySubArray = new int[17];
		Random randomValue = new Random();

		//populating original array
		for(int i =0; i < myOriginalArray.length; i++)
			myOriginalArray[i] = randomValue.nextInt(1000);
		//priting original array
		System.out.println("Printing my Original Array:");
		printArray(myOriginalArray);

		//copying original from 15-31 values into sub array
		System.arraycopy(myOriginalArray, 15, mySubArray, 0, 17); //parameters order: originalArr, startPos, newArray, startpos, length
		//printing sub array
		System.out.println("\n\nPrinting my Sub Array:");
		printArray(mySubArray);
	}

	//method to print array
	public static void printArray(int[] arr){
		for(int element: arr)
			System.out.print(element + " ");
	}
}