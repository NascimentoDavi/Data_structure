package arrays;

public class Index {
    public static void main(String[] args){

        int[] intArray = new int[5];
        int index = 0;

        for(int i = 0; i < intArray.length; i++){
            intArray[i] = i;
        }

        for(int i = 0; i < intArray.length; i++){
            if(intArray[i] == 4){
                index = i;
                break;
            }
        }

        System.out.println("Index of 4: " + index);
    }
}