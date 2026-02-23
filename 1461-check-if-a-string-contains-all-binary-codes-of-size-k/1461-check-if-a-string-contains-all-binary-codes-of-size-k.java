class Solution {

    public boolean hasAllCodes(String s, int k) {
        Set<String> him=new HashSet<>();
        for(int i=0;i<s.length()-k+1;i++){
            him.add(s.substring(i,i+k));

        }
        return him.size()==(1<<k);
    }
}