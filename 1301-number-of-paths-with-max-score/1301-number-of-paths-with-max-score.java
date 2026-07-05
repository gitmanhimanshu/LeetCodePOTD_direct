class Solution {
    public int[] pathsWithMaxScore(List<String> board) {
        int mod = 1000000007;
        int size = board.size();

        int[][] score = new int[size + 1][size + 1];
        int[][] paths = new int[size + 1][size + 1];

        for (int[] row : score) java.util.Arrays.fill(row, -1);

        score[size - 1][size - 1] = 0;
        paths[size - 1][size - 1] = 1;

        for (int r = size - 1; r >= 0; r--) {
            String line = board.get(r);
            for (int c = size - 1; c >= 0; c--) {
                char ch = line.charAt(c);
                if (ch == 'X' || (r == size - 1 && c == size - 1)) continue;

                int topScore = pick(score, r + 1, c, size);
                int leftScore = pick(score, r, c + 1, size);
                int diagScore = pick(score, r + 1, c + 1, size);

                int high = Math.max(topScore, Math.max(leftScore, diagScore));
                if (high < 0) continue;

                long total = 0;
                if (topScore == high) total += paths[r + 1][c];
                if (leftScore == high) total += paths[r][c + 1];
                if (diagScore == high) total += paths[r + 1][c + 1];

                int add = (ch == 'E') ? 0 : ch - '0';
                score[r][c] = high + add;
                paths[r][c] = (int) (total % mod);
            }
        }

        if (score[0][0] < 0) return new int[]{0, 0};
        return new int[]{score[0][0], paths[0][0]};
    }

    private int pick(int[][] score, int r, int c, int size) {
        if (r >= size || c >= size) return -1;
        return score[r][c];
    }
}