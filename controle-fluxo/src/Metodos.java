public class Metodos {

    public void boletim() {
        int nota = 6;
        if (nota >= 7) {
            System.out.println("aprovado");

        } else {
            System.out.println("reprovado");

        }

    }

    public void caixa() {
    
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;

            System.out.println(saldo);
        } else {

        }
    }
}
