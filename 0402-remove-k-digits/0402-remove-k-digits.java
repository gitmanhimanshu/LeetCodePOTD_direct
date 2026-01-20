class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < num.length(); i++) {
            while (ans.length() > 0 && ans.charAt(ans.length() - 1) > num.charAt(i) && k > 0) {
                ans.setLength(ans.length() - 1);
                k--;
            }

            ans.append(num.charAt(i));
        }

        while (ans.length() > 1 && ans.charAt(0) == '0') {
            ans.deleteCharAt(0);
        }

        while (ans.length()>0&&k > 0) {
            ans.setLength(ans.length() - 1);
            k--;
        }

        if (ans.length() == 0) {
            return "0";
        }
        
        return ans.toString();
    }
}
