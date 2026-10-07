## Level 1 — Arrays: Next Subtopic

### 2. Searching

**Definition:**
Searching means **finding a specific element or value inside an array**.

Example:

```text
[10, 25, 40, 15, 30]
```

Search for `40`:

```text
10 → not found
25 → not found
40 → found
```

### Linear Search

**Definition:**
Linear search checks elements **one by one from the beginning until the target is found**.

```text
Array:  [10, 25, 40, 15, 30]
Index:   0   1   2   3   4

Target = 40

Check 10 → no
Check 25 → no
Check 40 → yes
```

**Pseudocode:**

```text
Start from index 0
Check current element with target
If equal → found
Otherwise → move to next index
Repeat until array ends
```

**Time Complexity:** `O(n)`

---

### Binary Search

**Definition:**
Binary search finds an element by **repeatedly dividing a sorted array into halves**.

**Important:** The array must be **sorted**.

```text
[10, 20, 30, 40, 50, 60, 70]
```

Target = `60`

```text
Check middle → 40
60 is greater → search right half

[50, 60, 70]

Check middle → 60
Found
```

**Pseudocode:**

```text
Find middle element
If middle = target → found
If target is smaller → search left half
If target is greater → search right half
Repeat
```

**Time Complexity:** `O(log n)`

### Remember

| Search        | Requirement          | Time       |
| ------------- | -------------------- | ---------- |
| Linear Search | No sorting required  | `O(n)`     |
| Binary Search | Array must be sorted | `O(log n)` |
