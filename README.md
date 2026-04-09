# Full-Stack Student Management System using React and Spring Boot

## Overview

This project is a full-stack CRUD application that integrates a React frontend with a Spring Boot backend. It allows users to create, read, update, and delete student records dynamically without refreshing the page.

## Technologies Used

* Frontend: React.js, Axios
* Backend: Spring Boot, Spring Data JPA
* Database: H2 (In-memory)
* Build Tool: Maven

## Project Structure

```
project-root/
│
├── frontend/
│   └── React application
│
└── backend/
    └── Spring Boot application
```

## Features

* Add new student
* View all students
* Update student details
* Delete student records
* Real-time UI updates without reload

## API Endpoints

### Create Student

POST /students

### Get All Students

GET /students

### Update Student

PUT /students/{id}

### Delete Student

DELETE /students/{id}

## How to Run

### Backend

```
cd backend
mvn spring-boot:run
```

### Frontend

```
cd frontend
npm install
npm start
```

## Expected Outcome

* Seamless communication between frontend and backend
* CRUD operations reflected instantly on UI
* Clean and responsive interface

## Conclusion

This project demonstrates full-stack development by integrating React with Spring Boot. It highlights REST API communication, state management, and dynamic UI updates.

## Note

For educational purposes only.
