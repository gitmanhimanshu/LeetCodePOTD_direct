class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
    Map<Integer,List<Integer>> him=new HashMap<>();
    for(int i=0;i<nums.length;i++){
        if (!him.containsKey(nums[i])){
            him.put(nums[i],new ArrayList<>());
        }
        him.get(nums[i]).add(i);
    }
    List<Integer> ans=new ArrayList<>();
    for (int i=0;i<queries.length;i++){
        int ele=nums[queries[i]];
        List<Integer>all=him.get(ele);
        if (all.size()==1){
            ans.add(-1);
            continue;
        }
        int ind=find(all,queries[i]);
        // int ind=all.indexOf(queries[i]); giving time limit exceeded
        int left=all.get(((ind-1+all.size())%all.size()));
        int right=all.get(((ind+1)%all.size()));
        int diffleft=Math.abs(queries[i]-left);
        int bachaleft=Math.abs(nums.length-diffleft);
        int diffright=Math.abs(queries[i]-right);
        int bacharight=Math.abs(nums.length-diffright);
        int t=Math.min(diffleft,Math.min(bachaleft,Math.min(diffright,bacharight)));
            ans.add(t);
    }
    return ans;
  
    }
    int find(List<Integer> l,int target){
        int s=0;
        int r=l.size()-1;
        while(s<=r){
            int mid=s+(r-s)/2;
            if (l.get(mid).equals(target)){
                return mid;
            }else if (l.get(mid)>target){
                r=mid-1;
            }else{
                s=mid+1;
            }
        }
        return -1;
    }
}