## Autor

Carolina Castaño González

# Automatización Web - SauceDemo

Proyecto desarrollado como solución a un reto técnico utilizando Serenity BDD, Cucumber y el patrón Screenplay.

Se automatizaron los siguientes flujos:

- Inicio de sesión exitoso.
- Adición de un producto al carrito de compras.
- Validación del producto agregado.

La solución fue diseñada siguiendo principios de Clean Code y buenas prácticas de automatización para garantizar mantenibilidad, reutilización y escalabilidad.

# Reto Técnico - Automatización Web

## Descripción

Este proyecto corresponde a la automatización funcional del flujo de autenticación y compra de un producto en la aplicación **SauceDemo**, utilizando el patrón de diseño **Screenplay** con **Serenity BDD**, **Cucumber** y **JUnit**.

El objetivo del proyecto es demostrar buenas prácticas de automatización, separación de responsabilidades y una arquitectura escalable para pruebas funcionales.

---

## Tecnologías utilizadas

| Tecnología | Versión  |
|------------|----------|
| Java | 11       |
| Gradle | 8.14.5   |
| Serenity BDD | 4.0.46   |
| Screenplay Pattern | Serenity |
| Cucumber | 6.11.0   |
| JUnit | 4.13.2   |
| Selenium WebDriver | Serenity |
| WebDriverManager | 5.8.0    |

---

## Patrón de Automatización

El proyecto implementa el patrón **Screenplay**, el cual organiza la automatización en diferentes responsabilidades:

```
                +----------------+
                |     Feature    |
                +----------------+
                         |
                         ▼
                +----------------+
                | StepDefinition |
                +----------------+
                         |
                         ▼
                +----------------+
                |     Actor      |
                +----------------+
                         |
        +----------------+----------------+
        ▼                                 ▼
+----------------+               +----------------+
|     Tasks      |               |   Questions    |
+----------------+               +----------------+
        |                                 |
        ▼                                 ▼
+----------------+               +----------------+
| User Interface |               |   Assertions   |
+----------------+               +----------------+
Question
```

Este patrón facilita:

- Reutilización de código
- Escalabilidad
- Mantenibilidad
- Legibilidad
- Separación de responsabilidades

---

## Estructura del proyecto

```
src
│
├── main
│   ├── java
│   │   └── com.reto
│   │       ├── interactions
│   │       ├── models
│   │       ├── questions
│   │       ├── tasks
│   │       ├── userinterfaces
│   │       └── utils
│
├── test
│   ├── java
│   │   └── com.reto
│   │       ├── hooks
│   │       ├── runners
│   │       └── stepdefinitions
│   │
│   └── resources
│       └── features
```

---

## Escenarios Automatizados

### Escenario 1

**Login exitoso**

- Abrir la aplicación
- Ingresar usuario
- Ingresar contraseña
- Validar ingreso exitoso

---

### Escenario 2

**Agregar producto al carrito**

- Agregar Sauce Labs Backpack
- Abrir carrito
- Validar producto agregado

---

## Buenas prácticas implementadas

- Patrón Screenplay
- Principio de Responsabilidad Única (SRP)
- Separación de Tasks, Questions y User Interfaces
- Uso de WaitUntil para sincronización
- Modelo para encapsular datos de usuario
- Localizadores centralizados
- Código reutilizable
- Eliminación de código duplicado
- Limpieza de imports
- Código preparado para escalabilidad

---

## Requisitos

- Java 11
- Gradle
- Chrome instalado

---

## Instalación

Clonar el repositorio

```bash
git clone https://github.com/caricas84/Automation-web.git
```
## Ejecutar

```bash
.\gradlew test
```
## Reportes

Después de la ejecución, Serenity genera automáticamente un reporte HTML con:

- Escenarios ejecutados
- Evidencias
- Capturas
- Tiempo de ejecución
- Resultado por escenario

Ruta:

target/site/serenity/index.html