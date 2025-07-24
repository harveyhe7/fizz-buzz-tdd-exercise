# FizzBuzz TDD Practice

Welcome to the FizzBuzz TDD practice project! This repository is designed for students to practice **Test-Driven Development (TDD)** using Java and JUnit 5.

---

## 🧾 Problem Description

You are a physical education teacher. At the end of class, you decide to play a counting game with the students. The rules are as follows:

- All students stand in line and count off in order (starting from 1).
- When counting:
  - If a student's number is a **multiple of 3**, they should say `"Fizz"` instead of the number.
  - If it is a **multiple of 5**, they should say `"Buzz"`.
  - If it is a **multiple of both 3 and 5**, they should say `"FizzBuzz"`.
  - Otherwise, they say the number itself.

---

## 🧠 Your Task

1. Read and understand the rules of the game above.
2. **Break down the problem into tasks**.
3. **Write the test cases first** using JUnit 5.
4. Implement the solution using **TDD**:
   - Write a failing test
   - Write production code to pass the test
   - Refactor the code if needed

---

## ✅ Expectations

- You should create a class `FizzBuzz` with a method:
  ```java
  public String countOff(int number){}
  ```
- You should create a test class `FizzBuzzTest` under `src/test/java`.
- Your test class should contain **multiple small test methods**, each testing one behavior.
- Your code should be clean, readable, and pass all tests.

---

## 🚀 Getting Started

### Requirements

- Java 8 or above
- IDE (e.g., IntelliJ IDEA)

---

## 📁 Suggested Project Structure

```
fizz-buzz-tdd-exercise/
├── src/
│   └── main/
│       └── java/
│           └── FizzBuzz.java
├── src/
│   └── test/
│       └── java/
│           └── FizzBuzzTest.java
├── pom.xml
└── README.md
```

---

## 📌 Reminder

> This is a **TDD** exercise. Be sure to follow the process:
>
> 1. Write a test that fails
> 2. Write the minimal code to make it pass
> 3. Refactor if needed

---

Good luck and enjoy the TDD experience!
