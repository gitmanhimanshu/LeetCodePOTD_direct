class Solution {
    public int[] resultArray(int[] nums) {
     int arr1[]=new int[nums.length];
     int n=nums.length;
     int arr2[]=new int[nums.length];
     int arr1last=0;
     int arr2last=0;
     if(nums.length<=2){
        return nums;
     }
     int j=2;
     arr1[0]=nums[0];
     arr2[0]=nums[1];
    while(j<nums.length){
        if(arr1[arr1last]>arr2[arr2last]){
            arr1[++arr1last]=nums[j];
        }else{
            arr2[++arr2last]=nums[j];
        }
        j++;
    }
    for(int i=0;i<=arr2last;i++){
        arr1[++arr1last]=arr2[i];
    }
    return arr1;
    }
}