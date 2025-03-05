import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ServicesPredicate {

    public void pegandoTamanhoTexto(List<Produto> produtos) {

        System.out.println("+++++ Produtos com menos de 5 Letras usando predicate");
        produtos.stream()
                .filter(p -> p.getNome().length() < 5)
                .forEach(System.out::println);

    }

}
