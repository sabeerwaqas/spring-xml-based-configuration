# Spring XML-Based Configuration

A focused Java project demonstrating how to configure and bootstrap the Spring IoC container using **XML bean definitions**. It keeps bean registration and dependency wiring explicit, outside the application classes.

## What this implementation covers

- **Explicit bean registration** — declare service classes and bean identifiers in `beans.xml`.
- **Constructor-based dependency injection** — wire `PaymentService` into `OrderService` with a `<constructor-arg>` reference.
- **Container bootstrap** — load the XML configuration through `ClassPathXmlApplicationContext`.
- **Container-managed lifecycle** — retrieve configured services from the application context and close the context after use.
- **Separation of concerns** — keep service behavior in Java and object assembly in XML.

## How the wiring works

```text
Main
 └── ClassPathXmlApplicationContext
      └── beans.xml
           ├── paymentService  →  PaymentService
           └── orderService    →  OrderService
                                  └── constructor injection:
                                      PaymentService
```

Spring reads the bean definitions, creates the configured objects, resolves the `paymentService` reference, and supplies that dependency to the `OrderService` constructor. The application retrieves the configured `OrderService` bean and invokes its order operation.

## Project structure

```text
src/
├── main/
│   ├── java/spring/xml/based/configuration/
│   │   ├── Main.java
│   │   └── services/
│   │       ├── OrderService.java
│   │       └── PaymentService.java
│   └── resources/
│       └── beans.xml
└── test/
    └── java/spring/xml/based/configuration/
        └── AppTest.java
```

## Run locally

### Requirements

- JDK 17 or later
- Maven 3.8+

### Execute

```bash
git clone https://github.com/sabeerwaqas/spring-xml-based-configuration.git
cd spring-xml-based-configuration
mvn clean package
mvn exec:java -Dexec.mainClass="spring.xml.based.configuration.Main"
```

Or run `spring.xml.based.configuration.Main` from your IDE.

The application creates the Spring context from `beans.xml`, resolves the service dependency, and executes the order operation.

### Run tests

```bash
mvn test
```

The context-loading test verifies that Spring can parse the XML configuration and instantiate `OrderService` with its required dependency.

## Configuration entry point

The bean definitions live in [`src/main/resources/beans.xml`](src/main/resources/beans.xml). This is the place to inspect or change bean identifiers, implementation classes, and constructor references.

The Java entry point deliberately uses `ClassPathXmlApplicationContext`; it does not use `@Configuration`, `@Bean`, `@Component`, or component scanning to register these services.

## Scope

This project isolates XML-based bean configuration and constructor injection. It is not intended to be a production payment or order-processing system; the service classes are deliberately small so the container configuration remains the focus.
