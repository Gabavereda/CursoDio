package map;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, ProdutoMap> estoqueProdutoMap;

    public EstoqueProdutos() {
        this.estoqueProdutoMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        // PASSA A KEY NO PUT
        estoqueProdutoMap.put(cod, new ProdutoMap(nome, preco, quantidade));

    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutoMap);
    }

    public double valorTotalEstoque() {
        double valorTotalEstoqueEmestoque = 0d;
        if (!estoqueProdutoMap.isEmpty()) {
            for (ProdutoMap p : estoqueProdutoMap.values()) {
                valorTotalEstoqueEmestoque += p.getQuantidade() * p.getPreco();

            }
        }
        return valorTotalEstoqueEmestoque;
    }

    public ProdutoMap produtoMaisCaro() {
        ProdutoMap produtoCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        if (!estoqueProdutoMap.isEmpty()) {
            for (ProdutoMap p : estoqueProdutoMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoCaro = p;

                }
            }
        }
        return produtoCaro;
    }

}
