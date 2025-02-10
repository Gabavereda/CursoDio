import java.util.InputMismatchException;
import java.util.Scanner;

public class Metodos {

    public void cadastrarPessoa() {
        String nome;
        int cpf;
        String telefone;
        double altura;

        Scanner entrada = new Scanner(System.in);

        try {
            System.out.println("Qual o seu nome");

            nome = entrada.nextLine();

            System.out.println("Seu cpf");

            cpf = entrada.nextInt();

            System.out.println("Seu telefone ");

            telefone = entrada.nextLine();

            System.out.println("e por fim sua altura ");

            altura = entrada.nextDouble();

            entrada.close();
        } catch (InputMismatchException e) {
            System.out.println("Os dados foram errados");

        }

    }

}
