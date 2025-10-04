class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        int a[]=new int[1];
        a[0]=1;
        List<Integer> temp = new ArrayList<>();
        for (int val : a) {
            temp.add(val);
        }
        ans.add(temp);
        for(int i=1;i<numRows;i++){
          int[]  t=new int[i+1];
            t[0]=1;
            t[t.length-1]=1;
            for(int j=1;j<t.length-1;j++){
                t[j]=a[j-1]+a[j];
            }
            ans.add(new ArrayList<>());
            for(int val:t){
                ans.get(ans.size()-1).add(val);
            }
            a=t;
        }
        return ans;
        
    }
}