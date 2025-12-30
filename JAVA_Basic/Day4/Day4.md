# 📘 Day 04 – Loops in Java

## 🎯 Learning Objectives
- Understand the concept of loops in programming
- Learn different types of loops: for, while, do-while
- Write programs using loops for repetitive tasks
- Build efficient code for calculations and patterns

---

## 🧠 Loops in Java

Loops allow executing a block of code repeatedly until a condition is met.

---

## 🔹 1. for Loop
Used when the number of iterations is known.

### Syntax
```java
for (initialization; condition; increment/decrement) {
    // code to be executed
}
```

### Example
```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Iteration: " + i);
}
```

---

## 🔹 2. while Loop
Used when the number of iterations is unknown, but condition is checked before execution.

### Syntax
```java
while (condition) {
    // code to be executed
    // update condition
}
```

### Example
```java
int i = 1;
while (i <= 5) {
    System.out.println("Iteration: " + i);
    i++;
}
```

---

## 🔹 3. do-while Loop
Similar to while, but executes at least once, condition checked after.

### Syntax
```java
do {
    // code to be executed
    // update condition
} while (condition);
```

### Example
```java
int i = 1;
do {
    System.out.println("Iteration: " + i);
    i++;
} while (i <= 5);
```

---

## 🛠 Practical Programs

### Loops Demonstration
Based on [`loops.java`](JAVA_Basic/Day4/loops.java):

```java
package JAVA_Basic.Day4;

public class loops {
    public static void main(String[] args) {
        // For loop
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // While loop
        System.out.println("\nWhile Loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println("Iteration: " + j);
            j++;
        }

        // Do-while loop
        System.out.println("\nDo-While Loop:");
        int k = 1;
        do {
            System.out.println("Iteration: " + k);
            k++;
        } while (k <= 5);
    }
}
```

### Sum of N Numbers
Based on [`nsum.java`](JAVA_Basic/Day4/nsum.java):

```java
package JAVA_Basic.Day4;

import java.util.Scanner;

public class nsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }
}
```

### Multiplication Table
Based on [`table.java`](JAVA_Basic/Day4/table.java):

```java
package JAVA_Basic.Day4;

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print its multiplication table:");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
```

---

## 📝 Practice Tasks (Must Do)

### Task 1
Write a program to print the first 10 even numbers using a loop.

### Task 2
Write a program to calculate the factorial of a number using a loop.

### Task 3
Write a program to reverse a number using a loop.

### Task 4 (Think)
What is the difference between while and do-while loops?

---

## 📌 Key Takeaways
- Loops repeat code execution based on conditions
- for loop is ideal for known iterations
- while and do-while for unknown iterations
- Always ensure loop termination to avoid infinite loops
- Use loops for efficient repetitive tasks

---

## 🎉 What's Next?
Excellent work on Day 4! Next, explore arrays and more data structures.

*This README was updated with ❤️ for Java learners. Feel free to contribute or suggest improvements!*