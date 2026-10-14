# HashSet — Java Notes

## 1. What is a HashSet?
A `HashSet` stores **unique values only**. Duplicate values are not stored.

```java
Set<Integer> set = new HashSet<>();
```

Imports:
```java
import java.util.Set;
import java.util.HashSet;
```

## 2. Add values — `add()`
Adds a value if it is not already present.

```java
set.add(10);
set.add(20);
set.add(10);
```

Set contents: `[10, 20]` (order is not guaranteed).

## 3. Check a value — `contains()`
Returns `true` if the value exists; otherwise, `false`.

```java
set.contains(10); // true
set.contains(30); // false
```

## 4. Remove a value — `remove()`
Removes the value if it exists.

```java
set.remove(10);
```

## 5. Size and empty check
```java
set.size();     // number of unique values
set.isEmpty();  // true if the set has no values
```

## 6. Traverse a HashSet
```java
for (int value : set) {
    System.out.println(value);
}
```

A `HashSet` does **not guarantee insertion order**.

## 7. Remove duplicates from an array
Add each array element to a set. Repeated values are automatically ignored.

```java
int[] arr = {1, 2, 2, 3, 1};
Set<Integer> set = new HashSet<>();

for (int value : arr) {
    set.add(value);
}
```

Unique values: `1, 2, 3` (display order may differ).

## 8. Find the intersection of two arrays
Intersection means the **distinct values present in both arrays**.

Example:
- `arr1 = [1, 2, 2, 3]`
- `arr2 = [2, 2, 4]`
- Result: `[2]`

Basic approach:
1. Add all values from the first array to a set.
2. Traverse the second array.
3. If the set contains a value, add it to a result set.
4. Return the result set.

## HashSet vs HashMap
- `HashSet`: stores unique values, e.g. `{1, 2, 3}`.
- `HashMap`: stores key-value pairs, e.g. `number → frequency`.

## Remember
- `add(value)` — add a unique value.
- `contains(value)` — check whether a value exists.
- `remove(value)` — remove a value.
- `size()` — number of unique values.
- `HashSet` does not guarantee order.
