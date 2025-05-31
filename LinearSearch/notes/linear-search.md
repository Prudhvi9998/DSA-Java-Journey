# Linear Search in Java

## Concept
Linear search sequentially checks each element in an array until the target is found or the array ends. Ideal for unsorted arrays.

## Algorithm
1. Iterate through the array from index 0 to n-1.
2. If the current element equals the target, return its index.
3. If no element is found, return -1.

## Time/Space Complexity
- Time: O(n) – checks each element.
- Space: O(1) – no extra memory.

## Example
Input: arr = [4, 2, 7, 1, 9], target = 7  
Output: 2 (index of 7)

## Code
See [code/LinearSearch.java](../code/LinearSearch.java)
