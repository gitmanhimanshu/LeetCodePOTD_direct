class Solution {
    public boolean checkIfExist(int[] arr) {
        // Set<Integer> him=new HashSet<>();
        // for(int i:arr){
        //     him.add(i);
        // }
        for(int i=0;i<arr.length;i++){
            int c=arr[i]*2;
            for(int j=0;j<arr.length;j++){
                if(i==j){
                    continue;
                }
                if(arr[j]==c){
                    System.out.println(c);
                    return true;
                }
            }
        }
        return false;
    }
}