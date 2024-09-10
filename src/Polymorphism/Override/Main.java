package Polymorphism.Override;

public class Main {
    public static void main(String[] args) {
        Superclasse sup = new Superclasse();
        Subclasse sub = new Subclasse();

        System.out.println(sup.imprimir("Teste"));
        System.out.println(sub.imprimir("Teste"));

        // Inheritance concept.
        sub.setName("Jesus");
        System.out.println(sub.getName());
        
    }
}
