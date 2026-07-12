
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer,Integer> him=new HashMap<>();
        int r=1;
        int a[]=Arrays.copyOf(arr,arr.length);
        Arrays.sort(arr);
        for(int i:arr){
            if(!him.containsKey(i))
                him.put(i,r++);
        }
        int ans[]=new int[arr.length];
        for(int i=0;i<a.length;i++){
            ans[i]=him.get(a[i]);
        }
        return ans;
    }
}