## **Level 1 — Searching**

All four subtopics from your Excel roadmap, covered in the listed order.

### **1. Linear Search**

**Definition:** Checks each element one by one until the target is found or the array ends.

Example:

Array: `{10, 20, 30, 40}`

Target: `30`

- Check `10` → Not found.
- Check `20` → Not found.
- Check `30` → Found at index `2`.
- Works with sorted and unsorted arrays.
- Time complexity: \\(O(n)\\) worst case.

### **2. Binary Search**

**Definition:** Searches by repeatedly dividing a sorted array into two halves.

Example:

Array: `{10, 20, 30, 40, 50}`

Target: `40`

1. Middle element is `30`.
2. `40` is greater than `30`, so search the right half.
3. Middle of the remaining part is `40`.
4. Target found at index `3`.

- Requires a sorted array.
- Time complexity: \\(O(\log n)\\).

### **3. Sorted vs Unsorted**

**Sorted array:** Elements are arranged in order, either ascending or descending.

Example: `{10, 20, 30, 40, 50}`

**Unsorted array:** Elements are not arranged in a particular order.

Example: `{30, 10, 50, 20, 40}`

| Linear Search            | Binary Search                             |
| ------------------------ | ----------------------------------------- |
| Works on sorted arrays   | Requires sorted arrays                    |
| Works on unsorted arrays | Does not directly work on unsorted arrays |
| Checks one by one        | Divides into halves                       |
| \\(O(n)\\) worst case    | \\(O(\log n)\\)                           |

### **4. Index vs Value**

**Index:** The position of an element in an array. Index starts from `0`.

**Value:** The actual data stored at that position.

Example:

```
int[] arr = {10, 20, 30, 40};
```

| Index | Value |
| ----- | ----- |
| 0     | 10    |
| 1     | 20    |
| 2     | 30    |
| 3     | 40    |

- Index of `30` is `2`.
- Value at index `2` is `30`.

**Important:** Index and value are different. Searching usually compares values, but returns the index when an element is found.
