class Solution {
    public int findPermutationDifference(String s, String t) {
        int ans=0;
        // for(char i='a';i<='z';i++){
        //     int ind=s.indexOf(i);
        //     if(ind==-1){
        //         continue;
        //     }
        //     ans+=Math.abs(ind-t.indexOf(i));
        // }
    Map<Character,Integer> him=new HashMap<>();
        for(int i=0;i<s.length();i++){
            him.put(s.charAt(i),i);
        }
        for(int i=0;i<t.length();i++){
            ans+=Math.abs(i-him.get(t.charAt(i)));
        }
        return ans;
    }
}