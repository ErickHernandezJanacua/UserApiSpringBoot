# User API – Spring Boot

Simple REST API developed using Java and Spring Boot.  
This project demonstrates basic backend concepts such as REST endpoints, CRUD operations, and object-oriented programming.

## Features
- Create users
- Retrieve all users
- Retrieve user by ID
- Delete users

## Technologies
- Java
- Spring Boot
- REST API
- Maven

## Endpoints

### Get all users
**GET** `/users`

### Create user
**POST** `/users`

Request body example:
```json
{
  "id": 1,
  "name": "Erick",
  "email": "erick@test.com"
}
