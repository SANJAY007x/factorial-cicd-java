# Java Factorial CI/CD Project

A Java application that calculates the factorial of a non-negative integer, with automated testing and continuous integration using GitHub Actions.

## Technologies Used

* Java 21
* Apache Maven
* JUnit 5
* GitHub Actions
* Git and GitHub

## Features

* Calculates factorial values from 0 to 20.
* Rejects negative inputs with an exception.
* Includes automated unit tests.
* Automatically builds and tests code changes.
* Packages the application into a JAR artifact.

## Project Structure

```text
factorial-cicd-java/
├── .github/
│   └── workflows/
│       └── ci.yml
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/example/
│   │           └── Factorial.java
│   └── test/
│       └── java/
│           └── com/example/
│               └── FactorialTest.java
├── pom.xml
└── README.md
```

## Run the Tests

Make sure Java 21 or a compatible JDK is installed.

Run:

```bash
mvn clean verify
```

## Continuous Integration

The GitHub Actions workflow runs when code is pushed to `main`, when a pull request targets `main`, or when the workflow is manually started.

The workflow:

1. Checks out the source code.
2. Configures Java 21.
3. Builds the Maven project.
4. Runs automated tests.
5. Packages the application and uploads the JAR artifact.

## Expected Result

All six unit tests should pass, and the workflow should finish successfully.

## Author

SANJAY007x
