import java.util.*;

class Solution {

    static class Item {
        int value;
        int id;

        Item(int value, int id) {
            this.value = value;
            this.id = id;
        }
    }

    public int[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {

        Item[] nodes = new Item[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Item(nums[i], i);
        }

        Arrays.sort(nodes, (a, b) -> Integer.compare(a.value, b.value));

        int[] rank = new int[n];
        for (int i = 0; i < n; i++) {
            rank[nodes[i].id] = i;
        }

        final int LOG = 18;
        int[][] jump = new int[n][LOG];

        int end = 0;
        for (int start = 0; start < n; start++) {

            if (end < start) {
                end = start;
            }

            while (end + 1 < n &&
                    nodes[end + 1].value - nodes[end].value <= maxDiff &&
                    nodes[end + 1].value - nodes[start].value <= maxDiff) {
                end++;
            }

            jump[start][0] = end;
        }

        for (int bit = 1; bit < LOG; bit++) {
            for (int i = 0; i < n; i++) {
                int next = jump[i][bit - 1];
                jump[i][bit] = jump[next][bit - 1];
            }
        }

        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            int left = rank[queries[i][0]];
            int right = rank[queries[i][1]];

            if (left > right) {
                int temp = left;
                left = right;
                right = temp;
            }

            if (left == right) {
                answer[i] = 0;
                continue;
            }

            int current = left;
            int moves = 0;

            for (int bit = LOG - 1; bit >= 0; bit--) {
                if (jump[current][bit] < right) {
                    current = jump[current][bit];
                    moves += 1 << bit;
                }
            }

            if (jump[current][0] >= right) {
                answer[i] = moves + 1;
            } else {
                answer[i] = -1;
            }
        }

        return answer;
    }
}