class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int ele1 = -1;
        int ele2 = -1;
        int n = nums1.length + nums2.length;
        int i = 0;
        int j = 0;
        int k = 0;
        int reach1 = n / 2;
        int reach2 = n / 2 - 1;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {

                if (k == reach1) {
                    ele1 = nums1[i];
                }
                if (k == reach2) {
                    ele2 = nums1[i];
                }
                k++;
                i++;
            } else {
                if (k == reach1) {
                    ele1 = nums2[j];
                }
                if (k == reach2) {
                    ele2 = nums2[j];
                }
                k++;
                j++;
            }
        }
        while (i < nums1.length) {
            if (k == reach1) {
                ele1 = nums1[i];
            }
            if (k == reach2) {
                ele2 = nums1[i];
            }
            k++;
            i++;
        }
        while (j < nums2.length) {
            if (k == reach1) {
                ele1 = nums2[j];
            }
            if (k == reach2) {
                ele2 = nums2[j];
            }
            k++;
            j++;
        }
        if(n%2!=0){
            return ele1;
        }
        return (ele1+ele2)/2.0;
    }
}