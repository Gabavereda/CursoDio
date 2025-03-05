import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        CadastrarConta cadastrarConta = new CadastrarConta();
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
                    cadastrarConta.cadastrarCliente();
                    break;
                case 2:
                    cadastrarConta.listaClientes();
                    break;
                case 3:
                    cadastrarConta.depositar();
                    break;
                case 4:
                    cadastrarConta.sacar();
                    break;
                case 5:
                    cadastrarConta.transferir();
                    break;
                case 6:
                    cadastrarConta.imprimirExtrato();
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
