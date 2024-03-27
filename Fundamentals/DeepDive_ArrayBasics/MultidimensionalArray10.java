import java.util.Random;
class MultidimensionalArray10{
	public static void main(String[] args) {
		//declarations
		int[][] myArray =new int[100][30];

		//populating array
		populateArray(myArray);

		//printing out all elements in array
		System.out.println("All elements in my array:");
		printArray(myArray);

		//incrementing array
		incrementArray(myArray);

		//printing out all elements after printing
		System.out.println("\n\nAll elements in my array post-increment:");
		printArray(myArray);

	}

	//method to populate array
	public static void populateArray(int[][] myArray){
		Random randomValue = new Random();
		for(int i = 0; i <myArray.length; i++){
			for(int j =0; j <myArray[i].length; j++){
				myArray[i][j] = randomValue.nextInt(1000);
			}
		}
	}

	//method to print array
	public static void printArray(int[][] myArray){
		for(int i = 0; i <myArray.length; i++){
			for(int j =0; j <myArray[i].length; j++){
				System.out.print(myArray[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}

	//method to populate array
	public static void incrementArray(int[][] myArray){
		for(int i = 0; i <myArray.length; i++){
			for(int j =0; j <myArray[i].length; j++){
				myArray[i][j]++;
			}
		}
	}
}