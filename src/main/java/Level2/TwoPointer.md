## Two Pointers — Concepts

1\. Two Pointers

Use two variables to track positions in an array or string. They help solve problems without repeatedly checking every element.

2\. Pointer Initialization

- `left = 0` — starts at the first index.
- `right = arr.length - 1` — starts at the last index.

```
int[] arr = {10, 20, 30, 40, 50};
int left = 0;
int right = arr.length - 1;
```

3\. Moving the Pointers

- `left++` moves the left pointer one step right.
- `right--` moves the right pointer one step left.
- `while (left < right)` continues until the pointers meet or cross.

4\. Swapping Elements

Use a temporary variable to exchange the elements at the two pointer positions.

```
int temp = arr[left];
arr[left] = arr[right];
arr[right] = temp;
```

5\. Example: Reverse an Array

Array: `{10, 20, 30, 40, 50}`

Pseudocode:

1. Set `left = 0` and `right = arr.length - 1`.
2. While `left < right`, swap `arr[left]` and `arr[right]`.
3. Increment `left` and decrement `right`.
4. Stop when the pointers meet or cross.

Result: `{50, 40, 30, 20, 10}`

Remember: Two Pointers commonly help with reversing arrays, checking palindromes, and finding pairs of elements.
