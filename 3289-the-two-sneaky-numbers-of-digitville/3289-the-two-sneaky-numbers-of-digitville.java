class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Map<Integer,Integer> him=new HashMap<>();
        for(int i:nums){
            him.put(i,him.getOrDefault(i,0)+1);
        }
        int a[]=new int[2];
        int k=0;
        for(Integer i:him.keySet()){
                if(him.get(i)==2){
                    a[k++]=i;
                }
                if(k==2){
                    break;
                }
        }
        return a;
    }
}