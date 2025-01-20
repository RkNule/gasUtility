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

## **Technologies Used**

- **Backend:** Java Spring Boot (v3.4.1)
- **Database:** MySQL
- **Documentation:** Swagger
- **Build Tool:** Maven
- **Dependency Management:** Spring Boot Starter modules and other libraries
- **Authentication:** Basic authentication (JWT removed for simplicity)

---

## **Database Schema**

1. **Tables:**
   - **customer:** Stores customer information (ID, name, email, and password).
   - **service_request:** Stores service request details (ID, request type, description, status, and timestamps).

2. **Relationships:**
   - One-to-Many: A customer can have multiple service requests.

---

## **How to Run**

1. Clone the repository:
   ```bash
   git clone https://github.com/RkNule/gasUtility.git
   cd gasUtility
