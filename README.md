# User API – Spring Boot

Simple REST API built with **Java and Spring Boot**.  
This project demonstrates core backend concepts such as RESTful endpoints, CRUD operations, and basic object-oriented programming.

## Features
- Create users
- Retrieve all users
- Retrieve user by ID
- Delete users

## Tech Stack
- Java
- Spring Boot
- REST API
- Maven

## How to Run
```bash
mvn spring-boot:run

The API will be available at:

http://localhost:8080

shell
Copiar código

## Endpoints

### Get all users
```http
GET /users
Create user
http
Copiar código
POST /users
Request body example
json
Copiar código
{
  "id": 1,
  "name": "Erick",
  "email": "erick@test.com"
}
