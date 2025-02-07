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
}
