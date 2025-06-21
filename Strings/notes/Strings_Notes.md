````markdown
# 📚 Deep Dive: Strings in Java

---

## 🧠 What is a String?

A **String** in Java is an object that represents a sequence of characters. It's implemented as a **class in `java.lang` package** and is **immutable**.

```java
String s = "Hello";
````

---

## 🧩 Memory Model of Strings

### 🔸 String Pool (String Constant Pool - SCP)

Java maintains a pool of string literals in **heap memory** (a special area called SCP).

```java
String a = "abc";      // stored in pool
String b = "abc";      // reused from pool
```

### 🔸 New Keyword

```java
String c = new String("abc");
```

* This creates **two objects**: one in the heap and one (or reused) in the pool.

---

## 🧪 String Comparison

```java
String s1 = "test";
String s2 = "test";
String s3 = new String("test");

System.out.println(s1 == s2);  // true (same pool reference)
System.out.println(s1 == s3);  // false (different objects)
System.out.println(s1.equals(s3)); // true (same content)
```

| Operator    | Compares      |
| ----------- | ------------- |
| `==`        | Reference     |
| `.equals()` | Value/content |

---

## 🔐 Immutability of Strings

Once a `String` object is created, **its content cannot be changed**. Every modification results in a **new object**.

```java
String s = "abc";
s.concat("xyz"); // creates a new string, does NOT change s
System.out.println(s); // abc
```

---

## 🔄 Mutable Alternatives

| Class           | Thread-Safe | Speed  | Use Case                         |
| --------------- | ----------- | ------ | -------------------------------- |
| `String`        | Yes         | Slow   | Constant strings, keys, etc.     |
| `StringBuffer`  | Yes         | Medium | Thread-safe, slower              |
| `StringBuilder` | No          | Fast   | High-performance string building |

---

## ⚙️ Common String Methods

```java
String str = "Java Programming";
```

| Method                                     | Output                          |
| ------------------------------------------ | ------------------------------- |
| `str.length()`                             | `16`                            |
| `str.charAt(5)`                            | `'P'`                           |
| `str.substring(5)`                         | `"Programming"`                 |
| `str.indexOf("a")`                         | `1`                             |
| `str.toUpperCase()`                        | `"JAVA PROGRAMMING"`            |
| `str.replace("Java", "C")`                 | `"C Programming"`               |
| `str.trim()`                               | Removes leading/trailing spaces |
| `str.split(" ")`                           | Splits into words               |
| `str.equals("java")`                       | `false` (case-sensitive)        |
| `str.equalsIgnoreCase("java programming")` | `true`                          |

---

## 📦 StringBuilder vs StringBuffer

```java
StringBuilder sb = new StringBuilder("Hi");
sb.append(" there");
System.out.println(sb); // "Hi there"
```

| Operation   | Supported in StringBuilder & StringBuffer |
| ----------- | ----------------------------------------- |
| `append()`  | Adds content to end                       |
| `insert()`  | Inserts at specific index                 |
| `delete()`  | Removes characters                        |
| `replace()` | Replaces characters                       |
| `reverse()` | Reverses string                           |

---

## 🧠 Time & Space Complexity

| Operation       | Time Complexity |
| --------------- | --------------- |
| Access (charAt) | O(1)            |
| Concatenation   | O(n)            |
| Search          | O(n)            |
| Equals/Compare  | O(n)            |

Use `StringBuilder` if doing multiple appends.

---

## 🔍 String Interning

You can manually move a heap string into the SCP.

```java
String x = new String("apple");
String y = x.intern();  // now y is from pool
```

---

## 📌 Best Practices

* ✅ Use `.equals()` not `==` for string comparison
* ✅ Use `StringBuilder` for loops or repeated concatenation
* ✅ Avoid `new String()` unless necessary
* ✅ Use `.intern()` when string deduplication is needed
* ✅ Don’t forget `.trim()` when processing input

---

## 🧪 Common Interview Questions

* Reverse a string
* Check for palindrome
* Anagram detection
* Remove duplicates
* Longest substring without repeating characters
* Implement strstr / `indexOf()`

---

## 🧵 Thread Safety

* `String`: Safe (immutable)
* `StringBuffer`: Safe (synchronized)
* `StringBuilder`: Not safe (use with caution in threads)

---

## 🔗 Related Topics

* Character Arrays
* Regex
* ASCII & Unicode
* Hashing with Strings
* Two Pointer & Sliding Window Techniques

```
