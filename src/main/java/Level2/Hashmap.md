# **Level 2 — HashMap**

## **HashMap — Definition and Hierarchy**

### **Definition**

**HashMap** is a Java collection that stores data in **key-value pairs**.

- Each key must be unique.
- Values can be duplicated.
- Allows one `null` key and multiple `null` values.
- Does not guarantee insertion order.
- Provides fast insertion, deletion, and retrieval on average.

### **Parent Class and Interface**

`HashMap` belongs to the Java Collections Framework.

- **Parent class:** `AbstractMap<K,V>`
- **Implemented interface:** `Map<K,V>`
- Also implements `Cloneable` and `Serializable`.

**Map**

Interface

Implemented by

**AbstractMap**

Abstract class

Extended by

**HashMap**

Concrete class

### **Syntax**

```
HashMap<Integer, String> map = new HashMap<>();
```

**Remember:**

- `Map` is an interface.
- `AbstractMap` is an abstract class.
- `HashMap` is a concrete class.

Java declaration:

```
public class HashMap<K,V>
    extends AbstractMap<K,V>
    implements Map<K,V>, Cloneable, Serializable
```

### **1.&#x20;**`put()`**&#x20;/&#x20;**`get()`

A `HashMap` stores data as **key-value pairs**.

- `put(key, value)` — adds or updates a key-value pair.
- `get(key)` — retrieves the value associated with a key.

Example:

```
Map<Integer, String> map = new HashMap<>();

map.put(1, "Java");
map.put(2, "Python");

System.out.println(map.get(1)); // Java
```

### **2.&#x20;**`containsKey()`

Checks whether a particular key exists in the HashMap.

Example:

```
Map<Integer, String> map = new HashMap<>();

map.put(1, "Java");

System.out.println(map.containsKey(1)); // true
System.out.println(map.containsKey(3)); // false
```

### **3.&#x20;**`getOrDefault()`

Returns the value associated with a key. If the key does not exist, it returns the default value provided.

Example:

```
Map<Integer, Integer> map = new HashMap<>();

map.put(10, 2);

System.out.println(map.getOrDefault(10, 0)); // 2
System.out.println(map.getOrDefault(20, 0)); // 0
```

**Important:** Commonly used in frequency counting.

### **4.&#x20;**`entrySet()`

Used to access all key-value pairs in a HashMap.

Example:

```
Map<Integer, String> map = new HashMap<>();

map.put(1, "Java");
map.put(2, "Python");

for (Map.Entry<Integer, String> entry : map.entrySet()) {
    System.out.println(entry.getKey());
    System.out.println(entry.getValue());
}
```

- `getKey()` returns the key.
- `getValue()` returns the value.

### **5. Frequency**

Frequency means **how many times an element appears**.

Example:

Array: `{1, 2, 2, 3, 1, 2}`

| Element | Frequency |
| ------- | --------- |
| 1       | 2         |
| 2       | 3         |
| 3       | 1         |

Using HashMap:

```
Map<Integer, Integer> map = new HashMap<>();

for (int num : arr) {
    map.put(num, map.getOrDefault(num, 0) + 1);
}
```

`getOrDefault(num, 0) + 1` gets the current count (or zero if absent) and increases it by one.

### **6. Duplicates**

A duplicate is an element that appears more than once.

Example:

Array: `{1, 2, 2, 3, 1, 4}`

Duplicates: `1, 2`

Using HashMap:

```
for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    if (entry.getValue() > 1) {
        System.out.println(entry.getKey());
    }
}
```

A frequency greater than `1` means the element is duplicated.

### **7. Value → Index**

Stores an array element as the key and its index as the value.

Example:

Array: `{10, 20, 30, 40}`

| Key (Value) | Value (Index) |
| ----------- | ------------- |
| 10          | 0             |
| 20          | 1             |
| 30          | 2             |
| 40          | 3             |

Using HashMap:

```
Map<Integer, Integer> map = new HashMap<>();

for (int i = 0; i < arr.length; i++) {
    map.put(arr[i], i);
}
```

