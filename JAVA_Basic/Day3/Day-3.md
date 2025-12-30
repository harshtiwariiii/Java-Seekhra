# 📘 Day 03 – Operators & Control Statements (if-else)

## 🎯 Learning Objectives
- Understand different types of operators in Java
- Learn how decision making works using if-else
- Write real-world conditional programs
- Build logical thinking for problem solving

---

## 🧠 Operators in Java

Operators are symbols used to perform operations on variables and values.

---

## 🔹 1. Arithmetic Operators

| Operator | Description | Example |
|----------|-------------|---------|
| +        | Addition    | a + b   |
| -        | Subtraction | a - b   |
| *        | Multiplication | a * b |
| /        | Division    | a / b   |
| %        | Modulus     | a % b   |

### Example
```java
int a = 10, b = 3;
System.out.println(a + b); // 13
System.out.println(a % b); // 1
```

---

## 🔹 2. Relational Operators
Used to compare two values. Result is always boolean.

| Operator | Meaning          |
|----------|------------------|
| ==       | Equal to         |
| !=       | Not equal        |
| >        | Greater than     |
| <        | Less than        |
| >=       | Greater than or equal |
| <=       | Less than or equal |

```java
int x = 5, y = 10;
System.out.println(x < y); // true
```

---

## 🔹 3. Logical Operators
Used to combine multiple conditions.

| Operator | Meaning |
|----------|---------|
| &&       | AND     |
| \|\|     | OR      |
| !        | NOT     |

```java
int age = 20;
boolean hasID = true;

System.out.println(age >= 18 && hasID); // true
```

---

## 🔹 4. Assignment Operators
```java
int a = 10;
a += 5;  // a = a + 5
```

---

## 🔹 5. Unary Operators
```java
int x = 5;
x++;  // Increment
x--;  // Decrement
```

---

## 🧠 Control Statements – if-else
Control statements decide which block of code runs.

### 🔹 if Statement
```java
int age = 20;

if (age >= 18) {
    System.out.println("Eligible to vote");
}
```

### 🔹 if-else Statement
```java
int age = 16;

if (age >= 18) {
    System.out.println("Eligible to vote");
} else {
    System.out.println("Not eligible to vote");
}
```

### 🔹 else-if Ladder
```java
int marks = 85;

if (marks >= 90) {
    System.out.println("Grade A");
} else if (marks >= 75) {
    System.out.println("Grade B");
} else if (marks >= 50) {
    System.out.println("Grade C");
} else {
    System.out.println("Fail");
}
```

---

## 🛠 Practical Programs

### Number Check
Based on [`Conditions.java`](JAVA_Basic/Day3/Conditions.java):

```java
package JAVA_Basic.Day3;

import java.util.*;

public class Conditions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age ");

        int age  = sc.nextInt();

        if(age>= 18){
            System.out.println("You are an adult");

        }
        else{
            System.out.println("you are a minor");
        }
    }
}
```

### Even or Odd
Based on [`Oddeven.java`](JAVA_Basic/Day3/Oddeven.java):

```java
package JAVA_Basic.Day3;

import java.util.*;

public class Oddeven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number:-");

        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } 
        else {
            System.out.println(number + " is an odd number.");
        }
    }
}
```

### Switch Statement for Days of the Week
Based on [`Switch.java`](JAVA_Basic/Day3/Switch.java):

```java
package JAVA_Basic.Day3;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 7 to get the corresponding day of the week:");
        int day = sc.nextInt();
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }

        System.out.println("The day is: " + dayName);
    }
}
```

---

## 📝 Practice Tasks (Must Do)

### Task 1
Write a program to check whether a number is positive, negative, or zero. (See [`Conditions.java`](JAVA_Basic/Day3/Conditions.java) for a similar example.)

### Task 2
Write a program to find the largest of two numbers.

### Task 3
Write a program to check whether a person is eligible for driving license (age ≥ 18). (See [`Conditions.java`](JAVA_Basic/Day3/Conditions.java).)

### Task 4 (Think)
What is the difference between:
- `==` (comparison operator)
- `=` (assignment operator)

---

## 📌 Key Takeaways
- Operators perform actions on data
- Relational operators return boolean values
- Logical operators combine conditions
- if-else controls program flow
- Conditions must evaluate to true or false

---

## 🎉 What's Next?
Great job completing Day 3! Continue practicing with loops and more advanced topics.

*This README was updated with ❤️ for Java learners. Feel free to contribute or suggest improvements!*