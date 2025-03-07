package dio.springboot.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MensagemApplicationProperties implements CommandLineRunner {

    // call for applicationProperties
    @Value("${nome}")
    private String name;
    @Value("${email}")
    private String email;
    @Value("${telefones}")
    private List<Long> telefones;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(
                "mensagem enviada " + '\n' +
                        "Nome " + name + '\n' +
                        "Email " + email +'\n' +
                        "Telefone " + telefones);
        System.out.println("Aprovedd! ");
    }

}
