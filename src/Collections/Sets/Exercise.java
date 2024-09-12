package Collections.Sets;

import java.util.HashSet;
import java.util.TreeSet;

public class Exercise {
    public static void main(String[] args) {
        HashSet<Integer> hash = new HashSet<Integer>();
        TreeSet<Integer> tree;

        fillIn(hash, 10);
        
        System.out.println("Elements disposition in HashSet Collection : ");
        System.out.print(hash);

        System.out.println("\nElements disposition after change into TreeSet Collection : ");
        tree = order(hash);
        System.out.println(tree);
        
    }

    static void fillIn (HashSet<Integer> hashList, int quant) {
        for(int i = 0; i < quant; i++) {
            hashList.add((int)(Math.random()*50 + 1));
        }
    }

    // Comparable interface ensures that objects of type T can be Compared and Ordered.
    static <T extends Comparable<T>> TreeSet<T> order (HashSet<T> hashList) {
        return new TreeSet<>(hashList);
    }
}
