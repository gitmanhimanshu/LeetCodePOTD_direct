class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0;
        int min = Integer.MIN_VALUE;
        for (int i : weights) {
            sum += i;
            min=Math.max(i,min);
        }

        
        int max = sum;
        int ans = -1;
        while (min <= max) {
            int mid = (min + max) / 2;
            if (isSolution(mid, weights, days)) {
                ans = mid;
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return ans;
    }
    boolean isSolution(int mid,int []weights,int days){
            int c=1;
            int sum=0;
            for(int i:weights){
                sum+=i;
                if(sum>mid){
                    sum=i;
                    c++;
                }
            }
            return c<=days;
    }
}