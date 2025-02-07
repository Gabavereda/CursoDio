import java.util.concurrent.ThreadLocalRandom;

public class Metodos {
    String alunos[] = { "Felipe", "Claudio", "Gomes" };

    public void forParaCarneiros() {

        for (int carneiros = 0; carneiros <= 20; carneiros++) {
            System.out.println("count sheeps " + carneiros);

        }

    }

    public void arrayExercicio() {

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("o aluno " + i + "é de nome" + alunos[i]);
        }
    }

    public void forEachExercicio() {

        for (String aluno : alunos) {
            System.out.println("nome do aluno é " + aluno);

        }

    }

    public void forWithBreakOrContinue() {

        for (int i = 1; i <= 5; i++) {

            if (i == 3)
                break;

            System.out.println("numero");

        }
    }

    public void whileExercise() {

        double mesada = 50;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada)
                valorDoce = mesada;
            System.out.println("doce valor " + valorDoce + "adiconado ao carrinho");
            mesada = mesada - valorDoce;
        }

        System.out.println("Mesada: " + mesada);
        System.out.println("fim da grana");

    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
