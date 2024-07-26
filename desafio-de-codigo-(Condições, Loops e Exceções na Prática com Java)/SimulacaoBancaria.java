//Descrição: Você está desenvolvendo um programa simples em Java para simular operações bancárias básicas. A aplicação deve permitir ao usuário realizar depósitos, saques e consultar o saldo em uma conta bancária virtual.
//Entrada: O programa exibirá um menu com as seguintes opções: Depositar, Sacar, Consultar Saldo, Encerrar. O usuário escolherá uma dessas opções digitando o número correspondente.
//Saída: Utilizando um switch, o programa realizará a operação escolhida pelo usuário.
//Se o usuário escolher:
//1: O programa solicitará o valor a ser depositado e atualizará o saldo. Além disso, deve imprimir o saldo atual com a mensagem "Saldo atual: {saldo com 1 casa decimal}".
//2: O programa solicitará o valor a ser sacado e verificará se há saldo suficiente. Sendo assim, deve imprimir "Saldo atual: {saldo com 1 casa decimal}" quando o saldo for suficiente e "Saldo insuficiente."
//3: O programa apenas exibirá o saldo atual da conta: "Saldo atual: {saldo com 1 casa decimal}".
//0: O programa encerrará, imprimindo "Programa encerrado.".

import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
            // Menu de opções
            //System.out.println("BEM VINDO - SELECIONE UMA OPÇÃO:");
            //System.out.println("1 - Depositar");
            //System.out.println("2 - Sacar");
            //System.out.println("3 - Consultar Saldo");
            //System.out.println("0 - Encerrar Programa");
            //System.out.println("Digite a Opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    //System.out.println("Por favor, insira o valor que gostaria de depositar: ");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.printf("Saldo atual: %.1f\n", saldo);
                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    //System.out.println("Por favor, insira o valor que gostaria de sacar: ");
                    double saque = scanner.nextDouble();
                    if (saque <= saldo) {
                      saldo -= saque;
                      System.out.printf("Saldo atual: %.1f\n", saldo);
                    } else {
                      System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    System.out.printf("Saldo atual: %.1f\n", saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        scanner.close();
    }
}