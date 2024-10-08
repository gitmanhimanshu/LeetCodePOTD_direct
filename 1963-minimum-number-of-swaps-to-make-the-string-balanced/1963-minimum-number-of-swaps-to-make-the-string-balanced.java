class Solution {
    public int minSwaps(String s) {
        int balance = 0, swaps = 0;
        for (char c : s.toCharArray()) {
            if (c == '[') {
                balance++;
            } else {
                balance--;
            }
            if (balance < 0) {
                swaps++;
                balance += 2;
            }
        }
        return swaps;
    }
}
