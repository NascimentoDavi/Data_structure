package C1;

import java.util.ArrayList;

public class Cinema {

    private ArrayList<Sessao> sessoes = new ArrayList<Sessao>();

    public void cadastrar (Sessao sessao) {
        sessoes.add(sessao);
    }

    public String getSessoes () {
        return sessoes.toString();
    }
}
