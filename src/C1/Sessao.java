package C1;

import Entity.Data;
import Entity.Hour;

public class Sessao {

    // Atributos de Instância - cada objeto possui o seu
    private Filme filme;
    private Assentos assentos;

    private Data dataSessao;
    private Hour horarioSessao;

    private int quantVendida;
    private int quantPresentes;

    // Atributo de classe - compartilhado entre todos os objetos da classe
    private static double preco = 50.00;

    public Sessao (Filme filme, Assentos assentos, Data dataSessao, Hour horarioSessao) {
        this.filme = filme;
        this.assentos = assentos;
        this.dataSessao = dataSessao;
        this.horarioSessao = horarioSessao;
    }

    public boolean venda (int fileira, int assento) {
        if(this.assentos.getStatus(fileira, assento) == true) {
            this.assentos.mudarStatus(fileira, assento);
            this.quantVendida++;
            return true;
        } else {
            return false;
        }
    }

}