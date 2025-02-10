import java.util.Scanner;

public class Metodos {
    Scanner entrada = new Scanner(System.in);
    String alunos[] = { "Camila", "Lucaas", "bruno", "Aline" };

    static double calculoMedia(String[] alunos, Scanner entrada) {
        double soma = 0;

        for (String aluno : alunos) {
            System.out.printf("nota do aluno %s: ", aluno);
            double nota = entrada.nextDouble();
            soma += nota;

        }
        return soma / alunos.length;
    }
}
