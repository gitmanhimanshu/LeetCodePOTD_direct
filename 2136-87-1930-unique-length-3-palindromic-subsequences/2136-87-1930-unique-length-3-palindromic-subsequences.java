class Solution {
    public int countPalindromicSubsequence(String s) {
        int ans = 0;
        Set<Character> him = new HashSet<>();
        for (char i : s.toCharArray()) {
            him.add(i);
        }
        for (Character let : him) {
            int l=-1;
            int r=-1;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==let){
                    if(l==-1){
                        l=i;
                    }
                    r=i;
                }
            }
            Set<Character> t=new HashSet<>();
            for(int i=l+1;i<r;i++){
                t.add(s.charAt(i));
            }
            ans+=(t.size());

        }
        return ans;
    }
}