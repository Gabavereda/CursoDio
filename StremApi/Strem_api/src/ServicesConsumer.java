import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServicesConsumer {

    List<Produto> listaProduto = new ArrayList<>();

    public void adicionarProduto() {
        Scanner entrada = new Scanner(System.in);
        int opc = 0;
        int id = 1;

        do {
            Produto produto = new Produto();
            System.out.println("nome ");
            String nome = entrada.next();
            produto.setNome(nome);

            System.out.println("quantidade ");
            int quantidade = entrada.nextInt();
            produto.setQuantidade(quantidade);

            System.out.println("preco ");
            double preco = entrada.nextDouble();
            produto.setPreco(preco);

            // Seta ID
            produto.setId(id);
            id++;

            // Adiciona direto na lista do service
            listaProduto.add(produto);

            System.out.println("Deseja adicionar mais? [1] Não [0] Sim");
            opc = entrada.nextInt();

        } while (opc == 0);
        for (Produto p : listaProduto) {
            // le

            System.out.println(p);

        }
    }

    public void valorTotalEstoque() {

        System.out.println("Valor total em estoque: " + listaProduto.stream()
                .mapToDouble(produto -> produto.getQuantidade() * produto.getPreco())
                .sum());
    }

    public void ProdutoEmBaixa() {

        listaProduto.forEach(p -> {
            if (p.getQuantidade() <= 2) {
                System.out
                        .println("Itens com pouca quantidade " + "Nome: " + p.getNome()
                                + " Quantidade " + p.getQuantidade());
            }
        });
    }

}