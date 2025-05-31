/**
 * Binary Search Algorithm
 * 
 * Description:
 * Binary Search is an efficient algorithm for finding an item from a sorted list of items.
 * It works by repeatedly dividing the search interval in half.
 * 
 * Time Complexity:
 * - Best case: O(1)
 * - Average and Worst case: O(log n)
 * 
 ## Algorithm Steps

 1. **Initialize** two pointers: `low` at the start and `high` at the end of the array.
 2. **Calculate** the middle index: `mid = low + (high - low) / 2`.
 3. **Compare** the target value with the middle element:
   - If equal, return the index.
   - If the target is less, adjust `high = mid - 1`.
   - If the target is more, adjust `low = mid + 1`.
 4. **Repeat** steps 2-3 until the target is found or the subarray size becomes zero.
 * Reference: https://www.geeksforgeeks.org/binary-search/
 */

