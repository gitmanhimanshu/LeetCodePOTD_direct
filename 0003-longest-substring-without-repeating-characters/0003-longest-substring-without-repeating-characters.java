class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> him=new HashMap<>();
        int i=0;
        int j=0;
        int l=0;
        while(j<s.length()){
            char c=s.charAt(j);
            if(him.containsKey(c)){
                while(him.containsKey(c)){
                    him.remove(s.charAt(i));
                    i++;
                }
            }
            l=Math.max(j-i+1,l);
            him.put(c,j);
            j++;
        }
        return l;
    }
}