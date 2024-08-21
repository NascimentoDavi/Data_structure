package collections;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListActivity {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){

        ArrayList<Integer> numbers = new ArrayList<>();
        int num;

        System.out.println("Type 10 different numbers, piece of shit: ");
        for(int i = 0; i < 10; i++){
            try {
                num = Integer.parseInt(scan.nextLine());
            } catch (Exception e){
                System.out.println("Type only numbers.");
                break;
            }
            numbers.add(i, num);
        }

        if(numbers.size() == 10){
            System.out.println("Lista após preenchimento: " + numbers);
            System.out.println("Lista após remover pares: " + removeEven(numbers));
        }
    }

    public static ArrayList<Integer> removeEven(ArrayList<Integer> arrayL){
        for(int i = 0; i < arrayL.size(); i++){
            if(arrayL.get(i) % 2 == 0){
                arrayL.remove(arrayL.get(i));
                i--;
            }
        }
        return arrayL;
    }

    public static ArrayList<Integer> removeEven(ArrayList<Integer> arrayL){
        Iterator<Integer> iterator  = arrayL.iterator();

        while(iterator.hasNext()) {
            int num = iterator.next();
            if(num % 2 == 0){
                iterator.remove();
            }
        }
        return arrayL;
    }
}