class FindSumPairs {
     int arr1[];
     int arr2[];
     Map<Integer,Integer> him=new HashMap<>();
    public FindSumPairs(int[] nums1, int[] nums2) {
        arr1=nums1;
        arr2=nums2;
        for(int i:nums2){
            him.put(i,him.getOrDefault(i,0)+1);
        }
    }
    
    public void add(int index, int val) {
        int c=arr2[index];
        int v=arr2[index]+val;
        arr2[index]=v;
        him.put(c, him.get(c) - 1);
                if (him.get(c) == 0) him.remove(c);
        him.put(v, him.getOrDefault(v, 0) + 1); 
    }
    
    public int count(int tot) {
        int ans=0;
   for (int i : arr1) {
            int target = tot - i;
            ans += him.getOrDefault(target, 0);
        }
        return ans;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */


//  class FindSumPairs {
//     int arr1[];
//     int arr2[];
    

//     public FindSumPairs(int[] nums1, int[] nums2) {
//         arr1=nums1;
//         arr2=nums2;
//     }
    
//     public void add(int index, int val) {
//         arr2[index]+=val;
//     }
    
//     public int count(int tot) {
//         int ans=0;
//         for(int i=0;i<arr1.length;i++){
//             for(int j=0;j<arr2.length;j++){
//                 if(arr1[i]+arr2[j]==tot){
//                     ans++;
//                 }
//             }
//         }
//         return ans;
//     }
// }

// /**
//  * Your FindSumPairs object will be instantiated and called as such:
//  * FindSumPairs obj = new FindSumPairs(nums1, nums2);
//  * obj.add(index,val);
//  * int param_2 = obj.count(tot);
//  */