class Pair {
    int first;
    int second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class Solution {
    int dir[][]={{1,0},{0,1},{-1,0},{0,-1}};
    int n;

    boolean isValid(int i, int j) {
        return i >= 0 && j >= 0 && i < n && j < n;
    }

    boolean isValidPath(int a[][], int mid) {
        Queue<Pair> him = new LinkedList<>();
        int vis[][] = new int[n][n];
        if (a[0][0] < mid || a[n-1][n-1] < mid)
            return false;
        him.add(new Pair(0, 0));
        vis[0][0]=1;
        while (!him.isEmpty()) {
            Pair p = him.poll();
            int i = p.first;
            int j = p.second;
            if (i == n - 1 && j == n - 1) {
                return true;
            }
            for (int d[] : dir) {
                int next_i = i + d[0];
                int next_j = j + d[1];
                if (isValid(next_i, next_j) && vis[next_i][next_j] == 0 && a[next_i][next_j] >= mid) {
                    him.add(new Pair(next_i, next_j));
                    vis[next_i][next_j] = 1;
                }
            }
        }
        return false;
    }

    public int maximumSafenessFactor(List<List<Integer>> grid) {
        n = grid.size();
        Queue<Pair> him = new LinkedList<>();
        int dist[][] = new int[n][n];
        boolean vis[][]=new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid.get(i).get(j) == 1) {
                    him.add(new Pair(i, j));
                    vis[i][j] = true;
                }
            }
        }

        while (!him.isEmpty()) {
            int l = him.size();
            for (int i = 1; i <= l; i++) {
                Pair p = him.poll();
                int curr_i = p.first;
                int curr_j = p.second;
               
                for (int d[] : dir) {
                    int next_i = curr_i + d[0];
                    int next_j = curr_j + d[1];
                    if (isValid(next_i, next_j) && !vis[next_i][next_j]) {
                        dist[next_i][next_j] = dist[curr_i][curr_j] + 1;
                        him.add(new Pair(next_i, next_j));
                         vis[next_i][next_j]=true;
                    }
                }
            }
        }
        int st = 0;
        int e = 400;
        int ans = 0;
        for(int d[]:dist)
        System.out.println(Arrays.toString(d));
        while (st <= e) {
            int mid = (st + e) / 2;
            if (isValidPath(dist, mid)) {
                ans = mid;
                st = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }

}