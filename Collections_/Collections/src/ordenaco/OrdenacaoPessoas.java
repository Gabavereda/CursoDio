package ordenaco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoas> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoas(String nome, int idade, double Altura) {
        pessoaList.add(new Pessoas(nome, idade, Altura));

    }

    public List<Pessoas> orderByIdade() {
        List<Pessoas> pessoasIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasIdade);

        return pessoasIdade;
    }

    public List<Pessoas> orderByAltura() {
        List<Pessoas> pessoaAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaAltura, new ComparatorPorAltura());

        return pessoaAltura;
    }

}
