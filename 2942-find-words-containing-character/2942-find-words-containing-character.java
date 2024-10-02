class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans=new ArrayList<>();
        int j=0;
        for(String i:words){
            int ind=i.indexOf(x);
            if(ind!=-1){
                ans.add(j);
            }
            j++;
        }
        return ans;
    }
}