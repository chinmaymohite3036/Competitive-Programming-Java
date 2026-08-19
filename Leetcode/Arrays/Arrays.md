## Move Zeroes

### Pattern
Two Pointers / In-Place Array Modification

### When to Think of This Pattern
- Need to move specific elements while preserving the order of other elements.
- Need to modify an array in-place.
- Shifting elements individually seems inefficient.
- One pointer can scan the array while another tracks the next valid position.

### Key Observation
Instead of thinking:

"Move all zeroes to the end."

Think:

"Move all non-zero elements to the front."

The zeroes will automatically end up at the end.

### Pointer Roles
- `i` → scans every element in the array.
- `j` → points to the next position where a non-zero element should be placed.

### Logic
For every element:

1. If `nums[i] == 0`, do nothing.
2. If `nums[i] != 0`:
   - If `i != j`, swap `nums[i]` and `nums[j]`.
   - Increment `j`.

This preserves the relative order of non-zero elements.

### Key Condition

```java
if (nums[i] != 0)
