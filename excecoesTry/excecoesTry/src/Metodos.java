import java.util.InputMismatchException;
import java.util.Scanner;

public class Metodos {

    public void cadastrarPessoa() {
        String nome;
        String cpf;
        String telefone;
        double altura;

        Scanner entrada = new Scanner(System.in);

        try {
            System.out.println("Qual o seu nome");

            nome = entrada.nextLine();

            System.out.println("Seu cpf");

            cpf = entrada.nextLine();

            System.out.println("Seu telefone ");

            telefone = entrada.nextLine();

            System.out.println("e por fim sua altura ");

            altura = entrada.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Os dados foram errados");

        }

    }

}
