### API RESTful de Gerenciamento de Produtos com Spring Boot

Este projeto, proposto pela Digital Inovation One (DIO), demonstra a criação de uma API RESTful simples para gerenciamento de produtos, utilizando Spring Boot, JPA/Hibernate e H2 Database. O padrão de projeto Factory Method com Singleton é aplicado para gerenciar a instância do serviço de produtos.

### Descrição

A API oferece as seguintes funcionalidades:

- **Criar um novo produto:** Permite adicionar um novo produto ao sistema, especificando seu nome e preço.
- **Listar todos os produtos:** Retorna uma lista com todos os produtos cadastrados.

### Tecnologias Utilizadas

- **Spring Boot:** Framework para desenvolvimento rápido de aplicações Java.
- **Spring Web:** Módulo do Spring para criação de APIs REST.
- **Spring Data JPA:** Simplifica o acesso a dados com JPA.
- **Hibernate:** Implementação do JPA para mapeamento objeto-relacional.
- **H2 Database:** Banco de dados em memória para desenvolvimento e testes.
- **Maven:** Gerenciador de dependências e ferramenta de build.
- **JUnit e Mockito:** Frameworks para testes unitários e de integração.

### Padrão de Projeto: Factory Method com Singleton

O padrão Factory Method é utilizado para criar instâncias do serviço de produtos (`ProductService`), encapsulando a lógica de criação e oferecendo flexibilidade para futuras extensões. O padrão Singleton garante que apenas uma instância do serviço seja criada e utilizada em toda a aplicação.

### Como Executar

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/seu-usuario/studyproject.git
   ```

2. **Acesse o diretório do projeto:**
   ```bash
   cd studyproject
   ```

3. **Execute a aplicação:**
   ```bash
   mvn spring-boot:run
   ```

4. **Acesse a API:**
   - **Criar produto:** `POST http://localhost:8080/products` (corpo da requisição: `{ "name": "Nome do Produto", "price": 10.99 }`)
   - **Listar produtos:** `GET http://localhost:8080/products`

### Conclusão

Este projeto serve como base para o desenvolvimento de APIs RESTful mais complexas com Spring Boot. Ele demonstra boas práticas de organização de código, uso de padrões de projeto e criação de testes automatizados.

**---alguns próximos passos para melhor implementação do projeto:**

- Implementar outras operações CRUD (atualizar e deletar produtos).
- Adicionar autenticação e autorização.
- Utilizar um banco de dados persistente (MySQL, PostgreSQL, etc.).
- Criar uma interface de usuário (frontend) para interagir com a API.
