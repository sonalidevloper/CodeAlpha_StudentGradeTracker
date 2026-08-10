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
- [Contributing](#contributing)
- [License](#license)

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

# run with maven exec (replace the main class if different)
mvn exec:java -Dexec.mainClass="com.yourpackage.Main"
