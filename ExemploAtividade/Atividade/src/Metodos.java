import java.util.concurrent.ThreadLocalRandom;

public class Metodos {
    double salarioBase = 2000.0;

    public void analisarCandidato(double salarioPretendido) {

        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar candidato");

        } else if (salarioBase == salarioPretendido) {
            System.out.println("ligar com contraProposta");

        } else {
            System.out.println("aguardar outros");
        }

    }

    public void selecaoCandidatos() {
        String candidatos[] = { "carlos", "felipe", "gomes" };
        int candidatoSelecionados = 0;
        int candidatoAtual = 0;

        while (candidatoSelecionados < 2) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("cadidato " + candidato + " Solicitou eset valor" + salarioPretendido);
            if (salarioBase >= salarioPretendido)
                System.out.println("candidato " + candidato + " selecionado");
            candidatoSelecionados++;
            {
                candidatoAtual++;

            }

        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

}