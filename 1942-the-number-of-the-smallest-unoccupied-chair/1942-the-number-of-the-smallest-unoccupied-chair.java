class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
        int n = times.length;
        int[][] ev = new int[2 * n][3];
        for (int i = 0; i < n; i++) {
            ev[2 * i] = new int[] {times[i][0], 1, i};
            ev[2 * i + 1] = new int[] {times[i][1], 0, i};
        }
        Arrays.sort(ev, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        PriorityQueue<Integer> av = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            av.offer(i);
        }
        int[] h = new int[n];
        for (int[] him : ev) {
            if (him[1] == 1) {
                int chair = av.poll();
                h[him[2]] = chair;
                if (him[2] == targetFriend) {
                    return chair;
                }
            } else {
                av.offer(h[him[2]]);
            }
        }
        return -1;
    }
}
