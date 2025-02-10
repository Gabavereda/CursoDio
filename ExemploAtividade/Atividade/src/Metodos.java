import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Metodos {

    public double salarioBase = 2000.0;
    public String candidatos[] = { "carlos", "felipe", "gomes" };

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String[] getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(String[] candidatos) {
        this.candidatos = candidatos;
    }

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

        int candidatoSelecionados = 0;
        int candidatoAtual = 0;

        while (candidatoSelecionados < 2 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            // %f formatt string /
            System.out.println("cadidato " + candidato + " Solicitou eset valor " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("o candidato " + candidato + " selecionado");
                candidatoSelecionados++;
            }
            candidatoAtual++;

        }

    }

    public void imprimirCandidadtos() {

        for (String candidato : candidatos) {
            System.out.println("cadndidatos escolhidos " + candidato);

        }

    }

    public static void entrandoEmContato(String candidato) {

        int tentativaFeitas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativaFeitas++;

            } else {
                System.out.println("estabeleceu contato");
            }

        } while (continuarTentando && tentativaFeitas < 3);
        if (atendeu) {
            System.out.println("consegui contato com " + candidato + " na " + tentativaFeitas + " tentativa");

        } else {
            System.out.println(
                    "nao conseguimos contato com " + candidato + " numero de tentativas feitas " + tentativaFeitas);

        }

    }

    // auxiliares
    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

}