import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import map.EstoqueProdutos;

public class App {
    public static void main(String[] args) throws Exception {
        // interface set sem elementos duplicados
        // set sem elementos aleatorios
        // map nao pode ter chaves duplicados
        // put no map tanto add quanto atualiza

        // ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        // System.out.println("Existem " + conjuntoConvidados.contarConvidado() + "
        // dentro de convidados");

        // conjuntoConvidados.adicionarConvidado("Pedro", 1234);
        // conjuntoConvidados.adicionarConvidado("ALD", 1335);
        // conjuntoConvidados.adicionarConvidado("domas", 1222234);
        // // nao sera adicionado devido duplicidade
        // conjuntoConvidados.adicionarConvidado("aALE", 1335);

        // System.out.println("Existem " + conjuntoConvidados.contarConvidado() + "
        // dentro de convidados");

        // conjuntoConvidados.removerConvidadoPorCodigo(1234);

        // AgendaContatos agendaContatos = new AgendaContatos();

        // agendaContatos.exibirContatos();

        // agendaContatos.adicionarContato("gaba", 1);
        // agendaContatos.adicionarContato("gaba vereda", 2);
        // agendaContatos.adicionarContato("verda", 3);
        // agendaContatos.adicionarContato("dada", 4);
        // agendaContatos.adicionarContato("cc", 5);

        // agendaContatos.exibirContatos();

        // System.out.println(agendaContatos.pesquisaPorNome("gaba"));
        // System.out.println(agendaContatos.pesquisaPorNomefINAL("vereda"));

        // agendaContatos.atualizarNumeroContato("gaba", 500);

        // agendaContatos.exibirContatos();

        // System.out.println(agendaContatos.pesquisaPorNome("gaba"));
        // System.out.println(agendaContatos.pesquisaPorNomefINAL("vereda"));

        // CadastroProduto cadastroProduto = new CadastroProduto();

        // cadastroProduto.adicionarProduto(1, "arroz", 15.50, 50);
        // cadastroProduto.adicionarProduto(2, "feijao", 20.50, 50);
        // cadastroProduto.adicionarProduto(3, "bata", 60.50, 50);
        // cadastroProduto.adicionarProduto(4, "carne", 50.50, 50);

        // // System.out.println(cadastroProduto.exibirPorPreco());
        // AgendaContatosMap agendaContatosMap = new AgendaContatosMap();
        // agendaContatosMap.adicionarContato("gaba", 1);
        // agendaContatosMap.adicionarContato("gaba vereda", 2);
        // agendaContatosMap.adicionarContato("verda", 3);
        // agendaContatosMap.adicionarContato("dada", 4);
        // agendaContatosMap.adicionarContato("cc", 5);

        // agendaContatosMap.exibirContatos();

        // EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        // estoqueProdutos.adicionarProduto(1, "arroz", 50.50, 10);
        // estoqueProdutos.adicionarProduto(2, "feijao", 15.50, 20);
        // estoqueProdutos.adicionarProduto(3, "bata", 15.50, 30);
        // estoqueProdutos.adicionarProduto(4, "carne", 35.50, 10);

        // System.out.println(estoqueProdutos.valorTotalEstoque());
        // System.out.println(estoqueProdutos.produtoMaisCaro());

        Set<String> coresDaBandeiraDoBrasil = new TreeSet<>(Arrays.asList("verde", "amarelo", "azul", "branco"));
        System.out.println(coresDaBandeiraDoBrasil);
    }
}
