class Solution {
    public int findPermutationDifference(String s, String t) {
        int ans=0;
        for(char i='a';i<='z';i++){
            int ind=s.indexOf(i);
            if(ind==-1){
                continue;
            }
            ans+=Math.abs(ind-t.indexOf(i));
        }
        return ans;
    }
}