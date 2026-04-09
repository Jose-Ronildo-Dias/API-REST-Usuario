# API-RESTE-Usuario – API REST para Cadastro de Usuários

![Java](https://img.shields.io/badge/Java-17-blue) ![Spring Boot](https://img.shields.io/badge/Spring_Boot-2.7.0-brightgreen) ![License](https://img.shields.io/badge/License-MIT-yellow)

🚀 **U API-RESTE-Usuario** é uma API REST desenvolvida em **Java 17 com Spring Boot** para gerenciar usuários de forma prática, 
segura e escalável. Este projeto foi criado como backend robusto, pronto para integração com qualquer front-end, seja web ou desktop.

---

## 🌟 Funcionalidades

- 📝 **Cadastrar usuários** com nome, e-mail e senha  
- ✏️ **Atualizar dados** de usuários existentes  
- 📋 **Listar usuários** cadastrados  
- ❌ **Deletar usuários** quando necessário  
- ✅ **Validação de dados** para garantir integridade e segurança  

---

## 🛠️ Tecnologias utilizadas

- **Java 17** – Linguagem de programação  
- **Spring Boot** – Framework para desenvolvimento de APIs REST  
- **Spring Data JPA** – Integração com banco de dados  
- **H2 Database** – Banco de dados em memória para testes  
- **MapStruct** – Conversão automática entre DTOs e entidades  
- **Jakarta Validation** – Validação de dados  

---

## 🗂 Estrutura do projeto

O projeto segue arquitetura em camadas, facilitando manutenção e escalabilidade:

src/main/java/com/jose/userregistry/
├── controller/ # Recebe as requisições HTTP
├── service/ # Contém a lógica de negócio
├── repository/ # Comunicação com o banco de dados
├── dto/ # Objetos de transferência de dados
├── entity/ # Entidades do banco
└── mapper/ # MapStruct para conversão DTO ↔ Entity

🌐 Endpoints
Método	Endpoint	Descrição
POST	/users	Criar novo usuário
GET	/users	Listar todos os usuários
PUT	/users/{id}	Atualizar dados de um usuário
DELETE	/users/{id}	Deletar um usuário

Todas as respostas estão em JSON.
