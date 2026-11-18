## **Level 1 — Basic Big-O**

Your Excel lists these six subtopics:

1. Time complexity
2. Space complexity
3. O(1)
4. O(n)
5. O(log n)
6. O(n²)
7. Best, average, and worst case

### **1. Time Complexity**

**Definition:** Measures how the execution time of an algorithm grows as the input size increases.

Example: Checking every element in an array takes more time as the array gets larger.

### **2. Space Complexity**

**Definition:** Measures how much extra memory an algorithm needs as the input size increases.

Example: Creating another array of size `n` requires O(n) extra space.

### **3. O(1) — Constant Time**

**Definition:** Execution time remains constant regardless of input size.

Example:

```
System.out.println(arr[0]);
```

Only one element is accessed.

### **4. O(n) — Linear Time**

**Definition:** Execution time grows proportionally with the input size.

Example:

```
for (int i = 0; i < n; i++) {
    System.out.println(i);
}
```

If `n` doubles, the number of iterations doubles.

### **5. O(log n) — Logarithmic Time**

**Definition:** The input size is reduced by half in each step.

Example: Binary Search.

For an array of 16 elements:

- 16 → 8
- 8 → 4
- 4 → 2
- 2 → 1

### **6. O(n²) — Quadratic Time**

**Definition:** Execution time grows proportionally to the square of the input size.

Example:

```
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        System.out.println(i + " " + j);
    }
}
```

For `n = 5`, the inner statement executes 25 times.

### **7. Best, Average, and Worst Case**

These describe how much time an algorithm takes under different input conditions.

| Case         | Meaning                         |
| ------------ | ------------------------------- |
| Best case    | Minimum time required           |
| Average case | Expected time for typical input |
| Worst case   | Maximum time required           |

**Example: Linear Search**

Array: `{10, 20, 30, 40, 50}`

- Best case: Target is `10` — one comparison.
- Average case: Target is somewhere in the middle.
- Worst case: Target is `50` or absent — five comparisons.
