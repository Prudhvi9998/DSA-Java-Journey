
## 📄 `CyclicSort_Notes.md`

````markdown
# 📘 Cyclic Sort (Index Sort)

## 🔹 What is Cyclic Sort?

Cyclic Sort is a linear time, in-place sorting algorithm best suited for problems where:
- The input array contains `n` distinct numbers from `1 to n` (or `0 to n-1`).
- You want to sort the array **without using extra space**.

---

## 🔹 How It Works

Cyclic sort places each element at its correct index using **swapping**.

### Logic:
If `arr[i]` is not at its correct index, swap it with the element at its target index.

---
## 🔹 Example

### Input:

```
[3, 5, 2, 1, 4]
```

### Sorted (Expected):

```
[1, 2, 3, 4, 5]
```

---

## 🔹 Time and Space Complexity

| Case      | Time Complexity | Space Complexity |
| --------- | --------------- | ---------------- |
| All cases | O(n)            | O(1)             |

Why O(n)?
Because each element is placed at its correct index with at most one swap.

---

## 🔹 Stability

❌ **Unstable**
Cyclic Sort swaps elements regardless of their order.

---

## 🔹 When to Use

* When array contains `n` numbers from `1 to n` or `0 to n-1`
* In problems like:

  * Find all missing numbers
  * Find the duplicate number
  * First missing positive

---

## 🔹 Related Problems

* Leetcode 268: Missing Number
* Leetcode 442: Find All Duplicates
* Leetcode 448: Find All Missing Numbers

````

---

