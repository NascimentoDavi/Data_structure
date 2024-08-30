package Collections.Sets;

import java.util.ArrayList;
import java.util.TreeSet;

import Lib.Info;

import java.util.HashSet;

public class Aula3 {

    public static void main(String[] args){

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        TreeSet<Integer> tSet;

        Info.fillIn(list1);
        tSet = new TreeSet<>(list1);
        
    }

    private static ArrayList<Integer> reverte(ArrayList<Integer> lista) {
        ArrayList<Integer> aux = new ArrayList<>();

        for(int num : lista){
            aux.add(0, num);
        }
        return aux;
    }

}