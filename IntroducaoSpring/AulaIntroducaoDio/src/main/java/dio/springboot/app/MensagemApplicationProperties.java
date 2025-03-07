package dio.springboot.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MensagemApplicationProperties implements CommandLineRunner {

    @Autowired
    private Remetente remetente;

    // // call for applicationProperties
    // @Value("${name}") // ifDontFind @Value("${nome:outroNome}")
    // private String name;
    // @Value("${email}")
    // private String email;
    // @Value("${telefones}")
    // private List<Long> telefones;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(
                "mensagem enviada " + '\n' +
                        "Nome " + remetente.getName() + '\n' +
                        "Email " + remetente.getEmail() + '\n' +
                        "Telefone " + remetente.getTelefones());
        System.out.println("Aprovedd! ");
    }

}
