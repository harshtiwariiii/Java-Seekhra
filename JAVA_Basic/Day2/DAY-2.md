# 📘 Day 02 – Variables, Data Types & Memory in Java

> 🚀 Welcome to Day 2 of your Java journey! Today we'll dive deep into the building blocks of Java programming.

## 📋 Table of Contents
- [🎯 Learning Objectives](#-learning-objectives)
- [🧠 Variables in Java](#-variables-in-java)
- [🧩 Data Types in Java](#-data-types-in-java)
- [🔹 Primitive Data Types](#-primitive-data-types)
- [🔸 Non-Primitive Data Types](#-non-primitive-data-types)
- [🧠 Memory Management in Java](#-memory-management-in-java)
- [🛠 Practical Example](#-practical-example)
- [🔍 Type Casting in Java](#-type-casting-in-java)
- [📝 Task 2: Simple Interest Calculator](#-task-2-simple-interest-calculator)

---

## 🎯 Learning Objectives
By the end of this lesson, you will be able to:
- ✅ Understand what variables are in Java
- ✅ Learn primitive and non-primitive data types
- ✅ Understand how Java stores data in memory
- ✅ Practice writing Java programs using variables

---

## 🧠 Variables in Java

A **variable** is a container used to store data in memory. Think of it as a labeled box where you can put different types of information.

### 📝 Syntax
```java
dataType variableName = value;
```

**Example:**
```java
int age = 21;
```

---

## 🧩 Data Types in Java

Java is a **statically typed language**, meaning the type of every variable must be declared before use. This helps catch errors at compile time!

### 🔹 Primitive Data Types

Primitive data types are the basic building blocks. Here's a comprehensive table:

| Data Type | Size    | Range/Example | Description |
|-----------|---------|---------------|-------------|
| `byte`    | 1 byte  | -128 to 127   | Small integers |
| `short`   | 2 bytes | -32,768 to 32,767 | Medium integers |
| `int`     | 4 bytes | -2^31 to 2^31-1 | Most common integers |
| `long`    | 8 bytes | -2^63 to 2^63-1 | Large integers |
| `float`   | 4 bytes | ±3.4E-38 to ±3.4E+38 | Single-precision floating point |
| `double`  | 8 bytes | ±1.7E-308 to ±1.7E+308 | Double-precision floating point |
| `char`    | 2 bytes | 0 to 65,535 (Unicode) | Single character |
| `boolean` | 1 bit   | `true` or `false` | Logical values |

**📌 Most commonly used:** `int`, `double`, `char`, `boolean`

**Examples:**
```java
byte b = 10;
short s = 100;
int a = 25;
long l = 100000L;
float f = 3.14f;
double d = 99.99;
char c = 'A';
boolean flag = true;
```

### 🔸 Non-Primitive Data Types

Non-primitive types are more complex and can store multiple values or objects:

- **String** - Sequence of characters
- **Arrays** - Collection of similar data types
- **Classes** - User-defined blueprints
- **Objects** - Instances of classes
- **Interfaces** - Abstract types

**Example:**
```java
String name = "Harsh";
int[] numbers = {1, 2, 3, 4, 5};
```

---

## 🧠 Memory Management in Java

Java uses two main types of memory for efficient data storage:

### 1️⃣ Stack Memory
- 📍 Stores primitive data types
- 📍 Stores method calls and local variables
- ⚡ Fast access
- 🔄 Automatic memory management

### 2️⃣ Heap Memory
- 📍 Stores objects and arrays
- 📍 Allocated using `new` keyword
- 🗑️ Managed by Garbage Collector
- 🌐 Shared across threads

**Visual Example:**
```java
int x = 10;            // Stored in Stack memory
String name = "Ram";   // Object stored in Heap, reference in Stack
```

---

## 🛠 Practical Example

Let's create a comprehensive program using all the concepts we've learned!

**VariablesDemo.java**
```java
public class VariablesDemo {
    public static void main(String[] args) {
        // Primitive data types
        int age = 21;
        double salary = 50000.50;
        char grade = 'A';
        boolean isDeveloper = true;

        // Non-primitive data type
        String name = "Harsh";

        // Output the values
        System.out.println("=== Employee Information ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Salary: $" + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Developer: " + isDeveloper);
    }
}
```

**Expected Output:**
```
=== Employee Information ===
Name: Harsh
Age: 21 years
Salary: $50000.5
Grade: A
Developer: true
```

---

## 🔍 Type Casting in Java

Type casting is converting one data type to another. There are two types:

### 🌟 Implicit Type Casting (Widening)
- Automatic conversion from smaller to larger data types
- No data loss
- Example: `int` to `double`

```java
int a = 10;
double b = a;  // Automatic casting: 10.0
System.out.println("b = " + b);
```

### ⚠️ Explicit Type Casting (Narrowing)
- Manual conversion from larger to smaller data types
- May cause data loss
- Requires casting operator `(type)`

```java
double x = 9.8;
int y = (int) x;  // Manual casting: 9 (decimal part lost)
System.out.println("y = " + y);
```

---

## 📝 Task 2: Simple Interest Calculator

**Objective:** Write a program to calculate Simple Interest using the formula:

**SI = (P × R × T) / 100**

Where:
- **P** = Principal amount
- **R** = Rate of interest per annum
- **T** = Time in years

**Example Code Structure:**
```java
public class SimpleInterest {
    public static void main(String[] args) {
        // Declare variables
        double principal = 10000;
        double rate = 5.5;
        double time = 3;

        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display result
        System.out.println("Simple Interest: $" + simpleInterest);
    }
}
```

**💡 Pro Tip:** Try different values for P, R, and T to see how the interest changes!

---

## 🎉 What's Next?

Great job completing Day 2! Tomorrow we'll explore:
- 🔀 Control Flow Statements (if-else, loops)
- 🔧 Operators in Java
- 📊 More advanced programming concepts

**Keep practicing and happy coding! 🚀**

---

*This README was created with ❤️ for Java learners. Feel free to contribute or suggest improvements!*"