import java.util.Scanner;

public class Metodos {

    Scanner entrada = new Scanner(System.in);

    public boolean desligarVideo(boolean situacao) {

        System.out.println("ligado?");

        String resposta = entrada.nextLine();

        if (resposta.equalsIgnoreCase("nao")) {
            situacao = false;
        }

        return situacao;
    }

    public void somar() {

        int numero1 = 4;
        int numero2 = 4;
        int resultado = numero1 + numero2;
        System.out.println(resultado);
    }

    public int multiplicar(int numero1, int numero2) {
        System.out.println("digite um valor");
        int resposta1 = entrada.nextInt();
        System.out.println("digite um valor");
        int resposta2 = entrada.nextInt();

        int resultado = resposta1 * resposta2;

        return resultado;

    }

    public static void main(String[] args) {

        Metodos metodos = new Metodos();
        boolean ligado = true;

        ligado = metodos.desligarVideo(ligado);

        System.out.println("situacao do video " + ligado);

        metodos.somar();

        metodos.multiplicar(0, 0);

    }
}
