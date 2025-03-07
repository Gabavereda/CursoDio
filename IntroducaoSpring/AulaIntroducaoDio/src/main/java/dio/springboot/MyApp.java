package dio.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner {
    // injection
    @Autowired
    Calculadora calculadora;

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Resultdo é " + calculadora.somar(12, 12));
    }

}
