# Desafio de Controle de Fluxo

Este projeto foi desenvolvido como parte de um desafio proposto pela Digital Innovation One (DIO) para praticar os conceitos de controle de fluxo em Java. O objetivo do desafio é criar um programa que recebe dois números inteiros via terminal e realiza uma contagem entre esses números, exibindo cada número no console.

## Descrição do Desafio

O desafio consiste em criar um projeto que recebe dois números inteiros via terminal. O programa deve realizar as seguintes ações:

- Iterar e imprimir os números incrementados entre o menor e o maior valor.
- Lançar uma exceção personalizada (`ParametrosInvalidosException`) caso o primeiro número seja maior que o segundo.

## Implementação

A implementação foi realizada nas classes `Contador.java` e `ParametrosInvalidosException.java`.

### Passos da Implementação

1. Importação da classe `Scanner` para leitura das entradas do usuário.
2. Solicitação dos números inteiros via terminal.
3. Validação dos números:
   - Se o primeiro número for maior que o segundo, lançar a exceção `ParametrosInvalidosException` com a mensagem "O segundo parâmetro deve ser maior que o primeiro".
4. Contagem e impressão dos números entre o menor e o maior valor.
5. Exibição das mensagens no console conforme os números são incrementados.

### Estrutura do Projeto

- `ParametrosInvalidosException.java`: Classe que representa a exceção personalizada.
- `Contador.java`: Classe principal que realiza a leitura dos números, chama o método de contagem e lida com a exceção.

### Requisitos

- JDK instalado (Java Development Kit)
- Um ambiente de desenvolvimento Java (IDE) ou um terminal configurado para compilar e executar programas Java

## Como Executar

1. Clone este repositório para a sua máquina local.
2. Navegue até o diretório do projeto.
3. Compile os arquivos Java usando o comando:
   ```sh
   javac ParametrosInvalidosException.java Contador.java
   ```
4. Execute o programa usando o comando:
   ```sh
   java Contador
   ```

## Exemplo de Uso

Ao executar o programa, você será solicitado a inserir dois números inteiros. Se os números inseridos forem `12` e `30`, o programa imprimirá os números incrementados entre esses valores.

Exemplo de execução:
```
Digite o primeiro número: 12
Digite o segundo número: 30
Imprimindo o número 1
Imprimindo o número 2
Imprimindo o número 3
...
Imprimindo o número 18
```

Se o primeiro número for maior que o segundo, uma exceção será lançada e a seguinte mensagem será exibida:
```
O segundo parâmetro deve ser maior que o primeiro
```

## Conclusão

Este projeto foi uma excelente oportunidade para praticar os conceitos de controle de fluxo em Java, manipulação de entrada de dados via terminal e tratamento de exceções. A experiência ajuda a solidificar a compreensão desses conceitos fundamentais, que são essenciais para qualquer desenvolvedor Java.
