import java.sql.Array;
import java.util.ArrayList;
import java.util.function.Consumer;

public class App {
    public static void main(String[] args) throws Exception {
        // Stream Api
        ServicesConsumer servicesConsumer = new ServicesConsumer();
        ServiceSupplier serviceSupplier = new ServiceSupplier();
        ServicesFunction servicesFunction = new ServicesFunction();
        ServicesPredicate servicesPredicate = new ServicesPredicate();

        servicesConsumer.adicionarProduto();

        servicesPredicate.pegandoTamanhoTexto(servicesConsumer.listaProduto);

        // serviceSupplier.suplierParaNomeProduto();

        // servicesFunction.dobrarNumeros();

        // servicesConsumer.adicionarProduto();

        // servicesConsumer.valorTotalEstoque();

        // servicesConsumer.ProdutoEmBaixa();

        // Consumer recebe argumento mais parametro
        // Um metodo de chamar o consumer
        // Consumer<Produto> imprimirNum = listaProduto -> {
        // if (listaProduto.getQuantidade() < 10) {
        // System.out
        // .println("Itens com pouca quantidade " + "Nome: " + listaProduto.getNome()
        // + " Quantidade " + listaProduto.getQuantidade());

        // }

        // };

        // service.listaProduto.stream().forEach(new Consumer<Produto>() {
        // @Override
        // public void accept(Produto p) {
        // if (p.getQuantidade() == 2) {
        // System.out
        // .println("Itens com pouca quantidade " + "Nome: " + p.getNome()
        // + " Quantidade " + p.getQuantidade());
        // }
        // }
        // });
        /// Utilizando lambda
        /// puxa a lista chama stream
        /// for each em cima do argumento que é a lista

    }

    /// já a suplier não
}
