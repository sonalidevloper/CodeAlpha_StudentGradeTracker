# CodeAlpha Student Grade Tracker

![Java 23](https://img.shields.io/badge/Java-23-blue?logo=java&logoColor=white) ![Maven](https://img.shields.io/badge/Maven-3.6%2B-brightgreen?logo=apache-maven&logoColor=white) ![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ-IDEA-black?logo=jetbrains&logoColor=white) ![GitHub](https://img.shields.io/badge/GitHub-repo-black?logo=github&logoColor=white) ![Git](https://img.shields.io/badge/Git-version_control-black?logo=git&logoColor=white)

A console-based Java program to manage student grades. Built as Task 1 for the CodeAlpha Java Programming Internship.

## Table of contents
- [About](#about)
- [Features](#features)
- [Tech stack](#tech-stack)
- [Requirements](#requirements)
- [Build & run](#build--run)
- [Usage example](#usage-example)
- [Project structure](#project-structure)
- [Development Notes](#development-notes)
- [Contributing](#contributing)
- [Contact](#contact)

## About

This command-line Java application lets you add students, record multiple grades per student, and view reports showing each student's average, highest, lowest scores, and letter grade. It demonstrates use of core Java, collections, and simple I/O.

## Features
- Add and list students
- Add multiple grades per student
- View per-student report with:
  - Average score
  - Highest score
  - Lowest score
  - Letter grade (A-F)
- Simple, text-based console UI

## Tech stack
- ![Java](https://img.shields.io/badge/Java-23-blue?logo=java&logoColor=white) Java 23 — language and runtime
- ![Maven](https://img.shields.io/badge/Maven-Build-blue?logo=apache-maven&logoColor=white) Apache Maven — build & dependency management (pom.xml present)
- ![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ-IDEA-black?logo=jetbrains&logoColor=white) IntelliJ IDEA — development IDE (project metadata present)
- ![Git](https://img.shields.io/badge/Git-Version_control-black?logo=git&logoColor=white) Git — source control
- ![GitHub](https://img.shields.io/badge/GitHub-repo-black?logo=github&logoColor=white) GitHub — repository hosting
- ![Markdown](https://img.shields.io/badge/Docs-Markdown-1f425f?logo=markdown&logoColor=white) Markdown — README & docs

> If you use additional libraries or tools (JUnit, Lombok, GitHub Actions, Docker, etc.), tell me and I will add their badges and short usage notes.

## Requirements
- Java Development Kit (JDK) 23 or later
- Maven 3.6+ (or a recent Maven wrapper)
- Git for source control

## Build & run
From the project root you can build and run in several ways:

1) Build with Maven and run from the compiled classes (recommended during development):

```bash
# compile
mvn compile

When you run the program you should see a simple console menu. Example interaction: 


# run with maven exec (replace the main class if different)
mvn exec:java -Dexec.mainClass="com.yourpackage.Main"


```


2) Build a jar and run (if the project is configured to produce an executable jar):

```bash
# package the app
mvn package

# run the jar (replace the jar name with the produced artifact)
java -jar target/CodeAlpha_StudentGradeTracker-1.0-SNAPSHOT.jar

```

3) Run from your IDE (IntelliJ):
- Open the project in IntelliJ
- Build the project or run the Main class that contains the public static void main(String[] args) entry point

Notes:

- If the project uses a different main class or artifactId, replace the example names above with the actual values from your pom.xml.
- If mvn exec:java fails, either configure the exec plugin in pom.xml or run the compiled class directly with java -cp target/classes fully.qualified.Main.

## Usage example
When you run the program you should see a simple console menu. Example interaction:
Welcome to CodeAlpha Student Grade Tracker
1) Add student
2) Add grade for student
3) View report
4) Exit

Select an option: 1
Enter student name: Alice
Student added: Alice

Select an option: 2
Enter student name: Alice
Enter grade (0-100): 92
Grade added for Alice: 92

Select an option: 3
Report for Alice:
- Average: 92.0
- Highest: 92
- Lowest: 92
- Letter grade: A

## Project structure
A typical layout (your package names and folders may differ):

.
├── pom.xml
├── README.md
└── src
    ├── main
    │   └── java
    │       └── com/yourcompany/gradetracker
    │           ├── Main.java
    │           ├── Student.java
    │           └── GradeManager.java
    └── test
        └── java

## Development Notes
- pom.xml currently sets source/target Java to 23.
- Replace placeholder main class used in examples with the actual fully-qualified class name from your code.
- Recommended improvements:
  1. Add unit tests (JUnit 5)
  2. Add GitHub Actions CI to run mvn package on pushes/PRs
  3. Add CSV import/export and optional persistence


## Contributing
Contributions, bug reports and improvements are welcome. To contribute:

- Fork the repo
- Create a feature branch
- Open a pull request describing your change
If you want help writing tests or expanding features (CLI options, CSV import/export, GUI), open an issue describing your plan.

## Contact
Maintained by sonalidevloper — find the repository at: https://github.com/sonalidevloper/CodeAlpha_StudentGradeTracker


