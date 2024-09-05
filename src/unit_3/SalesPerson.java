package unit_3;

public class SalesPerson {

    // Change category date tipo to chat

    // Istance Attribute
    private String name;
    private int serviceTime;
    private char category;
    private int totalSales;

    // Class Attribute - must be initialized here
    // It'll never be constructor parameter
    private static double salary = 1500;


    public SalesPerson (String name, int serviceTime, int totalSales) {
        this.name = name;
        this.serviceTime = serviceTime;
        this.totalSales = totalSales;
        this.setCategory();
    }

    public String getName () {
        return this.name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public static double getSalary () {
        return SalesPerson.salary;
    }

    public void setSalary (double salary) {
        // Not use this, because it does not belong to an object
        SalesPerson.salary = salary;
    }

    public int getServiceTime () {
        return this.serviceTime;
    }

    public char getCategory () {
        return this.category;
    }

    public int getTotalSales () {
        return this.totalSales;
    }

    public void setServiceTime (int serviceTime) {
        this.serviceTime = serviceTime;
        this.setCategory();
    }

    // Important : It will not be takenn outside the class
    private void setCategory () {
        if (this.serviceTime > 60) {
            this.category = 'A';
        } else if (this.serviceTime < 30) {
            this.category = 'C';
        } else {
            this.category = 'B';
        }
    }

    public void setTotalSales (int totalSales) {
        this.totalSales = totalSales;
    }

    public double comission () {
        // 20% do total de sua venda se ela ultrapassou R$ 20.000,00
        // 15 % do total de sua venda se ela está entre R$ 20.000,00 e 10.000,00
        // 5% do total de sua venda se as vendas não chegaram a R$ 10.000,00

        if (this.totalSales > 20.000) {
            return this.totalSales * 0.2;
        } else if (this.totalSales >= 10.000) { 
            return this.totalSales * 0.15;
        } else {
            return this.totalSales * 0.05;
        }
    
    }

    public double bonus () {
        // If category is 'A', then bonus of 15%
        // If category is 'B', then bonus of 7,5%
        // If category is 'C', no bonus

        if(this.category == 'A') {
            return SalesPerson.salary * 0.15;
        } else if (this.category == 'B') {
            return SalesPerson.salary * 0.75;
        } else {
            return 0.00;
        }
    }

    // mostre na tela os vendedores com maior tempo de serviço

    @Override
    public String toString () {
        return "Name : " + this.name + " | Time of Service : " + this.serviceTime + " | Category : " + this.category + " | Total of Sales : " + this.totalSales;
    }
}