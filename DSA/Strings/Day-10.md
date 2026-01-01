# 📘 Day 10 – Strings in Java (In Depth)

## 🎯 Learning Objectives
- Understand what Strings are in Java
- Learn how Strings are stored in memory
- Understand String Pool concept
- Differentiate between String, StringBuilder & StringBuffer
- Practice common String operations
- Prepare for interview questions

---

## 🧠 What is a String in Java?

A **String** is:
- A sequence of characters
- An object of `String` class
- **Immutable** (cannot be changed)

```java
String name = "Harsh";
```
📌 String belongs to java.lang package.

### 🔍 How Strings are Created

1️⃣ **Using String Literal (Recommended)**
```java
String s1 = "Java";
```
- Stored in String Constant Pool (SCP)
- Saves memory
- Reuses existing object

2️⃣ **Using new Keyword**
```java
String s2 = new String("Java");
```
- Stored in Heap memory
- Creates a new object every time

### 🧠 String Constant Pool (SCP)
```java
String a = "Java";
String b = "Java";
```
✔ Both refer to same object

```java
String c = new String("Java");
```
❌ New object created

### 🔍 == vs equals() vs compareTo() (VERY IMPORTANT)

#### == vs equals()
```java
String s1 = "Java";
String s2 = "Java";
String s3 = new String("Java");
```
| Comparison       | Result |
|------------------|--------|
| s1 == s2        | true  |
| s1 == s3        | false |
| s1.equals(s3)   | true  |

📌
- == → compares reference
- equals() → compares content

#### compareTo() Method
compareTo() is used to compare content lexicographically (dictionary order). It belongs to the Comparable interface.

```java
String a = "Apple";
String b = "Banana";
String c = "Apple";

System.out.println(a.compareTo(b)); // negative
System.out.println(b.compareTo(a)); // positive
System.out.println(a.compareTo(c)); // 0
```

📌 Return values of compareTo():
- 0: Both strings are equal
- < 0: Calling object is smaller
- > 0: Calling object is greater

✔ compareTo() checks content and order, not memory.

🧠 Key Concept:
- == → Reference comparison
- equals() → Content comparison
- compareTo() → Content comparison + ordering

#### Example with Numbers (Wrapper Classes)
```java
Integer x = 10;
Integer y = 10;

System.out.println(x == y);        // true (cached)
System.out.println(x.compareTo(y)); // 0
```
📌 Wrapper classes can cache small values, so == may behave confusingly.

#### Side-by-Side Comparison
| Feature     | ==          | equals()    | compareTo() |
|-------------|-------------|-------------|-------------|
| Type        | Operator    | Method      | Method      |
| Compares    | Reference   | Content     | Content (order) |
| Returns     | boolean     | boolean     | int         |
| Used for    | Same object check | Content equality | Sorting, ordering |
| Works with  | Primitives & Objects | Objects only | Objects only |
| Interface   | ❌          | ❌          | Comparable  |

#### Interview Trick Question
```java
String s1 = new String("Java");
String s2 = new String("Java");

System.out.println(s1 == s2);        // false
System.out.println(s1.compareTo(s2)); // 0
```
✔ Correct Explanation:
- Different objects → == false
- Same content → compareTo() returns 0

📝 When to Use What?
- Use == when: Checking if two references point to the same object, Comparing primitive types
- Use equals() when: Checking content equality
- Use compareTo() when: Sorting objects, Comparing strings alphabetically, Implementing Comparable

🧠 One-Line Interview Answer:
== compares references, equals() compares content, whereas compareTo() compares content lexicographically and returns an integer indicating order.

---

## 🚫 String Immutability
```java
String s = "Hello";
s.concat(" World");
System.out.println(s);
```
Output:
```
Hello
```
📌 Original string remains unchanged.

## 🔁 Common String Methods
```java
String s = "Java Programming";
```
| Method          | Description              |
|-----------------|--------------------------|
| length()       | Returns length          |
| charAt(i)      | Character at index      |
| substring(a,b) | Extract substring       |
| toUpperCase()  | Uppercase                |
| toLowerCase()  | Lowercase                |
| contains()     | Check substring          |
| replace()      | Replace characters       |
| trim()         | Remove spaces            |

## 🛠 Practical Example
```java
class StringDemo {
    public static void main(String[] args) {
        String s = " Java ";

        System.out.println(s.length());
        System.out.println(s.trim());
        System.out.println(s.toUpperCase());
        System.out.println(s.contains("Java"));
    }
}
```

## 🔄 StringBuilder vs StringBuffer

### 🔹 StringBuilder
- Mutable
- Faster
- Not thread-safe

### 🔹 StringBuffer
- Mutable
- Thread-safe
- Slower

```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" Java");
System.out.println(sb);
```

### 🔍 Comparison Table
| Feature      | String | StringBuilder | StringBuffer |
|--------------|--------|---------------|--------------|
| Mutable      | ❌     | ✅            | ✅          |
| Thread Safe  | ❌     | ❌            | ✅          |
| Performance  | Slow   | Fast          | Slower      |

### 🧠 When to Use What?
- String → Read-only data
- StringBuilder → Frequent modifications
- StringBuffer → Multithreaded environment

## 🧪 Practical – Reverse a String
```java
class ReverseString {
    public static void main(String[] args) {
        String s = "Java";
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }

        System.out.println(rev);
    }
}
```

## 🧠 Time Complexity of String Operations
| Operation | Complexity |
|-----------|------------|
| length()  | O(1)      |
| charAt()  | O(1)      |
| concat()  | O(n)      |
| equals()  | O(n)      |

## ❗ Common Interview Questions
- Why is String immutable?
- Difference between == and equals()?
- What is String Pool?
- Why StringBuilder is faster?
- How to reverse a string?
- Difference between compareTo() and ==?

## 📝 Practice Tasks
1. Check if a string is palindrome.
2. Count vowels and consonants in a string.
3. Find duplicate characters in a string.

## 📌 Key Takeaways
- Strings are immutable objects
- SCP improves memory usage
- equals() compares content
- Use StringBuilder for modifications
- Strings are interview favorites

## ⏭ Next Topic
Day 11 – OOP: Classes & Objects

---

### ✅ Your Move
Reply with:
1️⃣ Done / In progress  
2️⃣ Which string task you solved  
3️⃣ Ready for **Day-11 (OOP)** or want **more string problems**

You're moving like a **serious Java dev** 💪🔥