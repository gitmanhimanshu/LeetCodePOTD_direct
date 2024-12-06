class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer> b=new HashSet<>();
        for(int i:banned){
            b.add(i);
        }
        List<Integer> him=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(!b.contains(i)){
                him.add(i);
            }
        }
        int sum=0;
        int c=0;
        for(Integer i:him){
            sum+=i;
            if(sum>maxSum){
                break;
            }
            c++;
        }
        return c;
    }
}