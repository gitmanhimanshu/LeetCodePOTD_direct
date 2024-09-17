class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>>ans=new ArrayList<>();
        Set<Integer> him1=new HashSet<>();
        Set<Integer> him2=new HashSet<>();
        for(int i:nums1){
            him1.add(i);
        }
         for(int i:nums2){
            him2.add(i);
        }
        for(int i=0;i<2;i++){
            ans.add(new ArrayList<>());
        }
        for(int i:him1){
           
             
            if(!him2.contains(i)){
                ans.get(0).add(i);
            }
        }
         for(int i:him2){
            
            if(!him1.contains(i)){
                ans.get(1).add(i);
            }
        }
        return ans; 
    }
}