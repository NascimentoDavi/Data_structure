package Polymorphism.Override;

public class Superclasse {
    private String name;

    public String imprimir (String i) {
        return "Imprime : " + i;
    }

    public double soma (double x, double y) { return x + y; }

    public String getName () {
        return this.name;
    }

    public void setName (String name) {
        this.name = name;
    }
}