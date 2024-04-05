import java.util.StringTokenizer;
class Strings2{
	public static void main(String[] args) {
		String line = "1,4,3,2,3,7,5,6,9\n"+ "8,6,3,7,3,7,5,6,9\n"; 
        
        int[][] array2D = convertToInt2DArray(line);

        //printing orignal array
        print2darray("Original 2D array: ", array2D);

        //sorting 2d array (desc)
        for(int i =0; i<array2D.length; i++){
        	ascending(array2D[i], 0, array2D[i].length-1);
        }

        //printing sorted in ascending order array
        print2darray("Ascending 2D array: ", array2D);

        //sorting 2d array (desc)
        for(int i =0; i<array2D.length; i++){
        	descending(array2D[i], 0, array2D[i].length-1);
        }

        //printing sorted in descending order array
        print2darray("Descending 2D array: ", array2D);
	}

	//method to ocnvert string to an int array
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

	//method to convert line to 2D array
	public static int[][] convertToInt2DArray(String line){
	//splitting line to seperate the 2 lines into 2 different strings (kept in arrays)
        StringTokenizer st = new StringTokenizer(line, "\n");
        int sizeStrArr = st.countTokens();
        String[] arrStr = new String [sizeStrArr];
        
        //adding strings into 2d arrays (after converting to int)
        int k=0;
        while(st.hasMoreTokens()){
        	arrStr[k++] = st.nextToken();
        }

        int[][] array2D = new int[sizeStrArr][];
        for(int i =0; i <arrStr.length; i++){
        	int[] intArray = convertToIntArray(arrStr[i]);
        	array2D[i] = intArray;
        }
        return array2D;
	}

	//printing out a 2d array
	public static void print2darray(String message, int[][] array){
		System.out.println(message);
		for(int i =0; i<array.length; i++){
			for(int j=0; j<array[i].length; j++){
				System.out.print(array[i][j]+ " ");
			}
			System.out.print("\n");
		}
		System.out.println();
	}

	//quick sort to sort the array in ascending order
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

	//quick sort to sort the array in descending order
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