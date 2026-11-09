class Solution {
    public List<Integer> busiestServers(int k, int[] arrival, int[] load) {
        int[] counts = new int[k];
        
        TreeSet<Integer> available = new TreeSet<>();
        for (int i = 0; i < k; i++) {
            available.add(i);
        }
        
        
        PriorityQueue<int[]> busy = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[0], b[0])
        );
        
        int maxRequests = 0;
        
        for (int i = 0; i < arrival.length; i++) {
            int arrivalTime = arrival[i];
            int endTime = arrivalTime + load[i];
            
            while (!busy.isEmpty() && busy.peek()[0] <= arrivalTime) {
                int[] freedServer = busy.poll();
                available.add(freedServer[1]);
            }
            
            if (available.isEmpty()) {
                continue;
            }
            
            Integer assignedServer = available.ceiling(i % k);
            if (assignedServer == null) {
                assignedServer = available.first(); 
            }
            
            available.remove(assignedServer);
            busy.offer(new int[]{endTime, assignedServer});
            
            counts[assignedServer]++;
            maxRequests = Math.max(maxRequests, counts[assignedServer]);
        }
        
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            if (counts[i] == maxRequests) {
                result.add(i);
            }
        }
        
        return result;
    }
}