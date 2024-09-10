package C1;

public class Filme {

    private String nome;
    private int duracao;
    private String classificacao;
    private String genero;

    public Filme () {
        this.nome = "";
        this.duracao = 0;
        this.classificacao = "";
        this.genero = "";
    }

    public Filme (String nome, int duracao, String classificacao, String genero) {
        this.nome = nome;
        this.duracao = duracao;
        this.setClassificacao(classificacao);
        this.genero = genero;
    }

    public String getNome () {
        return this.nome;
    }

    public int getDuracao () {
        return this.duracao;
    }

    public String getClassificacao () {
        return this.classificacao;
    }

    public String getGenero () {
        return this.genero;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public void setDuracao (int duracao) {
        this.duracao = duracao;
    }

    public void setClassificacao (String classificacao) {
        String[] classificacoes = new String[]{"L", "10", "12", "14", "16", "18"};
        boolean found = false;

        for(int i = 0; i < classificacoes.length; i++) {
            if(classificacoes[i].equals(classificacao)) {
                found = true;
                this.classificacao = classificacao;
            }
        }

        if(!found) {
            throw new IllegalArgumentException("Classificação inválida. Genero deve ser entre 'L', '10', '12', '14', '16' ou '18'.");
        }
    }

    public void setGenero (String genero) {
        this.genero = genero;
    }

    @Override
    public String toString () {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome do Filme: ").append(this.nome).append("\n");
        sb.append("Duração: ").append(this.duracao).append(" minutos\n");
        sb.append("Genero: ").append(this.genero).append("\n");
        sb.append("Classificação: ").append(this.classificacao);
        return sb.toString();
    }
}
