# Gas Utility Customer Service Application

This is a **Gas Utility Customer Service Application** developed to handle high volumes of customer service requests efficiently. Initially, the task was intended for Django, but I chose to implement it using **Java Spring Boot** due to my expertise in Java. The application uses **MySQL** as the database.

---

## **Project Overview**

The application provides an intuitive interface for customers to:

1. **Submit Service Requests**  
   Customers can submit requests online by selecting the request type, providing details, and attaching files.

2. **Track Request Status**  
   Customers can monitor the status of their requests, including submission and resolution timestamps.

3. **Manage Account Information**  
   Customers can view and update their profile information.

Additionally, it provides tools for customer support representatives to manage and resolve customer requests.

---

## **Features**

1. **Service Requests**
   - Submit service requests online with details and file attachments.

2. **Request Tracking**
   - View status, submission date, and resolution date for service requests.

3. **Customer Management**
   - Manage customer accounts and their associated requests.

4. **Database**
   - Relational database using MySQL to store and manage data efficiently.

5. **File Uploads**
   - Securely upload and store files associated with customer service requests.

6. **Swagger Integration**
   - API documentation and testing are facilitated using Swagger UI.

---

## **Setup Instructions**

### **Set Up the MySQL Database**
1. Start your MySQL server and open a client (e.g., MySQL Workbench or terminal).
2. Execute the following SQL script to create the database and tables:

```sql
CREATE DATABASE gas_utility;

USE gas_utility;

CREATE TABLE customer (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL
);

CREATE TABLE service_request (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    request_type VARCHAR(255) NOT NULL,
    description TEXT,
    status VARCHAR(50) NOT NULL DEFAULT 'Pending',
    customer_id BIGINT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    resolved_at TIMESTAMP,
    FOREIGN KEY (customer_id) REFERENCES customer(id)
);
Update Application Properties
In the src/main/resources/application.properties file, update the database connection details as follows:

properties
Copy
Edit
spring.datasource.url=jdbc:mysql://localhost:3306/gas_utility
spring.datasource.username=your_db_username
spring.datasource.password=your_db_password
Replace your_db_username and your_db_password with your MySQL credentials.

Build and Run the Application
Open a terminal and navigate to the project directory.
Run the following commands:
bash
Copy
Edit
mvn clean install
mvn spring-boot:run
Access the Application
Swagger UI for API Testing:
Open your browser and navigate to:
http://localhost:8080/swagger-ui/index.html
Future Enhancements
Add JWT authentication for improved security.
Implement advanced analytics for service requests.
Enhance the user interface for a better customer experience.
Acknowledgment
This project is part of a task assigned by Bynry. I sincerely appreciate the opportunity to work on this real-world problem. While the original task suggested using Django, I leveraged my strengths in Java Spring Boot to complete it effectively and meet the requirements.

Contact
Developer: Rohan Nule
Email: rohannule02@gmail.com
GitHub: RkNule
LinkedIn: Rohan Nule
Feel free to reach out for any queries or feedback!
