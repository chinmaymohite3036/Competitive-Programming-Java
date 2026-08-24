## LeetCode 349 — Intersection of Two Arrays

### Pattern
HashSet / Set Intersection

### Problem
Return the elements that appear in **both arrays**.

Important:
- Each element should appear only **once** in the answer.
- Order does not matter.
- Frequency does not matter.

Example:

nums1 = [1, 2, 2, 1]
nums2 = [2, 2]

Answer = [2]

---

### Approach

Use two HashSets:

- `set1` → stores unique elements from one array.
- `set2` → stores unique elements that are found in both arrays.

### Steps

1. Create `set1` and `set2`.
2. Add all elements of `nums2` to `set1`.
3. Traverse `nums1`.
4. If `set1` contains the current element:
   - Add it to `set2`.
5. Convert `set2` into an `int[]`.

### Why HashSet?

We only care whether an element **exists**, not how many times it occurs.

```java
set1.contains(num)
