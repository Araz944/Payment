CREATE TABLE Employees
(
    EmployeeID SERIAL PRIMARY KEY,
    FirstName  VARCHAR(50),
    LastName   VARCHAR(50),
    Position   VARCHAR(50),
    Salary     DECIMAL(10, 2)
);

CREATE TABLE Customers
(
    CustomerID SERIAL PRIMARY KEY,
    Name       VARCHAR(50),
    Email      VARCHAR(50),
    Phone      VARCHAR(20)
);

CREATE TABLE Orders
(
    OrderID     SERIAL PRIMARY KEY,
    OrderNumber VARCHAR(20),
    OrderDate   DATE,
    OrderPrice  DECIMAL(10, 2),
    Status      VARCHAR(20),
    CustomerID  INT,
    FOREIGN KEY (CustomerID) REFERENCES Customers (CustomerID)
);

CREATE TABLE Products
(
    ProductID SERIAL PRIMARY KEY,
    Name      VARCHAR(50),
    Price     DECIMAL(10, 2),
    Category  VARCHAR(50)
);

CREATE TABLE Sales
(
    SaleID    SERIAL PRIMARY KEY,
    ProductID INT,
    Quantity  INT,
    Price     DECIMAL(10, 2),
    Revenue   DECIMAL(10, 2),
    FOREIGN KEY (ProductID) REFERENCES Products (ProductID)
);

CREATE TABLE Inventory
(
    ProductID SERIAL PRIMARY KEY,
    Quantity  INT,
    FOREIGN KEY (ProductID) REFERENCES Products (ProductID)
);

INSERT INTO Employees (FirstName, LastName, Position, Salary)
VALUES ('John', 'Doe', 'Manager', 5000.00),
       ('Jane', 'Smith', 'Salesperson', 3000.00),
       ('Mike', 'Johnson', 'Technician', 2500.00);

INSERT INTO Customers (Name, Email, Phone)
VALUES ('Acme Corp', 'info@acme.com', '123-456-7890'),
       ('XYZ Company', 'info@xyz.com', '987-654-3210'),
       ('ABC Enterprises', 'info@abc.com', '555-555-5555');

INSERT INTO Orders (OrderNumber, OrderDate, OrderPrice, Status, CustomerID)
VALUES ('ORD001', '2023-06-01', 1000.00, 'Completed', 1),
       ('ORD002', '2023-06-05', 500.00, 'Completed', 2),
       ('ORD003', '2023-06-10', 750.00, 'Pending', 3);

INSERT INTO Products (Name, Price, Category)
VALUES ('Product A', 10.99, 'Electronics'),
       ('Product B', 25.99, 'Home & Garden'),
       ('Product C', 5.99, 'Books');

INSERT INTO Sales (ProductID, Quantity, Price, Revenue)
VALUES (1, 10, 10.99, 109.90),
       (2, 5, 25.99, 129.95),
       (3, 20, 5.99, 119.80);

INSERT INTO Inventory (ProductID, Quantity)
VALUES (1, 100),
       (2, 50),
       (3, 200);

SELECT *
FROM Employees;

SELECT *
FROM Customers;

-------------------------------------------------------- Lesson 43

CREATE TABLE Sales
(
    id       serial primary key,
    product  varchar,
    quantity integer,
    price    decimal
);

SELECT *
FROM Sales;

INSERT INTO Sales (product, quantity, price)
VALUES ('mouse', 10, 20.66),
       ('iPhone', 40, 720),
       ('mouse', 50, 17.43),
       ('mouse', 30, 23.04);

SELECT product,
       SUM(quantity) AS total_quantity,
       AVG(price)    AS average_price
FROM Sales
GROUP BY product;

SELECT price,
       SUM(price),
       AVG(price),
       MIN(price),
       MAX(price),
       COUNT(price)
FROM Sales
GROUP BY price;

CREATE TABLE Expenses
(
    id       serial primary key,
    category varchar,
    amount   decimal
);

INSERT INTO Expenses (category, amount)
VALUES ('education', 80),
       ('food', 120),
       ('transport', 50),
       ('housing', 200);

SELECT *
FROM Expenses;

SELECT category,
       SUM(amount) AS total_amount,
       AVG(amount) AS average_amount
FROM Expenses
GROUP BY category;

CREATE TABLE Products
(
    id    serial primary key,
    name  varchar,
    price decimal
);

INSERT INTO Products (name, price)
VALUES ('bicycle', 120),
       ('bicycle', 70),
       ('bicycle', 85),
       ('bicycle', 112),
       ('bicycle', 100);

SELECT *
FROM Products;

SELECT name,
       MIN(price) AS minimum,
       MAX(price) AS maximum
FROM Products
GROUP BY name;

-- CREATE TABLE Students (
--     id INT PRIMARY KEY,
--     student_name VARCHAR(100)
-- );
--
-- CREATE TABLE Grades (
--     id INT PRIMARY KEY,
--     student_id INT,
--     grade DECIMAL(5,2),
--     FOREIGN KEY (student_id) REFERENCES Students(id)
-- );
--
-- INSERT INTO Students (id, student_name) VALUES
-- (1, 'Alice'),
-- (2, 'Bob'),
-- (3, 'Charlie'),
-- (4, 'David');
--
-- INSERT INTO Grades (id, student_id, grade) VALUES
-- (1, 1, 85.0),
-- (2, 1, 90.0),
-- (3, 2, 78.0),
-- (4, 2, 82.0),
-- (5, 3, 88.0),
-- (6, 3, 92.0),
-- (7, 4, 70.0),
-- (8, 4, 75.0);
--
-- SELECT student_name
-- FROM Students
-- WHERE id IN (
--     SELECT student_id
--     FROM (
--         SELECT student_id, AVG(grade) AS avg_grade
--         FROM Grades
--         GROUP BY student_id
--     ) AS student_avg
--     WHERE avg_grade > (
--         SELECT AVG(grade)
--         FROM Grades
--     )
-- );

CREATE TABLE Students
(
    id       serial primary key,
    name     varchar,
    avgGrade decimal
);

INSERT INTO Students (name, avgGrade)
VALUES ('Alice', 88),
       ('Charlie', 92),
       ('Bob', 90),
       ('David', 82);

SELECT *
FROM Students
WHERE avgGrade > (SELECT AVG(avgGrade) FROM Students);