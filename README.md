# API de Gerenciamento de Pessoas - Universidade

Esta é uma API desenvolvida para o gerenciamento de pessoas de uma universidade. A aplicação permite a criação de registros de pessoas e a consulta por ID, utilizando um banco de dados MySQL como base de dados.

## Funcionalidades

- **POST /pessoas**: Cria um registro de uma nova pessoa.
- **GET /pessoas/{id}**: Retorna uma pessoa a partir de um ID informado.

## Estrutura da Aplicação

### Entidade

A aplicação possui uma única entidade:

- **Pessoa**:
  - `nome` (String)
  - `cpf` (String)
  - `idade` (Integer)

### Banco de Dados

A base de dados utilizada é o MySQL. As variáveis de conexão com o banco de dados são:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/nome_da_base
spring.datasource.username=root
spring.datasource.password=senha
spring.jpa.hibernate.ddl-auto=update
```

### Projeto Spring

Este projeto foi gerado utilizando o [Spring Initializr](https://start.spring.io/) com as seguintes dependências:

- Spring Web
- Spring Data JPA
- MySQL Driver
- Lombok

## Passos para Execução

### Pré-requisitos

1. **Java 21+**: O projeto requer uma versão recente do JDK para ser executado.
2. **MySQL**: Instale e configure o MySQL localmente, criando um banco de dados para a aplicação.
3. **Maven**: O projeto utiliza o Maven como gerenciador de dependências.

### Como Configurar

1. Clone este repositório:
   ```bash
   git clone https://github.com/KarollineSantos/universidade_crud.git
   ```

2. Navegue até a pasta do projeto:
   ```bash
   cd universidade_crud

3. Configure o arquivo application.properties com as suas credenciais do MySQL:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/nome_da_base
   spring.datasource.username=root
   spring.datasource.password=senha
   spring.jpa.hibernate.ddl-auto=update

4. Execute o projeto utilizando o Maven:
   ```bash
   mvn spring-boot:run

### Endpoints da API

#### POST /pessoas

Cria um novo registro de pessoa na base de dados.
- **URL**: /pessoas
- **Método HTTP**: POST
- **Corpo da requisição (JSON)**:
  ```json
  {
	"id": 1,
	"nome": "Karolline Santos",
	"cpf": "12345678912",
	"idade": 20
  }

- Exemplo de Resposta:
  ```json
  {
	"id": 1,
	"nome": "Karolline Santos",
	"cpf": "12345678912",
	"idade": 20
  }

#### GET /pessoas/{id}

Cria um novo registro de pessoa na base de dados.
- **URL**: /pessoas/{id}
- **Método HTTP**: GET
- **Corpo da requisição (JSON)**:
  ```json
  {
	"id": 1,
	"nome": "Karolline Santos",
	"cpf": "12345678912",
	"idade": 20
  }

## Estrutura do Código

### Classes

- **Entity**: Representa a tabela Pessoa no banco de dados.
- **Repository**: Interface responsável pela comunicação com o banco de dados.
- **Controller**: Define os endpoints da API.
- **DTO (Data Transfer Object)**: Utilizado para a comunicação entre o cliente e o servidor.

## Tecnologias Utilizadas

- **Java 21**
- **Spring Boot**
- **Spring Data JPA**
- **MySQL**
- **Lombok**

## Integrantes do Projeto (nome completo e número de matrícula)

- **Diego Henrique Rodrigues Sawyer (01650828)**
- **Flávia Karolline Santos Melo (01609189)**
- **Pedro Fellipe Barretto Campêlo (01635193)**
