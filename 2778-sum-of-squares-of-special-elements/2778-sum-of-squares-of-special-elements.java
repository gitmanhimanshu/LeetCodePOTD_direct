class Solution {
    public int sumOfSquares(int[] nums) {
        int sum=0,n=nums.length;
        ArrayList<Integer> a=new ArrayList<>();
        for(int i:nums){
            a.add(i);
        }
        int k=1;
        for(int i:a){
            if(n%k==0){
                sum+=(i*i);
            }
            k+=1;
        }
        return sum;
    }
}