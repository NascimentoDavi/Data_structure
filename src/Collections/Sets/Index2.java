package Collections.Sets;

import java.util.HashSet;
import java.util.Iterator;

public class Index2 {
    public static void main(String[] args){

        // Creates an instance of the class hashSet
        HashSet<Integer> hashSet = new HashSet<Integer>();

        // System.out.println(hashSet.iterator());

        // Fill in the Set
        fillIn(hashSet);

        // Create an iterator, an object which will iteract over the collection.
        Iterator<Integer> iterator = hashSet.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Is also possible to use ToString()
        System.out.println("\n\n" + hashSet + "\n\n");

        // Printing when turning the set into an array
        Object[] hashSetToArray = hashSet.toArray();
        for(int i = 0; i < hashSetToArray.length; i++){
            System.out.println(hashSetToArray[i]);
        }
    }

    // Method to fill in the conjunct
    public static void fillIn(HashSet<Integer> hashSet){
        for(int i = 0; i < 10; i++){
            hashSet.add((int) (Math.random() * 50) + 1);
        }
    }
}