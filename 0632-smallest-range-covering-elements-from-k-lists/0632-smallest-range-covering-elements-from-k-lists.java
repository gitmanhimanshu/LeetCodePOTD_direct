import java.util.List;
import java.util.PriorityQueue;

class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        int mxr = Integer.MIN_VALUE;
        int mnr = Integer.MAX_VALUE;
        int start = 0, end = 0;
        
        PriorityQueue<int[]> him = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        
        for (int i = 0; i < nums.size(); i++) {
            him.offer(new int[]{nums.get(i).get(0), i, 0});
            mxr = Math.max(mxr, nums.get(i).get(0));
        }

        while (him.size() == nums.size()) {
            int[] curr = him.poll();
            int minVal = curr[0];
            
            if (mxr - minVal < mnr - start) {
                start = minVal;
                end = mxr;
                mnr = mxr;
            }

            if (curr[2] + 1 < nums.get(curr[1]).size()) {
                int nextVal = nums.get(curr[1]).get(curr[2] + 1);
                him.offer(new int[]{nextVal, curr[1], curr[2] + 1});
                mxr = Math.max(mxr, nextVal);
            }
        }

        return new int[]{start, end};
    }
}
