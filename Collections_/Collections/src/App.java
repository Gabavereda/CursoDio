import java.nio.channels.Pipe.SourceChannel;

import ordenaco.OrdenacaoPessoas;

public class App {
    public static void main(String[] args) throws Exception {

        // collections doesnt accepts primitive types

        // ListaTarefa listaTarefa = new ListaTarefa();

        // listaTarefa.adicionarTarefa("tarefa 1");
        // listaTarefa.adicionarTarefa("tarefa 2");
        // listaTarefa.adicionarTarefa("tarefa 3");

        // CatalagoLivros catalagoLivros = new CatalagoLivros();

        // catalagoLivros.adicionarLivro("livro1", "pedor", 1999);
        // catalagoLivros.adicionarLivro("livro2", "joao", 2015);
        // catalagoLivros.adicionarLivro("livro3", "ana", 1995);
        // catalagoLivros.adicionarLivro("livro4", "isac", 2024);
        // catalagoLivros.adicionarLivro("livro5", "ma", 2013);
        // catalagoLivros.adicionarLivro("livro6", "Fe", 1900);
        // catalagoLivros.adicionarLivro("livro7", "ands", 1850);

        // // System.out.println(catalagoLivros.pesquisarPorAutor("joao"));
        // // System.out.println(catalagoLivros.pesquisarPorItervalo(1999, 2015));
        // // System.out.println(catalagoLivros.pesquisarPorTitulo("livro7"));

        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoas("aNA", 15, 1.50);
        ordenacaoPessoas.adicionarPessoas("MARCOES ", 20, 1.50);
        ordenacaoPessoas.adicionarPessoas("VALERIA", 30, 1.75);
        ordenacaoPessoas.adicionarPessoas("pEDRO", 50, 1.90);
        ordenacaoPessoas.adicionarPessoas("aNA", 75, 1.80);

        System.out.println(ordenacaoPessoas.orderByIdade());
        System.out.println(ordenacaoPessoas.orderByAltura());
      

    }
}
