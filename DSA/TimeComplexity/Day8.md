# 📘 Time Complexity in Java – In Depth (Interview Ready)

## 🎯 Learning Objectives
- Understand what Time Complexity really means
- Learn Big-O notation in depth
- Analyze loops, nested loops, and functions
- Understand best, average, and worst cases
- Build intuition used in coding interviews

---

## 🧠 What is Time Complexity?

**Time Complexity** is a way to measure:
> How the execution time of an algorithm grows as input size increases.

📌 It does **NOT** measure actual time in seconds.  
It measures **growth rate**.

---

## 🔢 Why Time Complexity is Important?

- Helps choose **efficient algorithms**
- Critical for **DSA & interviews**
- Prevents **TLE (Time Limit Exceeded)**
- Used in **system & performance design**

---

## 🧮 Big-O Notation

Big-O describes the **upper bound (worst-case)** time complexity.

Example:
O(1), O(n), O(n²), O(log n)

---

## ⏱ Common Time Complexities

| Complexity | Name | Meaning |
|----------|------|--------|
| O(1) | Constant | Time does not depend on input |
| O(log n) | Logarithmic | Input reduces each step |
| O(n) | Linear | Time grows linearly |
| O(n log n) | Linearithmic | Efficient sorting |
| O(n²) | Quadratic | Nested loops |
| O(2ⁿ) | Exponential | Recursive brute force |

---

## 🔹 O(1) – Constant Time

```java
int x = arr[0];
```

Always takes same time

Best possible complexity

## 🔹 O(n) – Linear Time

```java
for (int i = 0; i < n; i++) {
    System.out.println(i);
}
```

Runs once for each element

Very common

## 🔹 O(n²) – Quadratic Time

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        System.out.println(i + j);
    }
}
```

Nested loops

Avoid for large inputs

## 🔹 O(log n) – Logarithmic Time

```java
for (int i = 1; i < n; i *= 2) {
    System.out.println(i);
}
```

Input reduces or doubles each step

Example: Binary Search

## 🧠 Best, Average & Worst Case

Example: Searching in an array

| Case | Meaning |
|------|---------|
| Best | Element found at start |
| Average | Element found in middle |
| Worst | Element at end / not present |

📌 Big-O always considers WORST case

## 🔍 How to Calculate Time Complexity (Rules)

### Rule 1: Drop Constants

```
O(2n) → O(n)
O(100) → O(1)
```

### Rule 2: Drop Lower Order Terms

```
O(n² + n) → O(n²)
```

### Rule 3: Different Loops → Add

```java
for (int i = 0; i < n; i++) { }
for (int j = 0; j < n; j++) { }
```

➡ O(n + n) = O(n)

### Rule 4: Nested Loops → Multiply

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
    }
}
```

➡ O(n × n) = O(n²)

## 🔁 Time Complexity of Functions

```java
static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
}
```

➡ Time Complexity: O(n)

📌 Function call does NOT change complexity — only logic matters.

## 🔁 Recursive Time Complexity (Intro)

```java
static void fun(int n) {
    if (n == 0) return;
    fun(n - 1);
}
```

➡ Time Complexity: O(n)

## 🧠 Interview Trick Questions

### Q1

```java
for (int i = 0; i < n; i++) {
    System.out.println("Hello");
}
```

✔ O(n)

### Q2

```java
for (int i = 0; i < n; i *= 2) { }
```

✔ O(log n)

### Q3

```java
for (int i = 0; i < n; i++) {
    for (int j = i; j < n; j++) { }
}
```

✔ O(n²)

## 🚫 Common Mistakes
❌ Counting print statements  
❌ Including constants  
❌ Confusing average with worst case  
❌ Thinking recursion is always exponential  

## 📝 Practice Problems

### Task 1
Find time complexity:

```java
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.println(j);
    }
}
```

### Task 2
What is the time complexity of binary search and why?

### Task 3
Why is O(n log n) better than O(n²)?

## 📌 Key Takeaways
- Time complexity measures growth, not actual time
- Big-O ignores constants
- Worst case is always considered
- Nested loops increase complexity
- Interviewers expect fast analysis