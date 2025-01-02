class Solution {
    boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        return false;
    }

    public int[] vowelStrings(String[] words, int[][] queries) {
        int ans[] = new int[queries.length];
        int k = 0;
        int v[] = new int[words.length];
        // for(int a[]:queries){
        // int s=a[0];
        // int e=a[1];
        // int ac=0;
        // for(int i=s;i<=e;i++){
        // if(isVowel(words[i].charAt(0))&&isVowel(words[i].charAt(words[i].length()-1))){
        // ac++;
        // }
        // }
        // ans[k++]=ac;
        // }
        v[0] = isVowel(words[0].charAt(0)) && isVowel(words[0].charAt(words[0].length() - 1)) ? 1 : 0;
        for (int i = 1; i < words.length; i++) {
            if (isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length() - 1))) {
                v[i] = v[i - 1] + 1;
            } else {
                v[i] = v[i - 1];
            }
        }
        int i = 0;
        for (int a[] : queries) {
            int s = a[0] -1;
            int e = a[1];
            if (s >= 0) {
                    ans[i++]=v[e]-v[s];
            }else{
                ans[i++]=v[e];
            }
        }

        return ans;
    }
}