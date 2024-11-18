
# [CURSO ADS] Tecnologias Web II - 2024.2

### Trabalho Efetivo Discente (TED) - Uniesp

---

## Projeto: API REST de Gerenciamento de Usuários

Este projeto é parte do curso de Tecnologias Web II da Uniesp e tem como objetivo a criação de uma API REST utilizando o framework Spring Boot. O recurso central desta API é o **Usuário**, com operações CRUD (Create, Read, Update, Delete) implementadas para gerenciar os dados de usuários.

### Objetivos do Projeto

1. **Implementar uma API RESTful**: Criar endpoints para manipulação do recurso **Usuário**.
2. **Realizar operações CRUD**: Incluir métodos para criação, leitura, atualização e exclusão de usuários.

### Estrutura do Recurso `Usuario`

O recurso `Usuario` possui os seguintes campos obrigatórios:

- **Id**: Identificador único do usuário.
- **Nome**: Nome completo do usuário.
- **Email**: Endereço de e-mail do usuário.
- **Data de Nascimento**: Data de nascimento do usuário.
- **Password**: Senha do usuário.

### Endpoints da API

| Método HTTP | Endpoint             | Descrição                              |
|-------------|----------------------|----------------------------------------|
| GET         | `/usuarios`          | Obtém a lista de todos os usuários     |
| GET         | `/usuarios/{id}`     | Obtém as informações de um usuário específico por ID |
| POST        | `/usuarios`          | Adiciona um novo usuário               |
| DELETE      | `/usuarios/{id}`     | Remove um usuário específico por ID    |
| PUT         | `/usuarios/{id}`     | Edita as informações de um usuário específico por ID |

### Requisitos do Projeto

Para concluir o projeto, implemente os seguintes métodos:

1. **obterTodosOsUsuarios()**: Retorna uma lista de todos os usuários registrados.
2. **obterUsuarioPorId()**: Retorna um usuário específico baseado em seu ID.
3. **adicionarUsuario()**: Adiciona um novo usuário ao sistema.
4. **removerUsuario()**: Remove um usuário específico do sistema com base em seu ID.
5. **editarUsuario()**: Atualiza as informações de um usuário específico.

### Tecnologias Utilizadas

- **Spring Boot**: Framework principal para a construção da API REST.
- **Java**: Linguagem de programação para o desenvolvimento da aplicação.
- **MySql**: Sistema de gerenciamento de banco de dados.
- **Maven**: Gerenciador de dependências.

### Instruções para Rodar o Projeto

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/luansantosco/TecnologiasWebII
   cd TecnologiasWebII
   ```

2. **Compile e rode a aplicação**:
   ```bash
   mvn spring-boot:run
   ```

3. **Acesse a API**:
   A API estará disponível em `http://localhost:8080`.

### Considerações Finais

Este projeto tem como finalidade a aplicação prática dos conceitos de **desenvolvimento de APIs REST** com **Spring Boot**, integrando operações CRUD com manipulação de dados de usuários. 

---
