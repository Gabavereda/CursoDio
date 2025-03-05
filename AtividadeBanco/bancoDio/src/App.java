import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        OperacoesConta operacoesConta = new OperacoesConta();
        Scanner entrada = new Scanner(System.in);
        int opc;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Ver Clientes");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Transferir");
            System.out.println("6 - Imprimir Extrato");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opc = entrada.nextInt();

            switch (opc) {
                case 1:
                    operacoesConta.cadastrarCliente();
                    break;
                case 2:
                    operacoesConta.listaClientes();
                    break;
                case 3:
                    operacoesConta.depositar();
                    break;
                case 4:
                    operacoesConta.sacar();
                    break;
                case 5:
                    operacoesConta.transferir();
                    break;
                case 6:
                    operacoesConta.imprimirExtrato();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opc != 0);

        entrada.close();
    }
}
