class Solution {
    public String compressedString(String word) {
        StringBuilder ans = new StringBuilder();
        int count = 1;
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                count++;
            } else {
             
                while (count > 0) {
                    if (count > 9) {
                        ans.append(9).append(word.charAt(i));
                        count -= 9;
                    } else {
                        ans.append(count).append(word.charAt(i));
                        count = 0;
                    }
                }
                count = 1; 
            }
        }
        
       
        while (count > 0) {
            if (count > 9) {
                ans.append(9).append(word.charAt(word.length() - 1));
                count -= 9;
            } else {
                ans.append(count).append(word.charAt(word.length() - 1));
                count = 0;
            }
        }

        return ans.toString();
    }
}
