class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int ans[]=new int[A.length];
        Set<Integer> h=new HashSet<>();
        for(int i=0;i<A.length;i++){
            int c=0;
            h.add(A[i]);
            for(int j=0;j<=i;j++){
                if(h.contains(B[j])){
                    c++;
                }
            }
            ans[i]=c;
          
            
        }
        return ans;
    }

    // public int[] findThePrefixCommonArray(int[] A, int[] B) {
    //     int ans[]=new int[A.length];
    //     for(int i=0;i<A.length;i++){
    //         int c=0;
    //         for(int j=0;j<=i;j++){
    //             for(int k=0;k<=i;k++){
    //                 if(A[j]==B[k]){
    //                     c++;
    //                 }
    //             }
    //         }
    //         ans[i]=c;
    //     }
    //     return ans;
    // }
}