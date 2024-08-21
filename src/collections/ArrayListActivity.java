package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListActivity {
    
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // 1 Create ArrayList
        ArrayList<Integer> list = new ArrayList<Integer>();

        // 2 Fill it in
        fillIn(list);

        // 3 Print the original one
        System.out.println("Original List: " + list);

        // 4 Remove even numbers from the list
        removeEven(list);

        // 5 Print the resulting list
        System.out.println("Without even numbers list: " + list);
    }

    public static void fillIn(ArrayList<Integer> list) {
        System.out.println("List size: ");
        int size = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < size; i++) {
            list.add((int)(Math.random() * 50 + 1));
        }
    }

    public static void removeEven(ArrayList<Integer> list) {
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            } else {
                i++;
            }
        }
    }
}
