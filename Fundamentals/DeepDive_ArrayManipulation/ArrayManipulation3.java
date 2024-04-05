public class ArrayManipulation3 {
    public static void main(String[]args){
        int[] array = {3,4,2,6,4,7,9,1};
        printArray("array before ",array);
        //printing ascending
        printArray("array ascending ",ascending(array));
        //printing descending
        printArray("array descending ",descending(array));

    }

    public static int[] ascending(int[] array){
        int[] newArray = new int[array.length];
        System.arraycopy(array,0, newArray, 0, array.length);
        //sort the above array in ascendning order in-place. i.e. Using the same array
            for (int i = 0;i < newArray.length;i++ ) {
                for (int j =i+1;j< newArray.length; j++) {
                    if(newArray[j]< newArray[i]){
                        int temp = newArray[i];
                         newArray[i] = newArray[j];
                        newArray[j] = temp;
                }
            }
        }

        return newArray;
    }

    public static int[] descending(int[] array){
        int[] newArray = new int[array.length];
        System.arraycopy(array,0, newArray, 0, array.length);
        //sort the above array in ascendning order in-place. i.e. Using the same array
            for (int i = 0;i < newArray.length;i++ ) {
                for (int j =i+1;j< newArray.length; j++) {
                    if(newArray[j]> newArray[i]){
                        int temp = newArray[i];
                         newArray[i] = newArray[j];
                       newArray[j] = temp;
                }
            }
        }
        return newArray;
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
