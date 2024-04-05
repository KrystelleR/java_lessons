public class ArrayManipulation8 {
    public static void main(String[]args){
        int[] arrayA = {3,4,2,6,4,7,9,1,0};
        int[] arrayB = {13,14,12,16,14,17,19,11,10};
       
        printArray("arrayA before merging ",arrayA);
        printArray("arrayB before merging ",arrayB);
        int[] arrayC = merge( arrayA, arrayB);
        printArray("arrayC after merging ",arrayC);
    }

    public static int [] merge(int[] arrayA,int[] arrayB){
        //Write code that create a new array that is the size of the two arrays combined
        int[] mergedArray = new int[arrayA.length + arrayB.length];
        //copy both array into the new array contigously.
        for(int i =0; i<arrayA.length; i++){
            mergedArray[i] = arrayA[i];
        }

        int k =arrayA.length;
        for(int i =0; i< arrayB.length;i++){
            mergedArray[k++] = arrayB[i];
        }
        //Note this line is buggy as it returns arrayA
        //Your code should use the new array
        //This should return the new array
        return mergedArray;
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