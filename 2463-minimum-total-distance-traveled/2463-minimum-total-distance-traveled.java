class Solution {
 Long him[][];
    public long minimumTotalDistance(List<Integer> robot, int[][] factory) {
        Collections.sort(robot);
       
        Arrays.sort(factory,(a,b)->{
            return a[0]-b[0];
        });
     //   him=new HashMap<>();
        List<Integer>pos=new ArrayList<>();
        for(int a[]:factory){
            int ele=a[0];
            int c=a[1];
            for(int i=0;i<c;i++){
                 pos.add(ele);
                 }
             }
             if (pos.size() < robot.size()) {
            return -1; 
        }
        him=new Long[robot.size()][pos.size()];
        for(Long a[]:him){
Arrays.fill(a,-1L);
        }
           return  solve(0,0,robot,pos);
    }
    Long solve(int i,int j,  List<Integer>r,  List<Integer>pos){
        if(i>=r.size()){
            return 0L;
        }
        if(j>=pos.size()){
            return Long.MAX_VALUE/2;
        }
        if(him[i][j]!=-1){
            return him[i][j];
        }
        // if(him.containsKey(k)){
        //     return him.get(k);
        // }
Long take=Math.abs(pos.get(j)-r.get(i))+solve(i+1,j+1,r,pos);
Long ntake=solve(i,j+1,r,pos);

return him[i][j]= Math.min(take,ntake);
    }
}

// import java.util.Arrays;
// import java.util.Collections;
// import java.util.List;

// class Solution {
// public long minimumTotalDistance(List<Integer> robot, int[][] factory) {
// Collections.sort(robot);
// Arrays.sort(factory, (a, b) -> Integer.compare(a[0], b[0]));
// int n = robot.size(), m = factory.length;
// long[][] dp = new long[m + 1][n + 1];

// for (int i = 0; i <= m; i++) {
// Arrays.fill(dp[i], Long.MAX_VALUE / 2);
// }
// dp[0][0] = 0;

// for (int i = 1; i <= m; i++) {
// dp[i][0] = 0;
// for (int j = 1; j <= n; j++) {
// dp[i][j] = dp[i - 1][j];
// long totalDistance = 0;
// for (int k = 1; k <= factory[i - 1][1] && j - k >= 0; k++) {
// totalDistance += Math.abs(robot.get(j - k) - factory[i - 1][0]);
// dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - k] + totalDistance);
// }
// }
// }

// return dp[m][n];
// }
// }