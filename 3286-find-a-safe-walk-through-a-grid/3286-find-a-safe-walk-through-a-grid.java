//brute force
// class Solution {
//     int n;
//     int m;
//     int dp[][][];
//     public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        
//         n = grid.size();
//         m = grid.get(0).size();
//         dp=new int[n][m][health+1];
//         for(int a[][]:dp){
//             for(int b[]:a){
//                 Arrays.fill(b,-1);
//             }
//         }
//         return check(grid, health, 0, 0, new int[n][m]);
//     }

//     boolean check(List<List<Integer>> grid, int health, int i, int j, int vis[][]) {
//         if (!isValid(i, j) || vis[i][j] == 1) {
//             return false;
//         }
//         int v=grid.get(i).get(j);
//         health=health-v;
//         if(health <= 0)
//             return false;
//         if (i == n - 1 && j == m - 1) {
//             return health > 0;
//         }
//         if(dp[i][j][health]!=-1){
//             return dp[i][j][health]==1;
//         }
//         vis[i][j]=1;
        
//         boolean up=check(grid, health, i-1, j,vis);
//         boolean down=check(grid,health, i+1, j,vis);
//         boolean left=check(grid,health, i, j-1,vis);
//         boolean right=check(grid,health, i, j+1,vis);
//         vis[i][j]=0;
//         dp[i][j][health]= (up||down||left||right)==true?1:0;
//         return dp[i][j][health]==1;
//     }

//     boolean isValid(int i, int j) {
//         return i >= 0 && j >= 0 && i < n && j < m;
//     }
// }

// best solution
class Pair {
    int i;
    int j;
    int v;

    Pair(int i, int j, int v) {
        this.i = i;
        this.j = j;
        this.v = v;
    }

}

class Solution {
    int dir[][] = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
    int n;
    int m;;
    public boolean isValid(int i,int j){
        return i>=0&&j>=0&&i<n&&j<m;
    }
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        Deque<Pair> him = new LinkedList<>();
        n = grid.size();
        m=grid.get(0).size();

        int dist[][] = new int[grid.size()][m];
        for (int a[] : dist) {
            Arrays.fill(a, Integer.MAX_VALUE);
        }
        him.add(new Pair(0, 0, grid.get(0).get(0)));
        dist[0][0] = grid.get(0).get(0);
        while (!him.isEmpty()) {
            Pair p = him.poll();
            int i = p.i;
            int j = p.j;
            int v = p.v;
            if (v >= health) {
                continue;
            }
            if(i==n-1&&j==m-1){
                return true;
            }
            for (int d[] : dir) {
                int next_i=i+d[0];
                int next_j=j+d[1];
                if(isValid(next_i,next_j)&&(grid.get(next_i).get(next_j)+v)<dist[next_i][next_j]){
                    dist[next_i][next_j]=grid.get(next_i).get(next_j)+v;
                    if(grid.get(next_i).get(next_j)==1){
                        him.addLast(new Pair(next_i,next_j,dist[next_i][next_j]));
                    }else{
                        him.addFirst(new Pair(next_i,next_j,dist[next_i][next_j]));
                    }

                }
            }
        }
        return dist[n-1][m-1]<health;
    }
}

//better solution
// class Pair implements Comparable<Pair> {
//     int i;
//     int j;
//     int v;

//     Pair(int i, int j, int v) {
//         this.i = i;
//         this.j = j;
//         this.v = v;
//     }

//     public int compareTo(Pair that) {
//         return this.v - that.v;
//     }
// }

// class Solution {
//     int dir[][] = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
//     int n;
//     int m;;
//     public boolean isValid(int i,int j){
//         return i>=0&&j>=0&&i<n&&j<m;
//     }
//     public boolean findSafeWalk(List<List<Integer>> grid, int health) {
//         PriorityQueue<Pair> him = new PriorityQueue<>();
//         n = grid.size();
//         m=grid.get(0).size();

//         int dist[][] = new int[grid.size()][m];
//         for (int a[] : dist) {
//             Arrays.fill(a, Integer.MAX_VALUE);
//         }
//         him.add(new Pair(0, 0, grid.get(0).get(0)));
//         dist[0][0] = grid.get(0).get(0);
//         while (!him.isEmpty()) {
//             Pair p = him.poll();
//             int i = p.i;
//             int j = p.j;
//             int v = p.v;
//             if (v >= health) {
//                 continue;
//             }
//             if(i==n-1&&j==m-1){
//                 return true;
//             }
//             for (int d[] : dir) {
//                 int next_i=i+d[0];
//                 int next_j=j+d[1];
//                 if(isValid(next_i,next_j)&&(grid.get(next_i).get(next_j)+v)<dist[next_i][next_j]){
//                     dist[next_i][next_j]=grid.get(next_i).get(next_j)+v;
//                     him.add(new Pair(next_i,next_j,dist[next_i][next_j]));
//                 }
//             }
//         }
//         return dist[n-1][m-1]<health;
//     }
// }