package dio.springboot.app;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

// pair to applications
@Configuration
@ConfigurationProperties(prefix = "remetente") // adiciona um prefixo no caso o que esta estabelecido em appProperties
public class Remetente {

    private String name;
    private String email;
    private List<Long> telefones;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Long> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Long> telefones) {
        this.telefones = telefones;
    }

}
