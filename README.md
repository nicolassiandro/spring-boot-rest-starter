# Spring Boot Rest Starter

Starter project for a Spring Boot REST application

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development.

### Prerequisites

* Java 11
* Maven 3.x

### Installing

Using Maven run
```
./mvnw spring-boot:run
```

Alternatively, you can build the JAR file with
```
./mvnw clean package
```
and execute it with
```
java -jar target/spring-boot-rest-starter-1.0.0-SNAPSHOT.jar
```

Then go to http://localhost:9090/v1/spring-boot-rest-starter/greetings

## Built With

* [Spring Boot](https://spring.io/projects/spring-boot) - The application framework used
* [Maven](https://maven.apache.org/) - Dependency Management

## Versioning

We use [SemVer](http://semver.org/) for versioning.

## Authors

* **Nicolas Siandro** - *Initial work* - [nicolassiandro](https://github.com/nicolassiandro)

## License

This project is licensed under the GNU GPL v3 License - see the [LICENSE](LICENSE) file for details

## API Specification

This project is [OpenAPI](https://swagger.io/resources/open-api/) compatible

The url is formed like:

```
http://{server}:{port}/{context-path}/v3/api-docs
```

Go to this URL for Swagger UI
```
http://localhost:9090/api/v1/spring-boot-rest-starter/swagger-ui.html
```

and

```
http://localhost:9090/api/v1/spring-boot-rest-starter/v3/api-docs
```
for the OpenAPI json