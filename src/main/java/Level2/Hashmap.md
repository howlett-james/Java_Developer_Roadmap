### Level 2 — HashMap Concepts



Excel topics in order: `put/get` → `containsKey` → `getOrDefault` → `entrySet` → frequency → duplicates → value-to-index.



### 1\. `put()` and `get()`



* `put(key, value)`: Adds a key-value pair or updates the value if the key already exists.



* `get(key)`: Returns the value associated with a key. Returns `null` if the key is absent.



Example:



```java

HashMap<Integer, String> map = new HashMap<>();

map.put(1, "Java");

map.put(2, "SQL");

map.put(1, "Spring");



System.out.println(map.get(1)); // Spring

```



Note: Keys are unique. Adding an existing key replaces its previous value.



### 2\. `containsKey()`



* Checks whether a specified key exists in the map.



* Returns `true` or `false`.



Example:



```java

map.containsKey(1); // true

map.containsKey(3); // false

```



Use: To check whether a value has already been stored as a key.



### 3\. `getOrDefault()`



* Returns the value associated with a key if it exists.



* Otherwise, returns the default value you specify.



* Does not insert the missing key into the map.



Example:



```java

HashMap<Integer, Integer> map = new HashMap<>();

map.put(10, 2);



System.out.println(map.getOrDefault(10, 0)); // 2

System.out.println(map.getOrDefault(20, 0)); // 0

```



Use: Especially useful for frequency counting because an unseen value can start with a count of `0`.



### 4\. `entrySet()`



* Returns a set of the map's key-value entries.



* Used to iterate through all entries.



* `getKey()` retrieves the key; `getValue()` retrieves its value.



Example:



```java

for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

System.out.println(entry.getKey());

System.out.println(entry.getValue());

}

```



Imports: `java.util.HashMap` and `java.util.Map`.



Use: When you need to process every key-value pair, such as finding the most frequent element.



### 5\. Frequency counting



* Definition: Counting how many times each distinct value occurs.



* Approach: Store each number as a key and its frequency as the value.



Example input: `{4, 2, 4, 3, 2, 4}`



Result: `{4=3, 2=2, 3=1}`



Pseudocode:



```text

Create an empty HashMap



FOR each number in the array

count = map.getOrDefault(number, 0)

map.put(number, count + 1)

END FOR

```



Use: Counting repeated numbers, characters, or other values.



Complexity: Expected time and space, where is the number of elements and is the number of distinct values.



### 6\. Duplicate detection



* Definition: Identifying values that appear more than once.



* Approach: Use `containsKey()` to detect a previously seen value, or count frequencies and identify keys whose frequency is greater than `1`.



Example input: `{5, 2, 5, 8, 2}`



Distinct duplicate values: `5` and `2`.



Pseudocode using `containsKey()`:



```text

Create an empty HashMap



FOR each number in the array

IF map contains the number

It is a duplicate

ELSE

Store the number in the map

END IF

END FOR

```



Use: Finding repeated values in arrays or strings.



Important: Detecting whether any duplicate exists is different from listing all distinct duplicate values.



### 7\. Value → index mapping



* Definition: Store an array value as the key and its index as the value.



* Use: Find a value's stored index without scanning the array each time.



Example input: `{10, 25, 40}`



Mapping: `{10=0, 25=1, 40=2}`



Pseudocode:



```text

Create an empty HashMap



FOR index from 0 to array length - 1

map.put(array[index], index)

END FOR

```



Important: If a value occurs more than once, the later index overwrites the earlier one. To preserve every index, use a collection of indexes for each key.



Complexity: Expected time to build the map and average time per lookup.



### Key notes to remember



* HashMap keys are unique; values may repeat.



* `put()` stores or updates; `get()` retrieves.



* `containsKey()` checks key existence.



* `getOrDefault()` supplies a fallback without inserting a missing key.



* `entrySet()` iterates through all key-value pairs.



* Frequency counting uses `getOrDefault()` and `put()`.



* Duplicate detection can use `containsKey()` or frequency counts.



* Value-to-index mapping overwrites earlier indexes when values repeat.



* HashMap iteration order is not guaranteed.



* HashMap operations are generally on average.



These are the seven HashMap topics listed in your Excel. Next in the roadmap, we move to the pending HashMap problem, First Unique Character in a String, when you’re ready.

