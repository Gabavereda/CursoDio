import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ServiceSupplier {

    List<Produto> listaDeProdutos = new ArrayList<>();

    List<String> listaSupplier = Stream.generate(
            () -> "Nome do produto")
            .limit(2)
            .toList();

    public void suplierParaNomeProduto() {

        listaSupplier.forEach(System.out::println);

    }

}
