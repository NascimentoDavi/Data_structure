package C1;

import java.util.ArrayList;
import java.util.Scanner;

public class Cinema {

    static Scanner scan = new Scanner(System.in);
    static Secao sec = new Secao();

    private ArrayList<Secao> secoes = new ArrayList<Secao>();

    public void cadastrar (Secao sessao) {
        secoes.add(sessao);
    }

    public String getSecoesResumo () {
        String str = "";
        for(int i = 0; i < this.secoes.size(); i++) {
            str += secoes.get(i).getResumo() + "\n";
        }
        return str;
    }

    public String getSecoesAll () {
        String str = "";
        for(int i = 0; i < this.secoes.size(); i++) {
            str += "Seção " + Integer.toString(i + 1) + "\n" + secoes.get(i).toString() + "\n";
        }
        return str;
    }

    public void getAssentos (int index) {
        if ((index - 1) >= 0 && (index -1) <= this.secoes.size()) {
            System.out.println(secoes.get(index -1).getAssentos().mostrarLugares());
        }
    }

    public void vender () {
        int fileira, assento;
        System.out.println("Fileira : ");
        fileira = Integer.parseInt(scan.nextLine());
        System.out.println("Assento : ");
        assento = Integer.parseInt(scan.nextLine());

        if(sec.venda(fileira, assento) == true) {
            System.out.println("Assento Selecionado : ");
            System.out.println("\n" + sec.getAssentos().mostrarLugares());
        } else {
            System.out.println("Assentos já estão ocupados");
            System.out.println("\n" + sec.getAssentos().mostrarLugares());
        }
    }
}
