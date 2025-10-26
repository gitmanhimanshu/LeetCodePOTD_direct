class Solution {
    public int reversePairs(int[] nums) {
       return mergeSort(nums,0,nums.length-1); 
    }



    int mergeSort(int []nums,int l,int r){
        if(l>=r){
            return 0;
        }
        int c = 0;
        int m=l+(r-l)/2;
        c+=mergeSort(nums,l,m);
       c+= mergeSort(nums,m+1,r);
       c+= merge(nums,l,m,r);
        return c;
        
    }
    int merge(int nums[],int l,int m,int r ){
        int le=m+1;
        int count=0;
        for(int i=l;i<=m;i++){
                       while (le <= r && (long) nums[i] > 2L * (long) nums[le]) {
                le++;
            }
            count += (le - (m + 1)); 
        }
       
        int n1=m-l+1;
        int n2=r-m;
        int L[]=new int[n1];
        int R[]=new int[n2];
        for(int i=0;i<n1;i++){
            L[i]=nums[l+i];
        }
        for(int i=0;i<n2;i++){
            R[i]=nums[m+1+i];
        }

        int i=0,j=0,k=l;
        while(i<n1&&j<n2){
            if(L[i]<R[j]){
                nums[k++]=L[i];
                i++;
            }else{
                nums[k++]=R[j];
                j++;
            }
        }
        while(i<n1){
            nums[k++]=L[i];
            i++;
        }
        while(j<n2){
            nums[k++]=R[j];
            j++;
        }
return count;

    }
}




















// class Solution {
//     public int reversePairs(int[] nums) {
//        int ans=0;
//        for(int i=0;i<nums.length;i++){
//         for(int j=i+1;j<nums.length;j++){
//              if ((long) nums[i] > 2L * (long) nums[j]) {
//                     ans++;
//                 }
//         }
//        }
//        return ans; 
//     }
// }