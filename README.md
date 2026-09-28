# GitHub Actions Spring Boot CI/CD Practice

## Requirements
- Java 21
- Maven 3.8+
- Git
- Docker (for later exercises)

## Run locally

```bash
mvn clean test
mvn spring-boot:run
```

API:
- GET http://localhost:8080/api/employees
- GET http://localhost:8080/api/employees/1
- GET http://localhost:8080/api/employees/count
- POST http://localhost:8080/api/employees

## GitHub Actions
The workflow in `.github/workflows/ci.yml`:
1. Checks out source code
2. Sets up Java 21
3. Runs Maven tests
4. Packages the application
5. Uploads the JAR as a GitHub Actions artifact
