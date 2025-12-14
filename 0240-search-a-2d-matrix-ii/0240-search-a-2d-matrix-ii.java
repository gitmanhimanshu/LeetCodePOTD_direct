class Solution {

   boolean isFind(int[] a, int target) {
        int left = 0;
        int right = a.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (a[mid] == target) {
                return true;  
            } else if (a[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false; 
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        for(int a[]:matrix){
            if(isFind(a,target)){
                return true;
            }
        }
        return false;
    }
}