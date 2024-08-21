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
        // Create the Linked
        LinkedList<Integer> list = new LinkedList<>();

        // Fill in the list
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