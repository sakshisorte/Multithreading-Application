# MultiThread Application with Error Handling

## Internship Details

- **Name:** Sakshi Sorte

---

# Project Title

**MultiThread Application with Error Handling**

---

# Objective

The objective of this project is to demonstrate the implementation of multithreading, synchronization, and exception handling in Java. The application executes two threads simultaneously, ensuring thread-safe execution while handling exceptions efficiently using both built-in and custom exception handling mechanisms.

---

# Project Description

This project simulates a multi-threaded environment where two independent tasks are executed concurrently.

- One thread prints numbers from **1 to 10** with a **1-second delay** between each number.
- Another thread calculates the **factorial of numbers from 1 to 5** simultaneously.
- Synchronization is used to ensure that both threads do not access the shared printing resource at the same time, thereby preventing race conditions.
- Exception handling is implemented to gracefully manage runtime errors and invalid inputs.

---

# Features

- Multi-threaded execution using Java Threads.
- Prints numbers from **1 to 10** with a one-second delay.
- Calculates factorials of numbers from **1 to 5**.
- Parallel execution of multiple threads.
- Thread synchronization using the `synchronized` keyword.
- Custom exception (`InvalidFactorialException`) for invalid factorial inputs.
- Exception handling using `try-catch` blocks.
- Demonstrates thread coordination using `join()`.

---

# Technologies Used

- Java
- VS Code
- Git
- GitHub

---

# Java Concepts Covered

- Classes and Objects
- Multithreading
- Thread Class
- Method Overriding
- Synchronization
- Exception Handling
- Custom Exceptions
- Loops
- Conditional Statements
- Methods

---

# Project Structure

```
MultiThreadApplication/
│
├── MultiThreadApplication.java
├── README.md
```

---

# How to Run the Project

## Compile

```bash
javac MultiThreadApplication.java
```

## Execute

```bash
java MultiThreadApplication
```

---

# Sample Output

```
Number Thread : 1
Factorial Thread : Factorial of 1 = 1
Factorial Thread : Factorial of 2 = 2
Number Thread : 2
Factorial Thread : Factorial of 3 = 6
Factorial Thread : Factorial of 4 = 24
Number Thread : 3
Factorial Thread : Factorial of 5 = 120
Number Thread : 4
Number Thread : 5
Number Thread : 6
Number Thread : 7
Number Thread : 8
Number Thread : 9
Number Thread : 10

All Threads Executed Successfully.
```

---

# Exception Handling

The application uses exception handling to improve reliability and prevent unexpected program termination.

### Built-in Exception

- `InterruptedException`
  - Handles interruptions while a thread is sleeping.

### Custom Exception

- `InvalidFactorialException`
  - Thrown when the factorial of a negative number is requested.

---

# Thread Safety

To prevent race conditions, a shared printing method is declared using the `synchronized` keyword.

This ensures that only one thread accesses the printing method at a time, producing clean and organized output without overlapping messages.

---

# Learning Outcomes

Through this project, the following Java concepts were successfully implemented:

- Creating and executing multiple threads.
- Running threads concurrently.
- Synchronizing shared resources.
- Handling exceptions effectively.
- Creating and using custom exceptions.
- Managing thread execution using `join()` and `sleep()`.
- Building a structured Java application following object-oriented programming principles.

---

# Conclusion

This project successfully demonstrates the practical implementation of **multithreading, synchronization, and exception handling** in Java. Two independent threads execute concurrently while maintaining thread safety through synchronization. Proper exception handling and a custom exception improve the application's robustness and reliability. Overall, the project provides a clear understanding of concurrent programming concepts in Java and highlights the importance of safe resource sharing, efficient thread management, and structured error handling in real-world applications.

---