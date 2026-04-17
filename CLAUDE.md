# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Commands

```bash
# Build (skip tests)
./mvnw package -DskipTests

# Build and run tests
./mvnw verify

# Run a single test class
./mvnw test -Dtest=ProjfordockerApplicationTests

# Run the application locally
./mvnw spring-boot:run

# Build Docker image
docker build -t projfordocker .

# Run Docker container
docker run -p 8080:8080 projfordocker
```

## Architecture

Spring Boot 4.0 / Java 21 REST API. The project uses a controller interface + implementation pattern:

- `controllers/MainController.java` — interface declaring endpoints with `@GetMapping` annotations
- `controllers/impl/MainControllerImpl.java` — `@RestController` implementing the interface
- `models/` — Lombok `@Data` POJOs for request/response bodies

The single endpoint `GET /user` returns a `MainModel` (id + name).

## CI/CD

GitHub Actions workflow ([.github/workflows/build-application-main.yml](.github/workflows/build-application-main.yml)) triggers on push to `main`. The Dockerfile uses a multi-stage build: Maven builder stage → slim JRE runtime image on port 8080.
