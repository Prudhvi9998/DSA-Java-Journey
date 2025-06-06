

---

## 📘 `SelectionSort_Notes.md`

```markdown
# 📚 Selection Sort (Also Known as In-Place Comparison Sort)

## 🔹 What is Selection Sort?

Selection Sort is a **simple comparison-based sorting algorithm**. It works by repeatedly finding the **minimum (or maximum)** element from the unsorted part and moving it to the sorted part.

---

## 🔹 How It Works

For an array of size `n`:
1. Start with the first element.
2. Find the smallest element in the rest of the array.
3. Swap it with the current element.
4. Move to the next position and repeat until the array is sorted.

---

## 🔹 Example (with Dry Run)

### Input:
```

\[4, 5, 3, 1, 2]

```

### Step-by-Step:

#### 🔁 Pass 1 (i = 0)
- Unsorted: `[4, 5, 3, 1, 2]`
- Min: `1` at index 3
- Swap `4` and `1`  
➡️ `[1, 5, 3, 4, 2]`

#### 🔁 Pass 2 (i = 1)
- Unsorted: `[5, 3, 4, 2]`
- Min: `2` at index 4
- Swap `5` and `2`  
➡️ `[1, 2, 3, 4, 5]`

#### 🔁 Pass 3 (i = 2)
- Unsorted: `[3, 4, 5]`
- Already sorted, no swap  
➡️ `[1, 2, 3, 4, 5]`

#### 🔁 Pass 4 (i = 3)
- Unsorted: `[4, 5]`
- Already sorted, no swap  
➡️ `[1, 2, 3, 4, 5]`

### ✅ Final Output:
```

\[1, 2, 3, 4, 5]

````

---

## 🔹 Java Code

```java
public class SelectionSort {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            // Swap
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] data = {4, 5, 3, 1, 2};
        selectionSort(data);
        for (int value : data) {
            System.out.print(value + " ");
        }
    }
}
````

---

## 🔹 Time Complexity

| Case         | Time Complexity |
| ------------ | --------------- |
| Best Case    | O(n²)           |
| Average Case | O(n²)           |
| Worst Case   | O(n²)           |
| Space        | O(1) (in-place) |

Selection Sort always takes `n(n-1)/2` comparisons regardless of the initial order.

---

## 🔹 Stability

**Unstable**
Selection Sort is **not stable** by default (it might swap non-equal elements and disrupt original order).

---

## 🔹 Advantages

* Very simple to implement
* No extra memory required (in-place)

---

## 🔹 Disadvantages

* Inefficient on large lists
* Not stable
* Always O(n²), regardless of input

---

## 🔹 When to Use

* When memory writes are more expensive than reads (it makes fewer swaps)
* For small datasets or educational purposes

---

## 🔹 Related Topics

* Bubble Sort
* Insertion Sort
* Sorting Algorithm Comparison

```

---


