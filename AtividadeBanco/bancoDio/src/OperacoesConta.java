import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OperacoesConta {
    private Scanner entrada = new Scanner(System.in);
    private List<Conta> listaContas = new ArrayList<>();

    public void cadastrarCliente() {
        System.out.print("\nNome do cliente: ");
        String nomeDoCliente = entrada.next();
        Cliente cliente = new Cliente();
        cliente.setNome(nomeDoCliente);

        Conta cc = new ContaCorrente(cliente);
        listaContas.add(cc);

        System.out.println("Cliente cadastrado com sucesso! Conta criada: " + cc.getNumero());
    }

    public void listaClientes() {
        if (listaContas.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }
        System.out.println("\n=== Clientes Cadastrados ===");
        for (Conta conta : listaContas) {
            System.out.println("Conta: " + conta.getNumero() + " | Titular: " + conta.getCliente().getNome());
        }
    }

    public Conta buscarConta() {
        System.out.print("\nNúmero da conta: ");
        int numeroConta = entrada.nextInt();
        for (Conta conta : listaContas) {
            if (conta.getNumero() == numeroConta) {
                return conta;
            }
        }
        System.out.println("Conta não encontrada!");
        return null;
    }

    public void depositar() {
        Conta conta = buscarConta();
        if (conta != null) {
            System.out.print("Valor do depósito: ");
            double valor = entrada.nextDouble();
            conta.depositar(valor);
            System.out.println("Depósito realizado com sucesso!");
        }
    }

    public void sacar() {
        Conta conta = buscarConta();
        if (conta != null) {
            System.out.print("Valor do saque: ");
            double valor = entrada.nextDouble();
            conta.sacar(valor);
            System.out.println("Saque realizado com sucesso!");
        }
    }

    public void transferir() {
        System.out.println("\nConta de origem:");
        Conta contaOrigem = buscarConta();
        if (contaOrigem != null) {
            System.out.println("\nConta de destino:");
            Conta contaDestino = buscarConta();
            if (contaDestino != null) {
                System.out.print("Valor da transferência: ");
                double valor = entrada.nextDouble();
                contaOrigem.transferir(valor, contaDestino);
                System.out.println("Transferência realizada com sucesso!");
            }
        }
    }

    public void imprimirExtrato() {
        Conta conta = buscarConta();
        if (conta != null) {
            conta.imprimirExtrato();
        }
    }
}
