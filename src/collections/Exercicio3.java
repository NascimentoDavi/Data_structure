package collections;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 3 - Faça um programa que preencha um ArrayList 
 * ou uma LinkedList com números inteiros, mostre 
 * essa lista na tela, remova todos os pares da lista 
 * e mostre novamente na tela.
 */
public class Exercicio3 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// 1 - Criar ArrayList
		ArrayList<Integer> lista = new ArrayList<Integer>();
		// 2 - Preencher ArrayList
		preencher (lista);
		// 3 - Imprimir ArrayList
		System.out.println("Lista Original = " + lista);
		// 4 - Remover pares do ArrayList
		removerPar (lista);
		// 5 - Imprimir ArrayList
		System.out.println("Lista sem pares = "+lista);
	}

	private static void preencher(ArrayList<Integer> lista) {
		System.out.println("Entre com o tamanho da lista: ");
		int tam = Integer.parseInt(scan.nextLine());
		int num;
		for (int i=0; i<tam; i++) {
			num = (int)(Math.random()*50+1);
			lista.add(num);
		}
	}

	private static void removerPar(ArrayList<Integer> lista) {
		for (int i=0; i<lista.size(); ) {
			if (lista.get(i)%2 == 0) {
				lista.remove(i);
			} else {
				i++;
			}
			
		}
	}

}
