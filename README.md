# Blog API

Esta é uma API simples para um sistema de blog, construída usando Spring Boot e MongoDB.
A API oferece operações básicas para gerenciar usuários, posts e comentários.


## Requisitos
Certifique-se de ter o Java e o Maven instalados em sua máquina.


### Executando a Aplicação

A aplicação utiliza o MongoDB como banco de dados. Certifique-se de ter um servidor MongoDB
em execução ou atualize as configurações no arquivo application.properties para apontar para o seu servidor MongoDB.


1. Configuração do Banco de Dados.

```bash
spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017
spring.data.mongodb.database=blogdb
```

2. Clone o repositório:
```bash
git@github.com:Phyllipesa/blog-api-spring-boot-mongodb.git
```


3. Navegue até o diretório do projeto:

```bash
cd blog-api
```


4. Execute a aplicação usando Maven:

```bash
mvn spring-boot:run
```

A aplicação será iniciada em 'http://localhost:8080'.


### Tecnologias
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![MongoDB](https://img.shields.io/badge/MongoDB-%234ea94b.svg?style=for-the-badge&logo=mongodb&logoColor=white)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)
![Git](https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white)
![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
![GitHub](https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white)


### Autores
- [@phyllipesa](https://github.com/phyllipesa) - Desenvolvimento do projeto
- [@acenelio](https://github.com/acenelio) - Commit inicial