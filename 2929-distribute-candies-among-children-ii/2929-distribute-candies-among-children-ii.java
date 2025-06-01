class Solution {
    public long distributeCandies(int n, int limit) {
 long ans = 0;

    for (long i = Math.max(0, n - 2L * limit); i <= Math.min(n, limit); i++) {
        long kStart = Math.max(0, n - limit - i);
        long kEnd = Math.min(n - i, limit);

        if (kStart <= kEnd) {
            ans += (kEnd - kStart + 1);
        }
    }

    return ans;
    }
}



// class Solution {
//     public long distributeCandies(int n, int limit) {
//         long w = 0;
//         for (int i = 0; i <= Math.min(n, limit); i++) {
//             for (int j = 0; j <= Math.min(n - i, limit); j++) {
//                 int k = n - i - j;
//                 if (k <= limit) {
//                     w++;
//                 }
//             }
//         }
//         return w;
//     }
// }



// class Solution {
//     public long distributeCandies(int n, int limit) {
//      return    solve(0,n,limit);
//     }
//     long solve(int c,int n,int limit){
//         if(c==3){
//             if(n==0){
//                 return 1L;
//             }
//             return 0L;
//         }
//         long w=0;
//         for(int i=0;i<=Math.min(n,limit);i++){
//             w+=solve(c+1,n-i,limit);
//         }
//         return w;

//     }
// }