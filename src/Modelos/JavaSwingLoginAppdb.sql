CREATE DATABASE JavaSwingLoginApp
USE JavaSwingLoginApp;

CREATE TABLE User (
    ID INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    UserName VARCHAR(50) NOT NULL,
    Name VARCHAR(50) NOT NULL,
    LastName VARCHAR(50) NOT NULL,
    PhoneNumber VARCHAR(20) NOT NULL,
    Email VARCHAR(100) NOT NULL,
    Password VARCHAR(30) NOT NULL
);

INSERT INTO User (UserName, Name, LastName, PhoneNumber, Email, Password)
VALUES ('topito', 'Christian', 'Gil', '809-596-7178', 'cgil@gmail.com', '1234');

INSERT INTO User (UserName, Name, LastName, PhoneNumber, Email, Password)
VALUES 
('rlopez', 'Roberto', 'Lopez', '809-555-1234', 'rlopez@gmail.com', 'password1'),
('mgarcia', 'Maria', 'Garcia', '829-555-2345', 'mgarcia@gmail.com', 'password2'),
('jfernandez', 'Juan', 'Fernandez', '849-555-3456', 'jfernandez@gmail.com', 'password3'),
('pcastro', 'Pedro', 'Castro', '809-555-4567', 'pcastro@gmail.com', 'password4'),
('rgonzalez', 'Rosa', 'Gonzalez', '829-555-5678', 'rgonzalez@gmail.com', 'password5'),
('jdiaz', 'Jose', 'Diaz', '849-555-6789', 'jdiaz@gmail.com', 'password6'),
('jmartinez', 'Julia', 'Martinez', '809-555-7890', 'jmartinez@gmail.com', 'password7'),
('cperalta', 'Carlos', 'Peralta', '829-555-8901', 'cperalta@gmail.com', 'password8'),
('drios', 'Diana', 'Rios', '849-555-9012', 'drios@gmail.com', 'password9'),
('tvaldez', 'Teresa', 'Valdez', '809-555-0123', 'tvaldez@gmail.com', 'password10');


SELECT * FROM User