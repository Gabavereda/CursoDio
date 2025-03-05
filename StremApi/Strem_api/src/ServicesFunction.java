import java.util.Arrays;
import java.util.List;

public class ServicesFunction {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

    public void dobrarNumeros() {

        List<Integer> numerosDobrados = numeros.stream()
                // argumento tipo -> retorno 
                .map(n -> n * 2)
                // coleta para lista 
                .toList();

        numerosDobrados.forEach(System.out::println);
    }
}