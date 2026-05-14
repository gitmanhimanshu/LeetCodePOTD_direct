class Solution {
    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        Map<Integer,List<Integer>> him=new HashMap<>();
        for(int i=0;i<n;i++){
            him.put(i,new ArrayList<>());
        }
        Set<Integer> ans=new HashSet<>();
        for(int a[]:edges){
           him.get(a[0]).add(a[1]);
           
            //  System.out.println(a[0]+" "+ a[1]);
        him.get(a[1]).add(a[0]);
        }
        // for(int a[]:him.values()){
        //     System.out.println(a);
        // }
        Set<Integer> set=new HashSet<>();
        for(int i:restricted){
            set.add(i);
        }
       
        Set<Integer>vis=new HashSet<>();
        solve(0,set,him,ans,vis);
        // Set<Integer>vis=new HashSet<>();
        return ans.size();
    }
  void solve(int i,Set<Integer> res,Map<Integer,List<Integer>> him,Set<Integer> ans,Set<Integer>vis){
    if(vis.contains(i)){
        return ;
    }
    vis.add(i);
    ans.add(i);
     
    List<Integer> j=him.get(i);
    for(Integer l:j){
        
        if(res.contains(l)){
            continue;
        }
    
        
        solve(l,res,him,ans,vis);
    }
  }


}