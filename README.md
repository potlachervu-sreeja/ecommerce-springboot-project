# E-Commerce Backend Application

## Project Description
A backend application built using Java and Spring Boot to manage products in an e-commerce system. MySQL stores the product data, and Spring Data JPA handles database operations.

## Technologies Used
- Java 21
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Postman

## Features
- View all products
- Get a product by ID
- Add new products
- Update product details
- Delete products
- Search products by name

## API Endpoints

| Method | Endpoint | Purpose |
|---|---|---|
| GET | `/products` | View all products |
| GET | `/products/{id}` | View one product |
| POST | `/products` | Add a product |
| PUT | `/products/{id}` | Update a product |
| DELETE | `/products/{id}` | Delete a product |
| GET | `/products/search?name=USB%20Mouse` | Search by name |

## How to Run
1. Install Java 21 and MySQL.
2. Configure the database connection in `application.properties`.
3. Open the project in Eclipse.
4. Run `EcommerceApplication.java`.
5. Test the APIs using Postman.

## Learning Outcomes
- Created REST APIs using Spring Boot.
- Connected a Java application to MySQL.
- Used Spring Data JPA for database operations.
- Tested APIs using Postman.
