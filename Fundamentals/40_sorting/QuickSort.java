class QuickSort{
	public static void main(String[] args) {
		int[] myArray= {17, 41, 5, 22, 54, 6, 29, 3, 13};
		
		for(int value: myArray){
			System.out.print(value + " ");
		}

		sort(myArray, 0, myArray.length - 1);
		System.out.println("\n");

		for(int value: myArray){
			System.out.print(value + " ");
		}
	}

   	public static void sort(int[] arr, int low, int high) {
        int i = low;
        int j = high;
        int pivot = arr[low + (high - low) / 2];
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j) {
            sort(arr, low, j);
        }
        if (i < high) {
            sort(arr, i, high);
        }
    }
}