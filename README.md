
## Descripción
# JavaSwingLoginApp
JavaSwingLoginApp es un proyecto de ejemplo que muestra cómo implementar un sistema de autenticación de usuarios con Java y Swing para la GUI. Ideal para desarrolladores que desean entender la autenticación en aplicaciones de escritorio Java y estructurar un proyecto siguiendo los principios de POO y los patrones de diseño Singleton y Fábrica.

## Tarea 4 - Programación 1
Esta es la tarea 4 para la clase de Programación 1, impartida por el profesor Kelyn Tejada Belliard en el Instituto Tecnológico de las Américas (ITLA).

## Funcionalidades
- Registro de nuevos usuarios.
- Autenticación de usuarios registrados.
- Validación de campos obligatorios durante el registro.
- Verificación de coincidencia de contraseñas durante el registro.
- Mensajes de error claros para campos faltantes y credenciales incorrectas.

## Requisitos
- Java Development Kit (JDK) 8 o superior
- MySQL Server
- Biblioteca JDBC para MySQL

## Estructura del Proyecto
.
├── src
│ ├── modelos
│ │ ├── dbConecction.java
│ │ └── User.java
│ └── vistas
│ ├── RegistrationForm.java
│ └── jfMainScreen.java
├── README.md
└── SQL
└── create_table.sql

## Base de datos MySQL

USE yourdatabase;
CREATE TABLE User (
    ID INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    UserName VARCHAR(50) NOT NULL,
    Name VARCHAR(50) NOT NULL,
    LastName VARCHAR(50) NOT NULL,
    PhoneNumber VARCHAR(20) NOT NULL,
    Email VARCHAR(100) NOT NULL,
    Password VARCHAR(30) NOT NULL
);

