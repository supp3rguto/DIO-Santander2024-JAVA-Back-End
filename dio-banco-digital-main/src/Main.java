import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco("Banco Digital");

        System.out.println("=== Bem-vindo ao Banco Digital ===");

        boolean continuarAdicionandoClientes = true;

        while (continuarAdicionandoClientes) {
            System.out.print("Digite o nome do Cliente: ");
            String nomeCliente = scanner.nextLine();
            Cliente cliente = new Cliente(nomeCliente);

            System.out.print("Escolha o tipo de conta (1 - Corrente, 2 - Poupança): ");
            int tipoConta = scanner.nextInt();
            scanner.nextLine();

            Conta conta;
            if (tipoConta == 1) {
                conta = new ContaCorrente(cliente);
            } else {
                conta = new ContaPoupanca(cliente);
            }

            banco.adicionarConta(conta);

            System.out.println("Conta criada com sucesso!");
            System.out.println("Número da conta: " + conta.getNumero());
            System.out.println("Agência: " + conta.getAgencia());

            System.out.print("Deseja adicionar outro cliente? (s/n): ");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("n")) {
                continuarAdicionandoClientes = false;
            }
        }

        boolean continuarOperacoes = true;

        while (continuarOperacoes) {
            System.out.println("\n=== Menu de Operações ===");
            System.out.println("1. Depósito");
            System.out.println("2. Saque");
            System.out.println("3. Transferência");
            System.out.println("4. Extrato");
            System.out.println("5. Sair");

            System.out.print("Escolha uma operação: ");
            int operacao = scanner.nextInt();

            switch (operacao) {
                case 1:
                    System.out.print("Escolha a conta (número da conta): ");
                    int numeroContaDeposito = scanner.nextInt();
                    System.out.print("Digite o valor do depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    Conta contaDeposito = banco.getContaPorNumero(numeroContaDeposito);
                    if (contaDeposito != null) {
                        contaDeposito.depositar(valorDeposito);
                        System.out.println("Depósito realizado com sucesso!");
                    } else {
                        System.out.println("Conta não encontrada!");
                    }
                    break;
                case 2:
                    System.out.print("Escolha a conta (número da conta): ");
                    int numeroContaSaque = scanner.nextInt();
                    System.out.print("Digite o valor do saque: ");
                    double valorSaque = scanner.nextDouble();
                    Conta contaSaque = banco.getContaPorNumero(numeroContaSaque);
                    if (contaSaque != null) {
                        contaSaque.sacar(valorSaque);
                        System.out.println("Saque realizado com sucesso!");
                    } else {
                        System.out.println("Conta não encontrada!");
                    }
                    break;
                case 3:
                    System.out.print("Digite o número da conta de origem: ");
                    int numeroContaOrigem = scanner.nextInt();
                    System.out.print("Digite o número da conta de destino: ");
                    int numeroContaDestino = scanner.nextInt();
                    System.out.print("Digite o valor da transferência: ");
                    double valorTransferencia = scanner.nextDouble();
                    Conta contaOrigem = banco.getContaPorNumero(numeroContaOrigem);
                    Conta contaDestino = banco.getContaPorNumero(numeroContaDestino);
                    if (contaOrigem != null && contaDestino != null) {
                        contaOrigem.transferir(valorTransferencia, contaDestino);
                        System.out.println("Transferência realizada com sucesso!");
                    } else {
                        System.out.println("Conta de origem ou destino não encontrada!");
                    }
                    break;
                case 4:
                    System.out.print("Escolha a conta (número da conta): ");
                    int numeroContaExtrato = scanner.nextInt();
                    Conta contaExtrato = banco.getContaPorNumero(numeroContaExtrato);
                    if (contaExtrato != null) {
                        contaExtrato.imprimirExtrato();
                    } else {
                        System.out.println("Conta não encontrada!");
                    }
                    break;
                case 5:
                    continuarOperacoes = false;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scanner.close();
        System.out.println("Obrigado por utilizar o Banco Digital!");
    }
}
