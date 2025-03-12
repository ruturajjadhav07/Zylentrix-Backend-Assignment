# User Management API

A simple Spring Boot REST API for managing users. This API allows you to create, read, update, and delete users.

## 🚀 Features
- Create a new user
- Retrieve all users
- Retrieve a single user by ID
- Update an existing user by ID
- Delete a user

## 🛠 Tech Stack
- Java
- Spring Boot
- Spring Data JPA
- MySQL Database
- Postman (for API testing)

## 📌 Database Setup (MySQL)
To set up the MySQL database, execute the following SQL command:
```sql
CREATE DATABASE users;
```
Make sure to configure your `application.properties` with the correct database credentials:
```properties
  spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
  spring.datasource.url=jdbc:mysql://localhost:3306/users
  spring.datasource.username=username
  spring.datasource.password=password
  spring.jpa.show-sql=true
  spring.jpa.hibernate.ddl-auto=update
```

## 📌 Installation

1. Clone the repository:
   ```sh
   git clone https://github.com/your-username/your-repo.git
   cd your-repo
   ```
2. Build the project:
   ```sh
   mvn clean install
   ```
3. Run the application:
   ```sh
   mvn spring-boot:run
   ```

## API Endpoints

---
### 1 Create a User
**Endpoint:** `POST /users/create`

**Request:**

![Screenshot 2025-03-12 122354](https://github.com/user-attachments/assets/54d17f58-8a62-43ab-a5d7-7cb92649d939)


**Response:**

![Screenshot 2025-03-12 122413](https://github.com/user-attachments/assets/283fd536-5686-432b-9a14-e9b49a6f38cc)


### 2 Get All Users
**Endpoint:** `GET /users`

**Request:**

![Screenshot 2025-03-12 122513](https://github.com/user-attachments/assets/f22f8b65-0319-491d-949d-48fa968b7bce)

**Response:**

![Screenshot 2025-03-12 122529](https://github.com/user-attachments/assets/a417456b-e1cf-4e2b-b425-e36b1686b9f7)


---
### 3 Get User by ID
**Endpoint:** `GET /users/{id}`

**Request:**

![Screenshot 2025-03-12 122613](https://github.com/user-attachments/assets/f1ccac1b-e53e-4670-8cc7-e89173db11da)

**Response:**

![Screenshot 2025-03-12 122623](https://github.com/user-attachments/assets/07213d91-7b42-4320-be83-dfcfbbd1ccb9)

---
### 4 Update a User
**Endpoint:** `PUT /users/update/{id}`

**Request:**

![image](https://github.com/user-attachments/assets/cabe720b-8093-44fc-889d-6a681745a141)

**Response:**

![image](https://github.com/user-attachments/assets/60373d90-899d-476f-9fcc-57575c22bef0)


---
### 5 Delete a User
**Endpoint:** `DELETE /users/delete/{id}`

**Request:**

![Screenshot 2025-03-12 130059](https://github.com/user-attachments/assets/3febb676-288b-4442-b02f-310789ede852)

**Response:**

![image](https://github.com/user-attachments/assets/31e42d2f-ebf9-4127-a8ac-2ffa89515bf8)
