public class App {
    public static void main(String[] args) throws Exception {

        Metodos metodos = new Metodos();

        double media = metodos.calculoMedia(metodos.alunos, metodos.entrada);

        System.out.printf("Média da turma %d", media);

    }
}
