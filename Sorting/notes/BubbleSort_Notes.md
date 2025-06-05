
# 🧮 Bubble Sort (Exchange / Sinking Sort)

## 🔍 Overview
Bubble Sort is a simple comparison-based sorting algorithm. It works by repeatedly swapping adjacent elements if they are in the wrong order.

## ⚙️ How It Works
- Compare adjacent elements.
- Swap them if they are in the wrong order.
- Continue this process until the array is sorted.

## 📌 Example

Initial array: [5, 1, 4, 2, 8]

### Pass 1:
- Compare 5 and 1 → Swap → [1, 5, 4, 2, 8]  
- Compare 5 and 4 → Swap → [1, 4, 5, 2, 8]  
- Compare 5 and 2 → Swap → [1, 4, 2, 5, 8]  
- Compare 5 and 8 → No Swap → [1, 4, 2, 5, 8]  

Repeat until no swaps occur.

## 📊 Time Complexity

| Case        | Time Complexity |
|-------------|-----------------|
| Best Case   | O(n)            |
| Average Case| O(n²)           |
| Worst Case  | O(n²)           |

**Why?**
- Best case occurs when the array is already sorted, and only 1 pass is made (with no swaps).
- Worst and average cases require nested iterations.

## ✅ Space Complexity
- O(1) — In-place algorithm.

## 📍 Stability
- ✅ **Stable**: It does not change the relative order of equal elements.

## ✅ When to Use
- When the input size is small.
- When code simplicity is more important than performance.
- Educational purposes or interview basics.

## 🚫 Not Ideal When
- Performance is critical.
- Input size is large.

