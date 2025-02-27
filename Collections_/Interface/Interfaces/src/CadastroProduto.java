import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    private Set<Produto> produtoSet;

    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }

    public void mostrarPRODUTO() {

        System.out.println(produtoSet);
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {

        produtoSet.add(new Produto(cod, nome, preco, quantidade));

    }

    public Set<Produto> exibirProdutoNome() {
        // organizando por nome
        Set<Produto> produtoNome = new TreeSet<>(produtoSet);
        return produtoNome;
    }

    public Set<Produto> exibirPorPreco() {
        // organizando por nome
        Set<Produto> produtoPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoPreco.addAll(produtoSet);
        return produtoPreco;
    }

}
