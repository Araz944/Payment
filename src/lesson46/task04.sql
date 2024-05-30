CREATE TABLE Products
(
    id          serial primary key,
    name        varchar,
    price       int,
    quantity    int,
    description varchar,
    category_id int,
    FOREIGN KEY (category_id) REFERENCES Categories (id)
);

CREATE TABLE Categories
(
    id   serial primary key,
    name varchar
);

CREATE TABLE Customers
(
    id           serial primary key,
    first_name   varchar,
    last_name    varchar,
    address      varchar,
    email        varchar,
    phone_number varchar
);

CREATE TABLE Orders
(
    id          serial primary key,
    customer_id int,
    order_date  date,
    FOREIGN KEY (customer_id) REFERENCES Customers (id)
);

CREATE TABLE OrderDetails
(
    id         serial primary key,
    order_id   int,
    product_id int,
    quantity   int,
    FOREIGN KEY (order_id) REFERENCES Orders (id),
    FOREIGN KEY (product_id) REFERENCES Products (id)
);

INSERT INTO Products (Name, Price, Quantity, Description)
VALUES ('Product A', 10.99, 10, 'Modern'),
       ('Product B', 25.99, 20, 'New'),
       ('Product C', 5.99, 25, 'Ancient');

INSERT INTO Categories (Name)
values ('Electronics'),
       ('Home & Garden'),
       ('Books');

INSERT INTO Customers (First_Name, Last_Name, Address, Email, Phone_Number)
VALUES ('Bob', 'Carlos', 'Germany', 'info@acme.com', 123 - 456 - 7890),
       ('John', 'Wilson', 'England', 'info@xyz.com', 987 - 654 - 3210),
       ('Mike', 'Corleone', 'Italy', 'info@abc.com', 555 - 555 - 5555);

INSERT INTO Orders (Customer_ID, Order_Date)
values (1, '2023-06-01'),
       (2, '2023-06-05'),
       (3, '2023-06-10');

INSERT INTO OrderDetails (Order_ID, Product_ID, Quantity)
values (1, 3, 8),
       (2, 1, 5),
       (3, 1, 10);

SELECT *
FROM Products;

SELECT *
FROM Products P
         JOIN Categories C ON P.category_id = C.id;

SELECT *
FROM Customers;

SELECT *
FROM Orders;

SELECT *
FROM OrderDetails;

SELECT *
FROM Products
WHERE id = 1;

SELECT *
FROM Products P
         JOIN Categories C on C.id = P.category_id
WHERE p.category_id = 1;

SELECT *
FROM Customers
WHERE id = 1;

SELECT *
FROM Orders O
         JOIN Customers C ON C.id = O.customer_id
WHERE O.customer_id = 1;

SELECT *
FROM OrderDetails OD
         JOIN Orders O ON OD.order_id = O.id
WHERE OD.order_id = 1;

UPDATE Products
SET price=25
WHERE id = 1;

INSERT INTO Products (Name, Price, Quantity, Description, Category_Id)
VALUES ('Product 5', 20, 3, 'It is amazing products', 1);

DELETE
FROM Products
WHERE id = 2;