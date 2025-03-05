# Blog API

Blog API é um projeto Java Spring que utiliza um banco de dados MongoDB em um contêiner Docker.
O projeto oferece funcionalidades para gerenciamento de usuários e posts em um ambiente simulado de blog.
A aplicação fornece operações básicas CRUD para usuários, incluindo criação, leitura,
atualização e exclusão, e também permite a busca de posts por título e por critérios avançados
como texto e intervalo de datas. Este projeto demonstra o uso do Spring Boot em conjunto com o MongoDB
em um ambiente Dockerizado, fornecendo uma API RESTful para interação com os recursos disponíveis.

### Requisitos
Certifique-se de ter o Java, Maven e Docker instalados em sua máquina.

### Executando a Aplicação

1. Crie e execute um contêiner MongoDB.
   ```bash
   docker run --name mongodb_v6 -d -p 27017:27017 mongo:7.0
   ```

2. Clone o repositório.
   ```bash
   git@github.com:Phyllipesa/blog-api-spring-boot-mongodb.git
   ```

3. Abra o projeto utilizando a IDE de preferência.


4. Execute a aplicação usando Maven.
   ```bash
   mvn spring-boot:run
   ```

5. A aplicação será iniciada em 'http://localhost:8080'.


6. Utilize as configurações de ENV e Collections fornecidas na pasta "docs" com o Postman ou outra ferramenta similar para realizar requisições e testar a API.

### Tecnologias
![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![MongoDB](https://img.shields.io/badge/MongoDB-%234ea94b.svg?style=for-the-badge&logo=mongodb&logoColor=white)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)
![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)

### Autores
- [@acenelio](https://github.com/acenelio) - Commit inicial
- [@phyllipesa](https://github.com/phyllipesa) - Desenvolvimento do projeto
