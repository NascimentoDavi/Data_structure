package Collections.Sets;

import java.util.ArrayList;

import java.util.TreeSet;

import Lib.Info;

public class Aula2 {

    public static void main(String[] args){

        ArrayList<Integer> lis1 = new ArrayList<>();
        ArrayList<Integer> lis2 = new ArrayList<>();
        ArrayList<Integer> lis3 = new ArrayList<>();
        TreeSet<Integer> tSet;

        Info.fillIn(lis1);
        Info.fillIn(lis2);

        tSet = new TreeSet<>(lis1);
        tSet.addAll(lis2);

        lis3 = new ArrayList<>(tSet);

        System.out.println(lis1 + "\n" + lis2 + "\n\n");
        System.out.println(lis3);
    }

}