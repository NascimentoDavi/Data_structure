package C1;

public class Assentos {

    // True se o assento está disponivel, e false se esta ocupado.
    private boolean disponivel[][];

    public Assentos () {
        disponivel = new boolean[5][4];
        for (int i = 0; i < disponivel.length; i++) {
            for (int j = 0; j < disponivel[i].length; j++) {
                disponivel[i][j] = true; // true significa que o assento está disponível
            }
        }
    }

    // Retorna o status do assento indexado
    public boolean getStatus (int fileira, int assento) {
        return this.disponivel[fileira][assento];
    }

    // Muda o status do assento
    public void mudarStatus (int fileira, int assento) {
        if(this.disponivel[fileira][assento] == true) {
            this.disponivel[fileira][assento] = false;
        } else {
            this.disponivel[fileira][assento] = true;
        }
    }

    // Mostra os lugares e se eles estão ocupados ou não.
    public String mostrarLugares () {
        String result = "";
        for(int i = 0; i < this.disponivel.length; i++) {
            for(int j = 0; j < this.disponivel[i].length; j++) {
                if(this.disponivel[i][j] == true) {
                    result += " | " + "  ";    
                } else {
                    result += " | " + " X ";
                }
            }
            result += "\n";
        }
        return result;
    }

}