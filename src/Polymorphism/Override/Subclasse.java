package Polymorphism.Override;

public class Subclasse extends Superclasse {

    /*
        Se faz necessario o uso do annotation @Override porque, caso um dia a assinatura do método mude, o compilador retornará erro informando que o metodo da classe Filha DEVE sobreescrever um metodo da classe Pai.

        Se nao utilizarmos o annotation, o compilador irá entender que criamos um método para a classe Filha.
    */

    @Override // Forma de garantir que estamos sobreescrevendo um método e nao criando um novo
    public String imprimir (String j) {
        return super.imprimir(j) + "\nImprime de novo: " + j;
    }
}
