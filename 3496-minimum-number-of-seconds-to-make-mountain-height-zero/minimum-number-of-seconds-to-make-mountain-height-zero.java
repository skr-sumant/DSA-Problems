class Solution {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        PriorityQueue<long[]> pq = new PriorityQueue<>(
            (a, b) -> Long.compare(a[0], b[0])
        );

        for (int w : workerTimes) {
            pq.offer(new long[]{w, w, 1}); 
            
        }

        long time = 0;

        for (int i = 0; i < mountainHeight; i++) {
            long[] cur = pq.poll();

            time = cur[0];
            long base = cur[1];
            long k = cur[2] + 1;

            pq.offer(new long[]{cur[0] + base * k, base, k});
        }

        return time;
    }
} 
