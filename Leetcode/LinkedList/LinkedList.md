## LeetCode 206 — Reverse Linked List

### Pattern
Linked List / Pointer Manipulation / In-Place Reversal

### Problem
Reverse a singly linked list.

Example:

1 → 2 → 3 → 4 → 5 → null

Becomes:

5 → 4 → 3 → 2 → 1 → null

---

### Key Observation

To reverse a linked list, we need to change:

current → next

into:

current → previous

But before changing `current.next`, we must save the next node.
Otherwise, we lose access to the remaining linked list.

### Three Pointers

- `previous` → node behind `current`
- `current` → node currently being processed
- `next` → temporarily saves the next node

Initial state:

```text
previous = null
current = head
```text
previous = null
current = head
