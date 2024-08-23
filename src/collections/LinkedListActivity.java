package collections;

import java.util.LinkedList;
import java.util.Scanner;

/*
 * 3 - Faça um programa que preencha um ArrayList 
 * ou uma LinkedList com números inteiros, mostre 
 * essa lista na tela, remova todos os pares da lista 
 * e mostre novamente na tela.
 */

public class LinkedListActivity {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        // 1 - Create the Linked
        LinkedList<Integer> list = new LinkedList<>();

        // 2 - Fill in the list
        fillIn(list);

        // 3 - Print the original list on the screen
        System.out.println("Full filled list: " + list);

        // 4 - Return the occurences of a specific number in the list
        System.out.println(countNum(list));
    }

    public static void fillIn(LinkedList<Integer> list){
        System.out.print("Type the list size: ");
        int size = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < size; i++){
            list.add(i, (int)(Math.random()*50+1));
        }
    }

    public static int countNum(LinkedList<Integer> list){
        int num, quant = 0;

        System.out.print("Number: ");
        num = Integer.parseInt(scan.nextLine());

        for(int i = 0; i < list.size(); ){
            if(list.get(i) == num){
                quant++;
            }
            i++;
        }
        return quant;
    }
}