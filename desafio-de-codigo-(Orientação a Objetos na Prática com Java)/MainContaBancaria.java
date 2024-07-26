//Descrição: Você está desenvolvendo um programa simples em Java para representar uma conta bancária. Utilizando programação orientada a objetos (POO), você criará uma classe ContaBancaria com um construtor que permitirá a inicialização da conta com um saldo inicial.
//Entrada: O programa solicitará ao usuário que informe o saldo inicial da conta. Em seguida, o programa solicitará ao usuário que realize transações de depósito e saque.
//Saída: A classe ContaBancaria conterá métodos para realizar depósitos e saques, atualizando o saldo da conta. O saldo atual será exibido após cada transação. Se o valor do saque for maior que o saldo disponível na conta, imprima uma mensagem informando: Saldo insuficiente. Saque não realizado.

import java.util.Scanner;

public class MainContaBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Criar uma nova conta bancária com o saldo inicial
        double saldoInicial = scanner.nextDouble();
        ContaBancaria conta = new ContaBancaria(saldoInicial);

        // Lê a Entrada com o valor do deposito e aciona o método "depositar"
        double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);

        // Lê a Entrada com o valor do saque e aciona o método "sacar"
        double valorSaque = scanner.nextDouble();
        conta.sacar(valorSaque);

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}

class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        // TODO: Incrementar o saldo com o valor e imprimir "Deposito feito."
        this.saldo += valor;
        System.out.println("Deposito feito.");
        imprimirSaldo();
    }

    public void sacar(double valor) {
        // TODO: Verificar se o saldo é suficiente considerando o valor:
        // Se sim, atualizar o saldo e imprimir "Saque feito."
        // Se não, imprimir "Saldo insuficiente. Saque não realizado."
        if (this.saldo >= valor) {
          this.saldo -= valor;
          System.out.println("Saque feito.");
        } else {
          System.out.println("Saldo insuficiente. Saque nao realizado");
        }
        imprimirSaldo();
    }
    
    private void imprimirSaldo() {
        System.out.printf("Saldo atual: %.1f\n", this.saldo);
    }

}