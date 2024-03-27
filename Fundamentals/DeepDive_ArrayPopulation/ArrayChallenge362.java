import java.util.Random;

class ArrayChallenge362{
	public static void main(String[] args) {
		//delcarations
		int[][][] my3DArray = new int[10][10][3];
		int[][] my2DArray = new int[10][10];

		//populating array
		populate3DArray(my3DArray);
		populate2DArray(my2DArray);

		//printing array
		System.out.println("My 3D Array:");
		print3DArray(my3DArray);
		System.out.println("My 2D Array:");
		print2DArray(my2DArray);
	}

	//method to populate 3D array
	public static void populate3DArray(int[][][] myArray){
		Random randomValue = new Random();
		for(int i = 0; i< myArray.length; i++){
			for(int j = 0; j< myArray[i].length; j++){
				for(int k = 0; k< myArray[i][j].length; k++){
					myArray[i][j][k] = randomValue.nextInt(1000);
				}
			}
		}
	}

	//method to populate 2D array
	public static void populate2DArray(int[][] myArray){
		Random randomValue = new Random();
		for(int i = 0; i< myArray.length/2; i++){
			for(int j = 0; j< myArray[i].length; j++){
				myArray[i][j] = randomValue.nextInt(1000);
			}
		}
	}

	//method to print 3D array
	public static void print3DArray(int[][][] myArray){
		for(int i = 0; i< myArray.length; i++){
			for(int j = 0; j< myArray[i].length; j++){
				for(int k = 0; k< myArray[i][j].length; k++){
					System.out.print(myArray[i][j][k] + " ");
				}
				System.out.println("\n");
			}
			System.out.println("\n");
		}
	}

	//method to print 2D array
	public static void print2DArray(int[][] myArray){
		for(int i = 0; i< myArray.length; i++){
			for(int j = 0; j< myArray[i].length; j++){
				System.out.print(myArray[i][j] + " ");
			}
			System.out.println("\n");
		}
		System.out.println("\n");
	}
}