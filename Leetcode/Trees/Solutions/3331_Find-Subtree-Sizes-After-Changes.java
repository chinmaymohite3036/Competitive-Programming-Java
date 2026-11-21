class Solution {
    public int[] findSubtreeSizes(int[] parent, String s) {
        int n = parent.length;
        char[] chars = s.toCharArray();

        int[] head = new int[n];
        int[] to = new int[n];
        int[] next = new int[n];
        Arrays.fill(head, -1);

        for (int i = 1; i < n; i++) {
            to[i] = i;
            next[i] = head[parent[i]];
            head[parent[i]] = i;
        }

        int[] newParent = Arrays.copyOf(parent, n);
        int[] lastSeen = new int[26];
        Arrays.fill(lastSeen, -1);

        dfsFindParents(0, chars, head, to, next, lastSeen, newParent);

        Arrays.fill(head, -1);
        for (int i = 1; i < n; i++) {
            to[i] = i;
            next[i] = head[newParent[i]];
            head[newParent[i]] = i;
        }

        int[] answer = new int[n];
        dfsSubtreeSize(0, head, to, next, answer);

        return answer;
    }

    private void dfsFindParents(int u, char[] chars, int[] head, int[] to, int[] next,
                                int[] lastSeen, int[] newParent) {
        int c = chars[u] - 'a';
        int prevAncestor = lastSeen[c];

        if (prevAncestor != -1) {
            newParent[u] = prevAncestor;
        }

        lastSeen[c] = u;
        for (int e = head[u]; e != -1; e = next[e]) {
            dfsFindParents(to[e], chars, head, to, next, lastSeen, newParent);
        }
        lastSeen[c] = prevAncestor; 
    }

    private int dfsSubtreeSize(int u, int[] head, int[] to, int[] next, int[] answer) {
        int size = 1;
        for (int e = head[u]; e != -1; e = next[e]) {
            size += dfsSubtreeSize(to[e], head, to, next, answer);
        }
        answer[u] = size;
        return size;
    }
}