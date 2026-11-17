# **LEVEL 1 — Arrays**

Concepts phase

The Excel lists four subtopics under Arrays. All four are covered below.

## **1. Array Basics**

An **array** is a collection of elements of the same data type stored in a single variable.

Example:

```
int[] arr = {10, 20, 30, 40, 50};
```

- `int[]` – declares an integer array.
- `arr` – array name.
- `{10, 20, 30, 40, 50}` – array elements.
- Index starts from `0`.

Accessing elements:

```
System.out.println(arr[0]); // 10
System.out.println(arr[2]); // 30
```

Getting array length:

```
System.out.println(arr.length); // 5
```

## **2. Array Traversal**

**Traversal** means visiting each element of an array one by one.

Using a `for` loop:

```
int[] arr = {10, 20, 30};

for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

Using an enhanced `for` loop:

```
for (int num : arr) {
    System.out.println(num);
}
```

## **3. 1D and 2D Arrays**

**1D Array**

Stores elements in a single row.

```
int[] arr = {10, 20, 30, 40};
```

Access:

```
System.out.println(arr[1]); // 20
```

**2D Array**

Stores elements in rows and columns (table format).

```
int[][] arr = {
    {10, 20, 30},
    {40, 50, 60}
};
```

Accessing elements:

```
System.out.println(arr[0][1]); // 20
System.out.println(arr[1][2]); // 60
```

Traversing a 2D array:

```
for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr[i].length; j++) {
        System.out.println(arr[i][j]);
    }
}
```

- `arr.length` – number of rows.
- `arr[i].length` – number of columns in row `i`.

## **4. Arrays Utility Methods**

Java provides the `Arrays` class to perform common array operations.

Import:

```
import java.util.Arrays;
```

| Method                          | Purpose                                        |
| ------------------------------- | ---------------------------------------------- |
| `Arrays.sort(arr)`              | Sorts elements in ascending order              |
| `Arrays.toString(arr)`          | Converts array contents into a readable string |
| `Arrays.equals(a, b)`           | Checks whether two arrays have equal elements  |
| `Arrays.binarySearch(arr, key)` | Searches for an element in a sorted array      |
| `Arrays.fill(arr, value)`       | Fills all elements with a given value          |
| `Arrays.copyOf(arr, length)`    | Creates a copy of an array                     |

Example:

```
int[] arr = {30, 10, 20};

Arrays.sort(arr);

System.out.println(Arrays.toString(arr));
```

Output:

```
[10, 20, 30]
```