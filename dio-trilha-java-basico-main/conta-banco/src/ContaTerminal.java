import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        // Exibir as mensagens para o nosso usuário e obter os valores digitados no terminal
        System.out.print("Por favor, digite o número da Agência:");
        int agencia = scanner.nextInt();
        scanner.nextLine(); // Consumir a linha restante

        System.out.print("Agora, digite o número da conta:");
        String numero = scanner.nextLine();

        System.out.print("Em seguida, insira o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por fim, nos informe o saldo da conta:");
        double saldo = scanner.nextDouble();

        // Exibir a mensagem conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        
        // Fechar o scanner
        scanner.close();
    }
}

//To do: conhecer e importar a classe Scanner
//Exibir as mensagens para o nosso usuario
//Obter pela scanner os valores digitados no terminal
//Exibir a mensagem conta criada