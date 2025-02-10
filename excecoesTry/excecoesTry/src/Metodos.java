import java.util.Scanner;

public class Metodos {

    public void cadastrarPessoa() {
        String nome;
        String cpf;
        String telefone;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o seu nome");

        nome = entrada.nextLine();

        System.out.println("Seu cpf");

        cpf = entrada.nextLine();

        System.out.println("Seu telefone ");

        telefone = entrada.nextLine();

    }

}
