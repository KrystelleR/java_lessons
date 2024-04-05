public class ArrayManipulation9 {
    public static void main(String[]args){
        int[] arrayA = {3,4,2,6,4,7,9,1,0};
        int[] arrayB = {3,14,12,6,14,7,19,11,0};

        printArray("arrayA before subtracting ",arrayA);       
        printArray("arrayB before subtracting ",arrayB);

        arrayA = sub( arrayA, arrayB);
        printArray("arrayA after subtracting ",arrayA);       
        printArray("arrayB after subtracting ",arrayB);

        printArray ("merged sub array without duplicates", mergeSub(arrayA, arrayB));
    }

    public static int [] sub(int[] arrayA,int[] arrayB){
        //Write code that create a new array that is the size a - duplicates
        int duplicateCount =0;
        for(int i =0; i <arrayA.length; i++){
            for(int j=0; j<arrayB.length; j++){
                if(arrayA[i] == arrayB[j]){
                    duplicateCount++;
                }
            }
        }

        int newSize = arrayA.length - duplicateCount;
        int [] newArrayA = new int[newSize];
        //copy non-duplicates into the new array contigously.
        int k=0;
        for(int i =0; i <arrayA.length; i++){
            boolean isDuplicate = false;
            for(int j=0; j<arrayB.length; j++){
                if(arrayA[i] == arrayB[j]){
                    isDuplicate = true;
                }
            }
            if(!isDuplicate){
                newArrayA[k++] = arrayA[i];
            }
        }
        //define int duplicateCount = 0;
        //count duplicate and duplicateCount++ for each
        //create new array that is initialSize - duplicateCount;
        //write a loop that skips duplicate as it copies from a to b

        //Note this line is buggy as it returns arrayA
        //Your code should use the new array
        //This should return the new array
        return newArrayA;
    }

    public static int[] mergeSub(int[] arrayA, int[] arrayB){
        int [] mergedArray = new int[arrayA.length + arrayB.length];
        //merging arrays
        for(int i=0; i <arrayA.length; i++){
            mergedArray[i] = arrayA[i];
        }
        int k=arrayA.length;
        for(int i=0; i <arrayB.length; i++){
            mergedArray[k++] = arrayB[i];
        }

        // Removing duplicates
        int duplicateCount = 0;
        for (int i = 0; i < mergedArray.length; i++) {
            for (int j = i + 1; j < mergedArray.length; j++) {
                if (mergedArray[i] == mergedArray[j]) {
                    duplicateCount++;
                    break;
                }
            }
        }

        int[] mergedSubArray = new int[mergedArray.length - duplicateCount];
        int l = 0;
        for (int i = 0; i < mergedArray.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (mergedArray[i] == mergedArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                mergedSubArray[l++] = mergedArray[i];
            }
        }
        return mergedSubArray;
    }
    
    public static void printArray(String prefix,int[] arrayToPrint){
        System.out.print(prefix);
        System.out.print("[");
    
        for (int i =0;i < arrayToPrint.length;i++) {
            
            System.out.print(arrayToPrint[i]);
            if(i != arrayToPrint.length-1){
            	System.out.print(",");
            }

            
        }
        System.out.print("]\n");
    }
}