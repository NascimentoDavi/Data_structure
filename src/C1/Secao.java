package C1;

import Entity.Data;
import Entity.Hour;

public class Secao {

    // Atributos de Instância - cada objeto possui o seu
    private Filme filme;
    private Assentos assentos;

    private Data dataSessao;
    private Hour horarioSessao;

    private int quantVendida;
    private int quantPresentes;

    // Atributo de classe - compartilhado entre todos os objetos da classe
    private static double preco = 50.00;

    public Secao (Filme filme, Data dataSessao, Hour horarioSessao) {
        this.filme = filme;
        this.dataSessao = dataSessao;
        this.horarioSessao = horarioSessao;
        this.assentos = new Assentos();
        this.quantVendida = 0;
        this.quantPresentes = 0;
    }

    public Secao () {
        this.filme = new Filme();
        this.dataSessao = new Data();;
        this.horarioSessao = new Hour();
        this.assentos = new Assentos();
        this.quantVendida = 0;
        this.quantPresentes = 0;
    }

    // Getters and Setters
    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Assentos getAssentos() {
        return assentos;
    }

    public void setAssentos(Assentos assentos) {
        this.assentos = assentos;
    }

    public Data getDataSessao() {
        return dataSessao;
    }

    public void setDataSessao(Data dataSessao) {
        this.dataSessao = dataSessao;
    }

    public Hour getHorarioSecao() {
        return horarioSessao;
    }

    public void setHorarioSessao(Hour horarioSessao) {
        this.horarioSessao = horarioSessao;
    }

    public int getQuantVendida() {
        return quantVendida;
    }

    public void setQuantVendida(int quantVendida) {
        this.quantVendida = quantVendida;
    }

    public int getQuantPresentes() {
        return quantPresentes;
    }

    public void setQuantPresentes(int quantPresentes) {
        this.quantPresentes = quantPresentes;
    }

    public static double getPreco() {
        return preco;
    }

    public static void setPreco(double preco) {
        Secao.preco = preco;
    }

    // Método de Venda de assentos
    public boolean venda (int fileira, int assento) {
        if(this.assentos.getStatus(fileira, assento) == true) {
            this.assentos.mudarStatus(fileira, assento);
            this.quantVendida++;
            return true;
        } else {
            return false;
        }
    }

    public String getResumo () {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome Filme : ");
        sb.append(getFilme().getNome());
        sb.append(" | Horario Seção : ");
        sb.append(getHorarioSecao());
        return sb.toString();
    }

    @Override
    public String toString () {
        return this.getFilme() + " | Data Sessão : " + getDataSessao() + " | Horário Sessão : " + getHorarioSecao() + " | Quantidade Vendida : " + getQuantVendida() + " | Quantidade Presentes : " + getQuantPresentes();
    }
}