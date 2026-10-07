## Level 1 — Arrays

### 1. Array Basics

**Definition:**
An array stores multiple values of the same type in a fixed-size, ordered collection.

**Declaration:**

```java
int[] numbers;
```

**Initialization:**

```java
numbers = new int[5];
```

**Declaration + Initialization:**

```java
int[] numbers = {10, 20, 30, 40, 50};
```

**Key points:**

* Index starts from `0`.
* First element → index `0`.
* Last index → `length - 1`.
* Array size is fixed.

---

### 2. Traversal

**Definition:**
Traversal means **visiting each element of an array one by one**.

Example:

```text
[10, 20, 30, 40]

10 → visit
20 → visit
30 → visit
40 → visit
```

**Using `for` loop:**

```java
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

**Using enhanced `for` loop:**

```java
for (int number : numbers) {
    System.out.println(number);
}
```

**Key point:**
Use traversal when you need to process **every element**.

---

### 3. 1D Array

**Definition:**
A 1D array stores elements in a **single row/sequence**.

```java
int[] numbers = {10, 20, 30, 40};
```

```text
Index:  0   1   2   3
Value: 10  20  30  40
```

---

### 4. 2D Array

**Definition:**
A 2D array stores elements in **rows and columns**, like a table.

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6}
};
```

```text
1  2  3
4  5  6
```

Accessing an element requires **row index + column index**.

```java
matrix[1][2]
```

Result:

```text
6
```

---

### 5. Arrays Utility Methods

**Definition:**
`Arrays` is a Java utility class that provides ready-made methods for working with arrays.

Common methods:

| Method       | Purpose                            |
| ------------ | ---------------------------------- |
| `sort()`     | Sorts elements                     |
| `toString()` | Converts array to readable text    |
| `equals()`   | Compares two arrays                |
| `copyOf()`   | Creates a copy with specified size |
| `fill()`     | Fills array with a value           |

Example:

```java
Arrays.sort(numbers);
```

Before:

```text
[40, 10, 30, 20]
```

After:

```text
[10, 20, 30, 40]
```

**Important:**
These methods belong to the `Arrays` utility class.