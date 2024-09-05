package unit_3;

import java.util.ArrayList;

public class Index {

    public static void main(String[] args) {

        ArrayList<SalesPerson> list = new ArrayList<SalesPerson>();

        for (int i = 0; i < 5; i++){
            SalesPerson sp = new SalesPerson(Integer.toString(i), i, i);
            list.add(sp);
        }

         
    }

}