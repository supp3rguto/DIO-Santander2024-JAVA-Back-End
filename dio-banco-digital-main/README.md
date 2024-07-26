## Projeto Banco Digital

Este projeto foi desenvolvido como parte de um desafio proposto pela Digital Innovation One (DIO) e tem como objetivo reforçar o conhecimento em Programação Orientada a Objetos (POO) em Java, através da implementação de um sistema bancário digital. O sistema permite a criação de clientes e contas (Corrente e Poupança), além de realizar operações bancárias básicas como depósito, saque, transferência e visualização de extratos.

## Funcionalidades

- Adicionar clientes com contas Corrente ou Poupança.
- Realizar depósitos, saques e transferências entre contas.
- Visualizar o extrato das contas.
- Exibir detalhes da conta criada (número da conta e agência).

## Conceitos de POO Aplicados

- **Abstração**: Criação de classes representando entidades do domínio bancário (Banco, Cliente, Conta).
- **Encapsulamento**: Manutenção do estado interno dos objetos, expondo apenas métodos necessários para interação externa.
- **Herança**: Utilização de classes base (Conta) e derivadas (ContaCorrente e ContaPoupanca).
- **Polimorfismo**: Capacidade de tratar objetos derivados (ContaCorrente e ContaPoupanca) como objetos da classe base (Conta).

## Estrutura do Projeto

```plaintext
src/
├── Banco.java
├── Cliente.java
├── Conta.java
├── ContaCorrente.java
├── ContaPoupanca.java
└── Main.java
```

- **Banco.java**: Classe responsável por gerenciar as contas do banco.
- **Cliente.java**: Classe que representa um cliente do banco.
- **Conta.java**: Classe base abstrata para as contas do banco.
- **ContaCorrente.java**: Classe que representa uma conta corrente.
- **ContaPoupanca.java**: Classe que representa uma conta poupança.
- **Main.java**: Classe principal que contém a lógica de interação com o usuário.

## Exemplo de Uso

1. Execute o programa.
2. Adicione clientes e escolha o tipo de conta (Corrente ou Poupança).
3. Realize operações bancárias como depósitos, saques, transferências e visualize extratos.
4. Continue adicionando clientes e realizando operações conforme necessário.

### Exemplo de Interação

```
=== Bem-vindo ao Banco Digital ===
Digite o nome do Cliente: João
Escolha o tipo de conta (1 - Corrente, 2 - Poupança): 1
Conta criada com sucesso!
Número da conta: 1
Agência: 1

Deseja adicionar outro cliente? (s/n): s
Digite o nome do Cliente: Maria
Escolha o tipo de conta (1 - Corrente, 2 - Poupança): 2
Conta criada com sucesso!
Número da conta: 2
Agência: 1

Deseja adicionar outro cliente? (s/n): n

=== Menu de Operações ===
1. Depósito
2. Saque
3. Transferência
4. Extrato
5. Sair
Escolha uma operação: 1
Escolha a conta (número da conta): 1
Digite o valor do depósito: 500
Depósito realizado com sucesso!
```

### Conclusão

Este projeto de Banco Digital em Java foi desenvolvido com o objetivo de reforçar e aplicar os conceitos fundamentais da Programação Orientada a Objetos. Através da criação de clientes, contas bancárias e operações básicas, conseguimos explorar os pilares da POO como abstração, encapsulamento, herança e polimorfismo. 

Além de ser um excelente exercício para solidificar conhecimentos teóricos, este projeto também serve como um exemplo prático de como esses conceitos podem ser utilizados no desenvolvimento de sistemas reais.
