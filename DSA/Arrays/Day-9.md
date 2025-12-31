# 📘 Day 06 – Arrays in Java (1D & 2D)

## 🎯 Learning Objectives
- Understand what arrays are and why they are used
- Learn how arrays are stored in memory
- Work with 1D and 2D arrays
- Apply loops with arrays
- Analyze array operations with time complexity

---

## 🧠 What is an Array?

An **array** is a data structure that:
- Stores **multiple values**
- Of the **same data type**
- In **contiguous memory locations**

📌 Indexing starts from **0**.

---

## ❓ Why Do We Need Arrays?

Without arrays:
```java
int a1, a2, a3, a4, a5;
With arrays:

java
Copy code
int[] arr = new int[5];
✔ Less code
✔ Easy access
✔ Efficient iteration

🧩 Declaration of Array (1D)
Method 1 – Declaration + Allocation
java
Copy code
int[] arr = new int[5];
Method 2 – Declaration + Initialization
java
Copy code
int[] arr = {10, 20, 30, 40, 50};
🔍 Accessing Array Elements
java
Copy code
int[] arr = {10, 20, 30};

System.out.println(arr[0]); // 10
System.out.println(arr[2]); // 30
📌 Invalid index → ArrayIndexOutOfBoundsException

🔁 Traversing an Array
Using for loop
java
Copy code
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
Using enhanced for loop
java
Copy code
for (int x : arr) {
    System.out.println(x);
}
🧠 Memory Allocation of Array
Array object is stored in Heap memory

Reference variable stored in Stack

Default values:

int → 0

double → 0.0

boolean → false

object → null

🛠 Practical – Sum of Array Elements
java
Copy code
class ArraySum {
    public static void main(String[] args) {

        int[] arr = {5, 10, 15, 20};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum = " + sum);
    }
}
🔍 Time Complexity of Array Operations
Operation	Time Complexity
Access	O(1)
Traversal	O(n)
Searching	O(n)
Updating	O(1)

🔲 2D Arrays in Java
🧠 What is a 2D Array?
A 2D array is an array of arrays (matrix-like).

java
Copy code
int[][] matrix = new int[3][3];
🔹 Declaration & Initialization
java
Copy code
int[][] mat = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
🔁 Traversing 2D Array
java
Copy code
for (int i = 0; i < mat.length; i++) {
    for (int j = 0; j < mat[i].length; j++) {
        System.out.print(mat[i][j] + " ");
    }
    System.out.println();
}
🛠 Practical – Matrix Addition
java
Copy code
class MatrixAdd {
    public static void main(String[] args) {

        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};
        int[][] sum = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
🚫 Common Mistakes
❌ Accessing invalid index
❌ Confusing length with length()
❌ Forgetting array is zero-indexed
❌ Assuming array auto-resizes (it does not)

📝 Practice Tasks (Must Do)
Task 1
Find the maximum element in an array.

Task 2
Reverse an array.

Task 3
Count even and odd numbers in an array.

Task 4 (Think – Interview)
Why is array size fixed in Java?

**Answer:** Array size is fixed in Java because arrays are allocated in contiguous memory blocks. Once allocated, the size cannot be changed to maintain memory integrity and performance. If you need a resizable array, use ArrayList from the Collections framework.

---

## 📝 Practice Task Answers

### Task 1: Find the maximum element in an array.

```java
class FindMax {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 3};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum element: " + max);
    }
}
```

### Task 2: Reverse an array.

```java
class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("Reversed array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
```

### Task 3: Count even and odd numbers in an array.

```java
class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int evenCount = 0;
        int oddCount = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}
```

### Task 4: Why is array size fixed in Java?

**Answer:** Array size is fixed in Java because arrays are allocated in contiguous memory blocks. Once allocated, the size cannot be changed to maintain memory integrity and performance. If you need a resizable array, use ArrayList from the Collections framework.

---

📌 Key Takeaways
Arrays store same-type data

Stored in heap memory

Fast access using index

Loops are essential with arrays

2D arrays represent matrices

