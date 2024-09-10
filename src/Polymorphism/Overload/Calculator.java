package Polymorphism.Overload;

public class Calculator {
    // Nao existe uma anotação @Overload em Java

    public int soma (int x, int y) { return (x + y); }

    public int soma (int x, int y, int z) { return (x + y + z) ; }

    public String soma (String x, String y) { return (x + y) ; }
}
