# 📘 Bit Manipulation in Java – In Depth (Interview Ready)

## 🎯 Learning Objectives
- Understand bits and binary representation
- Learn all bitwise operators in Java
- Perform common bit manipulation operations
- Solve interview-level bit problems
- Build strong low-level logic for DSA

---

## 🧠 What is Bit Manipulation?

**Bit Manipulation** means:
> Directly working with **binary representation (0s and 1s)** of numbers using bitwise operators.

📌 Computers store all data in **binary**, so bit manipulation is:
- Very fast
- Memory efficient
- Common in interviews & system-level code

---

## 🔢 Binary Representation (Quick Recap)

| Decimal | Binary |
|-------|--------|
| 0 | 0000 |
| 1 | 0001 |
| 2 | 0010 |
| 3 | 0011 |
| 4 | 0100 |
| 5 | 0101 |

---

## 🔹 Bitwise Operators in Java

| Operator | Name | Description |
|--------|------|-------------|
| `&` | AND | 1 if both bits are 1 |
| `|` | OR | 1 if any bit is 1 |
| `^` | XOR | 1 if bits are different |
| `~` | NOT | Inverts bits |
| `<<` | Left Shift | Shifts bits left |
| `>>` | Right Shift | Shifts bits right |

---

## 🧠 Operator Truth Tables

### AND (`&`)
```
1 & 1 = 1
1 & 0 = 0
0 & 1 = 0
0 & 0 = 0
```

### OR (`|`)
```
1 | 1 = 1
1 | 0 = 1
0 | 1 = 1
0 | 0 = 0
```

### XOR (`^`)
```
1 ^ 1 = 0
1 ^ 0 = 1
0 ^ 1 = 1
0 ^ 0 = 0
```

📌 XOR is **VERY IMPORTANT for interviews**

---

## 🛠 Basic Bitwise Examples

```java
int a = 5;  // 0101
int b = 3;  // 0011

System.out.println(a & b); // 1
System.out.println(a | b); // 7
System.out.println(a ^ b); // 6
```

### 🔁 Left Shift (`<<`)
```java
int x = 5;      // 0101
System.out.println(x << 1);  // Output: 10
```

📌 Formula: `x << n = x × (2^n)`

### 🔁 Right Shift (`>>`)
```java
int x = 10;   // 1010
System.out.println(x >> 1);  // Output: 5
```

📌 Formula: `x >> n = x / (2^n)`

---

## 🧠 IMPORTANT Bit Tricks (INTERVIEW GOLD)

### ✅ Check if a Number is Even or Odd
```java
if ((n & 1) == 0)
    System.out.println("Even");
else
    System.out.println("Odd");
```

### ✅ Check if a Number is Power of 2
```java
boolean isPowerOfTwo(int n) {
    return n > 0 && (n & (n - 1)) == 0;
}
```

### ✅ Get ith Bit
```java
int getBit(int n, int i) {
    return (n & (1 << i)) != 0 ? 1 : 0;
}
```

### ✅ Set ith Bit
```java
int setBit(int n, int i) {
    return n | (1 << i);
}
```

### ✅ Clear ith Bit
```java
int clearBit(int n, int i) {
    return n & ~(1 << i);
}
```

### ✅ Toggle ith Bit
```java
int toggleBit(int n, int i) {
    return n ^ (1 << i);
}
```

---

## 🧠 XOR Properties (VERY IMPORTANT)
```
x ^ x = 0
x ^ 0 = x
x ^ y ^ x = y
```

---

## 🛠 Practical – Find Unique Element
Array where every element appears twice except one.

```java
class UniqueElement {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 5, 3, 4};
        int res = 0;

        for (int x : arr) {
            res ^= x;
        }

        System.out.println(res);  // Output: 2
    }
}
```
✔ Time: O(n)  
✔ Space: O(1)

---

## 🧠 Count Set Bits (1s in Binary)
```java
int countSetBits(int n) {
    int count = 0;

    while (n > 0) {
        n = n & (n - 1);
        count++;
    }
    return count;
}
```
📌 Brian Kernighan's Algorithm

---

## 🔍 Time Complexity of Bit Operations

| Operation | Complexity |
|-----------|------------|
| AND, OR, XOR | O(1) |
| Shifts | O(1) |
| Set bit count | O(number of set bits) |

---

## ❗ Common Interview Questions
- Why is XOR used to find unique elements?
- How to check power of 2 in O(1)?
- Difference between `>>` and `>>>`?
- Why bit operations are fast?

---

## 📝 Practice Problems (Must Do)

### Task 1
Check if a number is power of 2

### Task 2
Count number of set bits in a number

### Task 3
Find the single non-repeating element in array

### Task 4 (Conceptual)
Why is `(n & (n - 1))` powerful?

---

## 📌 Key Takeaways
- Bit manipulation works at binary level
- XOR is extremely powerful
- Many problems reduce to bit tricks
- Bit ops are constant time
- Loved by interviewers