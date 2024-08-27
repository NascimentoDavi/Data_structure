package LIFO;

/*

    Alunos

    Davi Rodrigues do Nascimento
    Bruno Barbosa Fernandes

*/

import java.util.LinkedList;    

public class LinkedListAula {

    private LinkedList<Integer> list;

    public LinkedListAula(){
        this.list = new LinkedList<>();
    }

    // Verificar se a pilha/fila está vazia
    public boolean eVazia(){
        if(list.isEmpty()){
            return true;
        }
        return false;
    }

    public void empilhar(int num){

        this.list.push(num);
        
    }

    // Inserir (Inserir um elemento no fim da fila)
    public void enfileirar(int num){

        this.list.offer(num);

    }

    // Remover (Remover o elemento do início da fila)
    public void desenfileirar(){

        if(!eVazia()){
            this.list.removeFirst();
        }
        
    }

    // Desempilhar (Remover o elemento do topo da pilha)
    public void desempilhar(){

        if(!eVazia()){
            this.list.removeLast();
        }

    }

    // Retornar o tamanho da pilha / fila
    public int getTamanho(){

        return this.list.size();

    }

    // Retorna o primeiro Fila
    public int getPrimeiro(){

        return (this.list.getFirst());

    }

    // Retorna o último Pilha
    public int getUltimo(){

        return this.list.getLast();
        
    }
}