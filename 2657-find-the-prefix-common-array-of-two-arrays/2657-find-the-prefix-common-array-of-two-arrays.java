class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
      int ans[]=new int[A.length];
      int c=0;
      Map<Integer,Integer> him=new HashMap<>();
      for(int i=0;i<A.length;i++){
        him.put(A[i],him.getOrDefault(A[i],0)+1);
        him.put(B[i],him.getOrDefault(B[i],0)+1);
        if(him.get(A[i])==2){
            c++;
        }
        if(him.get(B[i])==2&& A[i]!=B[i]){
            c++;
        }

        

        ans[i]=c;
      }
        return ans;
    }

//   int ans[]=new int[A.length];
//         Set<Integer> h=new HashSet<>();
//         for(int i=0;i<A.length;i++){
//             int c=0;
//             h.add(A[i]);
//             for(int j=0;j<=i;j++){
//                 if(h.contains(B[j])){
//                     c++;
//                 }
//             }
//             ans[i]=c;
          
            
//         }
//         return ans;
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