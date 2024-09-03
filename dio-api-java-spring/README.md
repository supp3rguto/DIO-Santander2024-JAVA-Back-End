# Projeto Spring Boot 3 - Java 17 - Railway
## Descrição

Este projeto, proposto pela Digital Inovation One (DIO), é uma API RESTful desenvolvida em Java utilizando o framework Spring Boot. A API gerencia uma concessionária de tratores da John Deere, permitindo a criação, leitura, atualização e exclusão de informações relacionadas aos tratores, clientes e vendas. Este projeto foi desenvolvido como parte de um desafio prático e visa demonstrar o uso de tecnologias modernas para construção de aplicações robustas e escaláveis.

## Tecnologias Utilizadas

- **Java 17**: A versão LTS mais recente do Java, oferecendo diversas melhorias de desempenho e novas funcionalidades.
- **Spring Boot 2.7.6**: Framework que facilita a criação de aplicações standalone e de produção prontas para produção com o mínimo esforço de configuração.
- **Spring Data JPA**: Simplifica o acesso aos dados relacionais na aplicação, eliminando a necessidade de muito boilerplate code.
- **Spring Security**: Fornece autenticação e controle de acesso robustos para proteger a API.
- **H2 Database**: Banco de dados em memória usado para desenvolvimento e testes.
- **Lombok**: Biblioteca que reduz o boilerplate code através de anotações.
- **Gradle 7.3**: Ferramenta de automação de build que simplifica o gerenciamento de dependências e o processo de build.
- **Railway**: Plataforma de deployment para aplicações na nuvem.

## Estrutura do Projeto

```plaintext
tractors/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── johndeere/
│   │   │           └── tractors/
│   │   │               ├── controller/
│   │   │               │   └── TractorController.java
│   │   │               ├── model/
│   │   │               │   ├── Tractor.java
│   │   │               │   ├── Cliente.java
│   │   │               │   ├── Venda.java
│   │   │               │   └── Endereco.java
│   │   │               ├── repository/
│   │   │               │   ├── TractorRepository.java
│   │   │               │   ├── ClienteRepository.java
│   │   │               │   └── VendaRepository.java
│   │   │               ├── service/
│   │   │               │   ├── TractorService.java
│   │   │               │   ├── ClienteService.java
│   │   │               │   └── VendaService.java
│   │   │               ├── dto/
│   │   │               │   ├── TractorDTO.java
│   │   │               │   ├── ClienteDTO.java
│   │   │               │   └── VendaDTO.java
│   │   │               ├── exception/
│   │   │               │   ├── ResourceNotFoundException.java
│   │   │               │   └── GlobalExceptionHandler.java
│   │   │               ├── config/
│   │   │               │   └── SecurityConfig.java
│   │   │               └── DIOJavaRailwayProjectApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── com/
│               └── johndeere/
│                   └── tractors/
│                       └── DIOJavaRailwayProjectApplicationTests.java
├── .gitignore
├── build.gradle
├── gradlew
├── gradlew.bat
├── HELP.md
├── Procfile
└── settings.gradle
```

## Funcionalidades

### Endpoints

- **/tractors**: 
  - `GET /tractors`: Lista todos os tratores.
  - `GET /tractors/{id}`: Retorna detalhes de um trator específico.
  - `POST /tractors`: Adiciona um novo trator.
  - `PUT /tractors/{id}`: Atualiza as informações de um trator existente.
  - `DELETE /tractors/{id}`: Remove um trator.

- **/clientes**: 
  - `GET /clientes`: Lista todos os clientes.
  - `GET /clientes/{id}`: Retorna detalhes de um cliente específico.
  - `POST /clientes`: Adiciona um novo cliente.
  - `PUT /clientes/{id}`: Atualiza as informações de um cliente existente.
  - `DELETE /clientes/{id}`: Remove um cliente.

- **/vendas**: 
  - `GET /vendas`: Lista todas as vendas.
  - `GET /vendas/{id}`: Retorna detalhes de uma venda específica.
  - `POST /vendas`: Registra uma nova venda.
  - `PUT /vendas/{id}`: Atualiza as informações de uma venda existente.
  - `DELETE /vendas/{id}`: Remove uma venda.

### Segurança

A segurança da aplicação é gerenciada pelo Spring Security, que desativa o CSRF e permite todas as requisições para os endpoints definidos.

### Documentação da API

A documentação da API pode ser acessada através do Swagger UI, que é configurado automaticamente pelo Spring Boot para fornecer uma interface gráfica para testar e documentar os endpoints.

## Deploy

O deploy da aplicação é feito na plataforma Railway. Para configurar o deploy, siga os passos:

1. Crie um novo projeto no Railway.
2. Conecte seu repositório GitHub ao Railway.
3. Configure o `Procfile` para especificar como iniciar a aplicação:
   ```
   web: java -jar build/libs/tractors-0.0.1-SNAPSHOT.jar
   ```
4. Configure as variáveis de ambiente necessárias.
5. Inicie o deploy no Railway.

## Conclusão

Este projeto demonstra como criar uma API RESTful robusta e segura utilizando Java e Spring Boot. Com uma estrutura bem definida e uso de boas práticas, a aplicação é fácil de manter e escalar. A integração com plataformas de deploy como Railway facilita a publicação e gestão da aplicação na nuvem.
