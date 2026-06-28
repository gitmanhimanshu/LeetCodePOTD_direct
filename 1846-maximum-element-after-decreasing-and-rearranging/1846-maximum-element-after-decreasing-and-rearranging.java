class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
       Arrays.sort(arr);
       arr[0]=1;
       int prev=1;
       for(int i=1;i<arr.length;i++){
        arr[i]=Math.min(arr[i],prev+1);
        prev=arr[i];
       }
       return arr[arr.length-1];

    }
}