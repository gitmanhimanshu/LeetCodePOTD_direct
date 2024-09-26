class Solution {
    public String reverseWords(String s) {
        String[] a = s.trim().split(" ");   // here trim method is used for space
        StringBuilder ans = new StringBuilder();
        for (int i = a.length - 1; i >= 0; i--) {
            if (!a[i].isEmpty()) {
                ans.append(a[i].trim()); //remove the space from each word 
                if (i != 0) ans.append(" ");
            }
        }
        return ans.toString();
    }
}
