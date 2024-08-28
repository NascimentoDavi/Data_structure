package Collections;

import java.util.Scanner;

import Entity.Item;
import LDE.LdeItem;

// 5 - Escreva um programa que
    // 1- Adicione números inteiros até que o usuário digite 0;
    // 2- Imprima todos os elementos;
    // 3- Remova todos os números pares;
    // 4- Imprima a lista resultant
//


public class Exercise5 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){

        LdeItem lista = new LdeItem();

        int num = 1;

        System.out.println("Type aleatory numbers and type 0 to stop");

        while(num != 0){
            try {

                num = Integer.parseInt(scan.nextLine());

                if(num != 0){
                    Item item = new Item(num);
                    lista.insereUltimo(item);
                }

            } catch (Exception e){
                System.out.println("Type only numbers!");
            }
        }
        System.out.println(lista.toString());
    }
    
}