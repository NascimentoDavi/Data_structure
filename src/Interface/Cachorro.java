package Interface;

public class Cachorro implements Animal {
    
    public void emitirSom () {
        System.out.println("Au Au");
    }

    public void comer () {
        System.out.println("Comendo...");
    }

    public static void main(String[] args) {
        Cachorro c1 = new Cachorro();

        c1.comer();
    }
}