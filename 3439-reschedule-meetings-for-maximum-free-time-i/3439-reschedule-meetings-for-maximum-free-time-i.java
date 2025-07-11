class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        List<Integer> him = new ArrayList<>();
        him.add(startTime[0]);  // Time before first event

        // Time between events
        for (int i = 1; i < startTime.length; i++) {
            him.add(startTime[i] - endTime[i - 1]);
        }

        // Time after last event to end
        him.add(eventTime - endTime[endTime.length - 1]);

        int ans = 0, temp = 0;
        int window = k + 1;
        int sum = 0;

        // First window sum
        for (int i = 0; i < Math.min(window, him.size()); i++) {
            sum += him.get(i);
        }
        ans = sum;

        // Sliding window
        for (int i = window; i < him.size(); i++) {
            sum += him.get(i) - him.get(i - window);
            ans = Math.max(ans, sum);
        }

        return ans;
    }
}
