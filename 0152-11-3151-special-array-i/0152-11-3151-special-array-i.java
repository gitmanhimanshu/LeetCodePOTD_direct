class Solution {
    public boolean isArraySpecial(int[] nums) {
        // Loop through the array, checking pairs of adjacent elements
        for (int i = 0; i < nums.length - 1; i++) {
            boolean a = (nums[i] % 2 == 0); // true if nums[i] is even, false otherwise
            boolean b = (nums[i + 1] % 2 == 0); // true if nums[i + 1] is even, false otherwise

            if (a == b) { // If both are the same (both even or both odd), return false
                return false;
            }
        }
        return true; // If no adjacent pairs are the same, return true
    }
}
