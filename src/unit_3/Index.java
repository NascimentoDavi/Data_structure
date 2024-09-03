package unit_3;

public class Index {

    public static void main(String[] args) {

        SalesPerson vendedor1 = new SalesPerson("David", 4, 560);
        SalesPerson vendedor2 = new SalesPerson("Felipe", 2, 568);

        System.out.println(SalesPerson.getSalary());

        vendedor1.setSalary(1400);

        System.out.println(SalesPerson.getSalary());
    }

}