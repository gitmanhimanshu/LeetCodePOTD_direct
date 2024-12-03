class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> him=new HashSet<>();
        int z=0;
        for(int i:arr){
            him.add(i);
            if(i==0){
                z++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                if(z>1){
                    return true;
                }
                continue;
            }
            int c=arr[i]*2;
            // for(int j=0;j<arr.length;j++){
            //     if(i==j){
            //         continue;
            //     }
            //     if(arr[j]==c){
            //         System.out.println(c);
            //         return true;
            //     }
            // }
            if(him.contains(c)){
                return true;
            }
        }
        return false;
    }
}