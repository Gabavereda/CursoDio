public class App {
    public static void main(String[] args) throws Exception {
        Metodos metodos = new Metodos();

        // metodos.selecaoCandidatos();
        // metodos.imprimirCandidadtos();
        for (String candidato : metodos.getCandidatos()) {
            metodos.entrandoEmContato(candidato);

        }
    }
}
