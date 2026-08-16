class Solution {
    public boolean stoneGameIX(int[] stones) {
        int zeroCnt = 0, oneCnt = 0, twoCnt = 0;

        for (int val : stones) {
            int r = val % 3;
            if (r == 0) zeroCnt++;
            else if (r == 1) oneCnt++;
            else twoCnt++;
        }

        // zeroCnt even ho to woh cancel out ho jate hain,
        // Alice ko bas dono taraf ka fuel chahiye
        if ((zeroCnt & 1) == 0) {
            return oneCnt >= 1 && twoCnt >= 1;
        }

        // odd zeros ek extra turn kha jate hain -> roles palat jate hain
        int gap = oneCnt - twoCnt;
        if (gap < 0) gap = -gap;
        return gap >= 3;
    }
}