package collections;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListActivity {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        fillIn(list);
        System.out.println("Full filled list: " + list);
    }

    public static void fillIn(LinkedList<Integer> list){
        System.out.println("Type the list size: ");
        int size = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < size; i++){
            list.add(i, (int)(Math.random()*50+1));
        }
    }
}