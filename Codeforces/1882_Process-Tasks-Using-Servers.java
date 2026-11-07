class Solution {
    public int[] assignTasks(int[] servers, int[] tasks) {
        int n = servers.length;
        int m = tasks.length;
        int[] ans = new int[m];

    // Available servers: [weight, index]
    PriorityQueue<int[]> available = new PriorityQueue<>((a, b) -> {
        if (a[0] != b[0]) return a[0] - b[0];
        return a[1] - b[1];
    });

    // Busy servers: [finishTime, weight, index]
    PriorityQueue<long[]> busy = new PriorityQueue<>((a, b) ->
        Long.compare(a[0], b[0])
    );

    // Initially, all servers are available
    for (int i = 0; i < n; i++) {
        available.offer(new int[]{servers[i], i});
    }

    long currentTime = 0;

    for (int i = 0; i < m; i++) {

        while (!busy.isEmpty() && busy.peek()[0] <= currentTime) {
            long[] server = busy.poll();

            available.offer(new int[]{
                (int) server[1],
                (int) server[2]
            });
        }

        if (available.isEmpty()) {
            currentTime = busy.peek()[0];

            while (!busy.isEmpty() && busy.peek()[0] <= currentTime) {
                long[] server = busy.poll();

                available.offer(new int[]{
                    (int) server[1],
                    (int) server[2]
                });
            }
        }

        int[] server = available.poll();

        int weight = server[0];
        int index = server[1];

        ans[i] = index;

        long finishTime = currentTime + tasks[i];

        busy.offer(new long[]{
            finishTime, weight, index
        });

        currentTime = Math.max(currentTime, i + 1);
    }

    return ans;
    }
}