# 📘 Functions (Methods) in Java – In Depth Guide

## 🎯 Learning Objectives
- Understand what functions (methods) are in Java
- Learn method syntax and components
- Understand types of methods
- Learn parameter passing in Java
- Understand method memory behavior
- Prepare for interview-level questions

---

## 🧠 What is a Function (Method) in Java?

In Java, a **function** is called a **method**.

A method is a **block of code** that:
- Performs a specific task
- Executes only when called
- Can be reused multiple times

📌 Methods help in:
- Code reusability
- Modularity
- Readability
- Easy debugging

---

## 🧩 General Syntax of a Method

```java
accessModifier static/non-static returnType methodName(parameters) {
    // method body
}
```

### Example
```java
public static int add(int a, int b) {
    return a + b;
}
```

## 🔍 Components of a Method

1️⃣ **Access Modifier**  
Defines visibility of method:  
- `public`  
- `private`  
- `protected`  
- `default`  

2️⃣ **static Keyword**  
Belongs to class, not object  
Can be called without creating object  
`main()` is static  

```java
static void greet() {
    System.out.println("Hello");
}
```

3️⃣ **Return Type**  
Specifies what the method returns:  
- `int`, `double`, `String`, etc.  
- `void` → returns nothing  

```java
static void printMessage() { }
static int square(int x) { return x * x; }
```

4️⃣ **Method Name**  
Follows camelCase  
Should describe action  

```java
calculateSum()
findMax()
printDetails()
```

5️⃣ **Parameters**  
Inputs to the method  
Also called formal parameters  

```java
static int multiply(int a, int b)
```

## 🔁 Calling a Method

### Static Method Call
```java
add(10, 20);
```

### Non-Static Method Call
```java
ClassName obj = new ClassName();
obj.methodName();
```

## 🔹 Types of Methods in Java

1️⃣ **Predefined Methods**  
Already provided by Java:  

```java
System.out.println();
Math.sqrt(16);
```

2️⃣ **User-Defined Methods**  
Created by programmer.  

```java
static int cube(int x) {
    return x * x * x;
}
```

## 🔄 Parameter Passing in Java (IMPORTANT)

Java uses **Call by Value** only.

### Example
```java
class Test {
    static void change(int x) {
        x = 50;
    }

    public static void main(String[] args) {
        int a = 10;
        change(a);
        System.out.println(a);
    }
}
```

**Output**  
```
10
```

📌 Original value does NOT change.

## 🧠 Method Memory Allocation

### Stack Memory
- Stores method calls
- Stores local variables
- Each method has its own stack frame

### Heap Memory
- Objects created inside methods go to heap

## 🔍 Example – Method Call Stack
```java
static void fun1() {
    fun2();
}

static void fun2() {
    System.out.println("Hello");
}
```

Execution:  
```
main() → fun1() → fun2()
```

Stack follows LIFO (Last In First Out).

## 🔁 Method Overloading

Method overloading means:  
Same method name, different parameters  

### Example
```java
static int add(int a, int b) {
    return a + b;
}

static double add(double a, double b) {
    return a + b;
}
```

📌 Achieved at compile time.

## 🚫 Method Overloading Rules
- Different number of parameters ✔
- Different data types ✔
- Different return type alone ❌

## 🛠 Practical Example – Utility Methods
```java
class Utility {

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        System.out.println(isEven(10));
        System.out.println(max(5, 9));
    }
}
```

## ❗ Common Mistakes (Interview Important)
❌ Forgetting `static` in main helpers  
❌ Not returning value in non-void method  
❌ Confusing arguments and parameters  
❌ Expecting call by reference  

## 📝 Practice Questions
**Task 1**  
Write a method to:  
Check if a number is prime  

**Task 2**  
Write a method to:  
Return factorial of a number  

**Task 3 (Conceptual)**  
Why is `main()` method static?  

## 📌 Key Takeaways
- Java functions are called methods
- Methods improve reusability and structure
- Java uses call by value
- Stack manages method execution
- Method overloading enables flexibility

---

## 📁 Day 7 Files

This folder contains Java programs demonstrating functions (methods) in Java, part of the Java basics tutorial series.

### Files
- **Factorial.java**: Computes the factorial of a number using a recursive method.
- **Functions.java**: Demonstrates various user-defined methods, including method calls and basic operations.
- **Sum.java**: Calculates the sum of numbers using a method.

### How to Run
These programs are in the `JAVA_Basic.Day7` package. To compile and run:

1. Navigate to the project root directory (`c:\Users\ASUS\Desktop\Java`).
2. Compile: `javac JAVA_Basic/Day7/*.java`
3. Run: `java JAVA_Basic.Day7.ClassName` (replace ClassName with the specific class, e.g., `Factorial`)

### Requirements
- Java Development Kit (JDK) 17 or higher.
- The programs use standard Java libraries and do not require additional dependencies.