package Collections.Sets;

import java.util.HashSet;
import java.util.Iterator;

public class Index {

    /*
        1 - Faça um programa que leia duas listas de inteiros e preencha uma outra lista com todos os elementos das duas listas originais, sem repetição e ordenados. Ao final, mostre as três listas na tela. Por exemplo: [3,6,5,3,7] [2,9,7,5,1] ==> [1,2,3,5,6,7,9]
    */

    public static void main(String[] args){

        HashSet<Integer> hashSet = new HashSet<Integer>();
        HashSet<Integer> hashSet2 = new HashSet<Integer>();

        hashSet.iterator();

        fillIn(hashSet);
        fillIn(hashSet2);

        // Iterate and print using forEach
        for(int hash : hashSet){
            System.out.println(hash);
        }

        System.out.println("\n");

        // Iterate using Iterator and While
        Iterator<Integer> iterator = hashSet.iterator();
    }

    public static void fillIn(HashSet<Integer> hashSet){
        for(int i = 0; i < 10; i++){
            int aleatoryNum = (int) (Math.random() * 50) + 1;
            hashSet.add(aleatoryNum);
        }
    }
}