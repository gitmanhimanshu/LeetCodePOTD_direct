class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int ans[]=new int[nums.length];
        int a[]=new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            a[i]=nums[i];
        }
        int j=0;
        for(int i=nums.length;i<a.length;i++){
            a[i]=nums[j++];
        }
        // Map<Integer,Integer> him1=new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     him1.put(nums[i],i);
        // }
     //   System.out.println(Arrays.toString(a));
        Stack<Integer> him=new Stack<>();
        for(int i=a.length-1;i>=0;i--){
                 while(!him.isEmpty()&&him.peek()<=a[i]){
                    him.pop();
                 }
                 if(him.isEmpty()){
                    ans[i%nums.length]=-1;
                 }else{
                    ans[i%nums.length]=him.peek();
                 }
                 him.add(a[i]);
        }
        return ans;
    }
}