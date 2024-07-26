## Bootcamp Java Developer

Este é um projeto, proposto pela Digital Innovation One (DIO), de simulação de um Bootcamp para desenvolvedores Java. O objetivo deste projeto é demonstrar a aplicação de conceitos de Programação Orientada a Objetos (POO), como abstração, encapsulamento, herança e polimorfismo.

## Descrição

O projeto consiste em um sistema onde desenvolvedores (Devs) podem se inscrever em um Bootcamp que contém diversos conteúdos, como cursos e mentorias. Os Devs podem progredir através dos conteúdos, acumulando experiência (XP) e concluindo as atividades propostas.

## Estrutura do Projeto

O projeto é composto pelas seguintes classes principais:

- **Conteudo:** Classe abstrata base para `Curso` e `Mentoria`.
- **Curso:** Representa um curso com título, descrição e carga horária.
- **Mentoria:** Representa uma mentoria com título, descrição e data.
- **Bootcamp:** Representa um bootcamp contendo cursos e mentorias.
- **Dev:** Representa um desenvolvedor inscrito em um bootcamp, com progresso e XP acumulados.

## Funcionalidades

- **Inscrição em Bootcamp:** Devs podem se inscrever em um bootcamp, que contém uma lista de conteúdos (cursos e mentorias).
- **Progresso:** Devs podem progredir através dos conteúdos inscritos, movendo-os para a lista de conteúdos concluídos.
- **Cálculo de XP:** O sistema calcula o XP acumulado pelo Dev com base nos conteúdos concluídos.

## Diagrama de Classes

```plaintext
+-----------------------+
|        Conteudo       |
|-----------------------|
| - titulo: String      |
| - descricao: String   |
| + calcularXp(): double|
+-----------------------+
        /\
        |
        +-------------------------------------+
        |                                     |
+-----------------------+           +----------------------+
|        Curso          |           |       Mentoria       |
|-----------------------|           |----------------------|
| - cargaHoraria: int   |           | - data: LocalDate    |
| + calcularXp(): double|           |+ calcularXp(): double|
+-----------------------+           +----------------------+
        |
        +------------------------------------------------+
        |                                                |
+---------------------------+             +-------------------------------------+
|         Bootcamp          |             |                 Dev                 |
|---------------------------|             |-------------------------------------|
| - nome: String            |             | - nome: String                      |
| - descricao: String       |             | - conteudosInscritos: Set<Conteudo> |
| - dataInicio: LocalDate   |             | - conteudosConcluidos: Set<Conteudo>|
| - dataFim: LocalDate      |             | + inscreverBootcamp(Bootcamp): void |
| - conteudos: Set<Conteudo>|             | + progredir(): void                 |
+---------------------------+             | + calcularTotalXp(): double         |
                                          +-------------------------------------+
```

## Requisitos

- JDK 8 ou superior
- IDE de sua escolha (IntelliJ, Eclipse, etc.)

## Exemplo de Uso

Ao executar a classe `Main`, você verá uma saída semelhante a esta:

```plaintext
Conteúdos Inscritos Camila: [Curso{titulo='Curso Java', descricao='Descrição curso Java', cargaHoraria=8}, Curso{titulo='Curso JS', descricao='Descrição curso JS', cargaHoraria=4}, Mentoria{titulo='Mentoria de Java', descricao='Descrição mentoria Java', data=2024-07-23}]
Conteúdos Concluídos Camila: []
XP: 0.0
Conteúdos Inscritos Camila: [Curso{titulo='Curso JS', descricao='Descrição curso JS', cargaHoraria=4}, Mentoria{titulo='Mentoria de Java', descricao='Descrição mentoria Java', data=2024-07-23}]
Conteúdos Concluídos Camila: [Curso{titulo='Curso Java', descricao='Descrição curso Java', cargaHoraria=8}, Curso{titulo='Curso JS', descricao='Descrição curso JS', cargaHoraria=4}]
XP: 120.0
Camila concluiu todos os conteúdos e recebeu uma recompensa!
-------
Conteúdos Inscritos Augusto: [Curso{titulo='Curso Java', descricao='Descrição curso Java', cargaHoraria=8}, Curso{titulo='Curso JS', descricao='Descrição curso JS', cargaHoraria=4}, Mentoria{titulo='Mentoria de Java', descricao='Descrição mentoria Java', data=2024-07-23}]
Conteúdos Concluídos Augusto: []
XP: 0.0
Conteúdos Inscritos Augusto: []
Conteúdos Concluídos Augusto: [Curso{titulo='Curso Java', descricao='Descrição curso Java', cargaHoraria=8}, Curso{titulo='Curso JS', descricao='Descrição curso JS', cargaHoraria=4}, Mentoria{titulo='Mentoria de Java', descricao='Descrição mentoria Java', data=2024-07-23}]
XP: 130.0
Augusto concluiu todos os conteúdos e recebeu uma recompensa!
```

## Conclusão

Este projeto serve como um excelente exemplo de aplicação dos principais conceitos da Programação Orientada a Objetos (POO). Ao desenvolver o sistema de Bootcamp, foi possível explorar e implementar os pilares da POO, como abstração, encapsulamento, herança e polimorfismo. Através da simulação de um ambiente de aprendizado para desenvolvedores, o projeto não apenas reforça a importância da organização e estruturação do código, mas também destaca a reutilização e a manutenção eficiente que esses conceitos proporcionam.
