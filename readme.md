# 🚀 Spring API com Swagger  

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.1-green)  ![Java](https://img.shields.io/badge/Java-17-blue)  ![Swagger](https://img.shields.io/badge/Swagger-API%20Docs-orange)  

Este repositório contém uma API REST desenvolvida com **Spring Boot**, documentada utilizando **Swagger** para facilitar a visualização e o teste dos endpoints.  

---

## 📌 Tecnologias Utilizadas  
- **Spring Boot 3.4.1**  
- **Java 17**  
- **Maven**  
- **Swagger (Springfox)**  

---

## ▶️ Como Rodar o Projeto  

### ✅ Pré-requisitos  
Antes de iniciar, certifique-se de ter os seguintes itens instalados:  
- **Java 17**  
- **Maven**  

### 🔧 Executando a Aplicação  
1. Clone o repositório:  
   ```sh
   git clone https://github.com/Tecoquinho/SpringAPISwagger.git
   ```  
2. Acesse a pasta do projeto:  
   ```sh
   cd SpringAPISwagger
   ```  
3. Compile e execute a aplicação:  
   ```sh
   mvn clean install
   mvn spring-boot:run
   ```  
4. Acesse a interface do **Swagger UI** no navegador:  
   ```sh
   http://localhost:8080/swagger-ui/
   ```  

---

## 🛠 Endpoints da API  
A API fornece endpoints documentados pelo Swagger, permitindo interatividade na visualização e teste das requisições.  

---

## 📂 Estrutura do Projeto  
```
/SpringAPISwagger
│-- src/main/java/com/exemplo/api
│   │-- controllers
│   │-- services
│   │-- repositories
│   │-- models
│-- src/main/resources
│   │-- application.properties
│   │-- swagger-config.yml
```

---

## 🤝 Contribuição  
Sinta-se à vontade para contribuir com melhorias! Para isso:  
1. Faça um **fork** do repositório  
2. Crie uma nova **branch**  
3. Envie um **pull request**  

📌 **Desenvolvido por [Tecoquinho](https://github.com/Tecoquinho) 🚀** 
