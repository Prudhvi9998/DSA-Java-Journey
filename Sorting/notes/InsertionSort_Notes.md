

## 📘 `InsertionSort_Notes.md`

```markdown
# 📚 Insertion Sort (Also Known as Incremental Sort)

## 🔹 What is Insertion Sort?

Insertion Sort is a simple and intuitive comparison-based sorting algorithm. It builds the final sorted array one element at a time by comparing and inserting elements into their correct position.

---

## 🔹 How It Works

For each element from index 1 to n-1:
1. Compare the current element to its left.
2. Shift larger elements to the right.
3. Insert the current element into its correct position.

---

## 🔹 Example (with Dry Run)

### Input:
```

\[5, 3, 1, 4, 2]

```

### Step-by-Step:

#### 🔁 Pass 1 (i = 1)
- Key = 3  
- Compare with 5 → shift 5 to right  
➡️ `[5, 5, 1, 4, 2]`  
- Insert 3  
➡️ `[3, 5, 1, 4, 2]`

#### 🔁 Pass 2 (i = 2)
- Key = 1  
- Compare with 5 → shift 5  
- Compare with 3 → shift 3  
➡️ `[3, 5, 5, 4, 2] → [1, 3, 5, 4, 2]`

#### 🔁 Pass 3 (i = 3)
- Key = 4  
- Compare with 5 → shift 5  
- Compare with 3 → stop  
➡️ `[1, 3, 4, 5, 2]`

#### 🔁 Pass 4 (i = 4)
- Key = 2  
- Compare with 5 → shift  
- Compare with 4 → shift  
- Compare with 3 → shift  
- Compare with 1 → stop  
➡️ `[1, 2, 3, 4, 5]`

### ✅ Final Output:
```

\[1, 2, 3, 4, 5]

````

---


## 🔹 Time Complexity

| Case         | Time Complexity       |
| ------------ | --------------------- |
| Best Case    | O(n) (already sorted) |
| Average Case | O(n²)                 |
| Worst Case   | O(n²) (reversed)      |
| Space        | O(1) (in-place)       |

---

## 🔹 Stability

**Stable**
Insertion Sort maintains the relative order of equal elements.

---

## 🔹 Advantages

* Efficient for small datasets
* Simple and easy to implement
* Stable and in-place

---

## 🔹 Disadvantages

* Not efficient for large datasets
* O(n²) in average and worst cases

---

## 🔹 When to Use

* Small arrays
* Partially sorted data
* When stability is required

---

## 🔹 Related Topics

* Bubble Sort
* Selection Sort
* Merge Sort (more efficient for larger data)

'''
