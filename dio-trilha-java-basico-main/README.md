# Projeto ContaBanco

Este projeto foi desenvolvido como parte de um desafio proposto pela Digital Innovation One (DIO) para praticar os conceitos de sintaxe de Java. O objetivo do desafio é criar um programa que simula a criação de uma conta bancária, coletando informações do usuário via terminal e exibindo uma mensagem de confirmação.

## Descrição do Desafio

O desafio consiste em criar um projeto chamado `ContaBanco` que recebe dados via terminal contendo as características de uma conta bancária, conforme os atributos abaixo:

- **Número da Agência:** String (Exemplo: 067-8)
- **Número da Conta:** String (Exemplo: 1021)
- **Nome do Cliente:** String (Exemplo: MARIO ANDRADE)
- **Saldo da Conta:** Decimal (Exemplo: 237.48)

O programa deve permitir que os dados sejam inseridos via terminal, com o usuário recebendo mensagens de qual informação está sendo solicitada. Após a inserção de todas as informações, o sistema deve exibir uma mensagem de confirmação.

## Implementação

A implementação foi realizada na classe `ContaTerminal.java`, que contém o método `main` responsável por executar o programa.

### Passos da Implementação

1. Importação da classe `Scanner` para leitura das entradas do usuário.
2. Solicitação das informações da conta (número da agência, número da conta, nome do cliente e saldo da conta) via terminal.
3. Leitura e armazenamento das entradas do usuário.
4. Exibição de uma mensagem final agradecendo o cliente e mostrando as informações inseridas.

### Requisitos

- JDK instalado (Java Development Kit)
- Um ambiente de desenvolvimento Java (IDE) ou um terminal configurado para compilar e executar programas Java

## Como Executar

1. Clone este repositório para a sua máquina local.
2. Navegue até o diretório do projeto.
3. Compile o programa usando o comando:
   ```sh
   javac ContaTerminal.java
   ```
4. Execute o programa usando o comando:
   ```sh
   java ContaTerminal
   ```

## Conclusão

Este projeto foi uma excelente oportunidade para praticar os conceitos básicos de sintaxe em Java, manipulação de entrada de dados via terminal e formatação de strings. A experiência ajuda a solidificar a compreensão desses conceitos fundamentais, que são essenciais para qualquer desenvolvedor Java.
