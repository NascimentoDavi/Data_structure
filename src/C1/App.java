package C1;

import java.util.Scanner;

import Entity.Data;
import Entity.Hour;

public class App {
    static Scanner scan = new Scanner(System.in);
    static Cinema cinema = new Cinema();

    public static void main(String[] args) {
       

        System.out.println("\nCadastro de Cinema: ");
        int opt = 0; 
        
        while (opt != 4) {

            try {
                System.out.println("\nDigite o numero de uma das opções a seguir: ");
                System.out.print("1 - Cadastrar;\n2 - Vender\n3 - Mostrar Sessoes Cadastrados\n4 - Sair\nOpção : ");
                opt = Integer.parseInt(scan.nextLine());
            
                switch (opt) {
                    case 1:
                        cadastrar();
                        break;
                
                    case 2: 
                        vender();
                        break;

                    case 3:
                        System.out.println(mostrarSessoes());
                        break;

                    case 4:
                        System.out.println("Saindo...");
                        break;

                    default:
                        System.out.println("Digite uma das opções apresentadas, por gentileza.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Algum erro ocorreu. Tente novamente");
                continue;
            }
        }
    }

    public static void cadastrar () {
        // Vai pedir ao usuário as informações de 5 seções e cadastrá-las
        Data data;
        Hour horario;
        Filme filme = new Filme();

        System.out.print("Data da Sessão (dia/mes/ano) : ");
        data = new Data(scan.nextLine());

        System.out.print("Horário da Sessão (hora:min) : ");
        horario = new Hour(scan.nextLine());

        System.out.print("Nome do Filme : ");
        filme.setNome(scan.nextLine());
        System.out.print("Duração do Filme (min) : ");
        filme.setDuracao(Integer.parseInt(scan.nextLine()));
        System.out.print("Classificação do Filme: ");
        filme.setClassificacao(scan.nextLine());
        System.out.print("Genero do Filme: ");
        filme.setGenero(scan.nextLine());

        Secao secao = new Secao(filme, data, horario);

        cinema.cadastrar(secao);

        System.out.println("Seção Cadastrada com sucesso!");
    }

    public static void vender () {
        /*
        
        deve mostrar na tela todas as seções (nome do filme e horário). Assim, o
        usuário deve escolher a seção. Em seguida, deve mostrar na tela os lugares da
        seção, para que o usuário escolha a fila e o assento disponível para comprar.
        Então realiza a venda.

        */

        if(cinema.getSecoesResumo().isEmpty()){
            System.out.println("Nenhuma seção cadastrada até o momento");
        } else {
            int opt;
            System.out.println("Escolha a seção : \n");
            System.out.println(cinema.getSecoesResumo());
            System.out.print("Seção que deseja ver assentos : ");
            opt = Integer.parseInt(scan.nextLine());

            cinema.getAssentos(opt);

            cinema.vender(opt);
        }
    }

    public static String mostrarSessoes () {
        String str = cinema.getSecoesAll();
        if(str.isEmpty()) {
            return "Não há nenhuma seção cadastrada ainda.";
        } else {
            return "\n" + str;
        }
    }
}