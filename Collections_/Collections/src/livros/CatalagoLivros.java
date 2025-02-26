package livros;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {

    private List<Livro> livrosLista;

    public CatalagoLivros() {
        this.livrosLista = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {

        livrosLista.add(new Livro(autor, titulo, anoPublicacao));

    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livroPorAutor = new ArrayList<>();

        if (!livrosLista.isEmpty()) {
            for (Livro livro : livrosLista) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livroPorAutor.add(livro);
                }

            }
        }
        return livroPorAutor;
    }

    public List<Livro> pesquisarPorItervalo(int anoInicial, int anoFinal) {
        List<Livro> livroPorAno = new ArrayList<>();

        if (!livrosLista.isEmpty()) {
            for (Livro livro : livrosLista) {
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                    livroPorAno.add(livro);
                }

            }
        }
        return livroPorAno;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroTitulo = null;

        if (!livrosLista.isEmpty()) {

            for (Livro livro : livrosLista) {

                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroTitulo = livro;
                    break;
                }
            }
        }
        return livroTitulo;
    }
}
