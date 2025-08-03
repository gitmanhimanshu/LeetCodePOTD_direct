class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> him=new HashSet<>();
        Set<Integer> temp=  new HashSet<>();    
        Set<Integer> prev=  new HashSet<>();         
        for(int i=0;i<arr.length;i++){
                temp=new HashSet<>();  
                for(int j:prev){
                    temp.add(j|arr[i]);
                }
                temp.add(arr[i]);
                him.addAll(temp);
                prev=temp;

        }
        return him.size();
    }
}