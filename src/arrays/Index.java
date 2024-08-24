package arrays;

public class Index {
    public static void main(String[] args){

        // Defining the array
        int[] intArray = new int[7];

        // Filling it in
        for(int i = 0; i < intArray.length; i++){
            intArray[i] = (int)(Math.random() * 50 + 1);
        }

        // Printing it
        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }

        // Now using Bubble Sort
        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for(int i = 0; i < lastUnsortedIndex; i++){
                if(intArray[i] > intArray[i + 1]){
                    swap(intArray, i, i + 1);
                }
            }
        }

        // Print the same array, but now sorted
        System.out.println("Sorted Array: ");
        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }

    public static void swap(int[] intArray, int i, int j){

        int aux;

        if(i != j){
            aux = intArray[i];
            intArray[i] = intArray[j];
            intArray[j] = aux;
        }
    }
}