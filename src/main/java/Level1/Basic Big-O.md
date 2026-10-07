## Level 1 — Basic Big-O

### 1. Time Complexity

**Definition:**
Time complexity describes **how the running time of an algorithm grows as input size increases**.

Example:

```text
10 elements  → takes 10 steps
100 elements → takes 100 steps
```

This is **O(n)**.

---

### 2. Space Complexity

**Definition:**
Space complexity describes **how much extra memory an algorithm needs as input size increases**.

Example:

```text
Input: [10, 20, 30]

If we create another array of 3 elements:
Extra space grows with input.
```

This is **O(n)** space.

---

### 3. O(1) — Constant

**Definition:**
The operation takes approximately the **same amount of time regardless of input size**.

```text
Array → [10, 20, 30, 40, 50]

Access element at index 2 → 30
```

One direct operation → **O(1)**.

---

### 4. O(n) — Linear

**Definition:**
Time increases **directly with the number of elements**.

Example:

```text
10 elements → ~10 checks
100 elements → ~100 checks
```

Example: **Linear Search**

**O(n)**

---

### 5. O(log n) — Logarithmic

**Definition:**
The problem size is **reduced significantly in each step**, commonly by half.

Example: **Binary Search**

```text
100 elements
↓
50
↓
25
↓
12
↓
6
↓
3
```

**O(log n)**

---

### 6. O(n²) — Quadratic

**Definition:**
For every element, we may process **all elements again**.

Example:

```text
5 elements

Each element → compare with 5 elements
```

Common example: **nested loops**

**O(n²)**

---

### 7. Best / Average / Worst Case

**Best Case:** Minimum work required.

**Average Case:** Typical/expected amount of work.

**Worst Case:** Maximum work required.

Example: Linear Search

```text
[10, 20, 30, 40, 50]
```

Search for `10` → **Best Case: O(1)**

Search for `30` → **Average Case: O(n)**

Search for `50` or missing value → **Worst Case: O(n)**

### Remember

```text
O(1)    → Constant
O(log n) → Divide/reduce
O(n)    → One-by-one
O(n²)   → Nested/repeated
```
