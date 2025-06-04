class Solution {
    public String answerString(String word, int numFriends) {
        String r="";
        if(numFriends==1){
            return word;
        }
        int max=word.length()-numFriends+1;
        for(int i=0;i<word.length();i++){
            int l=Math.min(i+max,word.length());
           
            String t=word.substring(i,l);
            if(t.compareTo(r)>0){
                r=t;
            }
        }
        return r;
    }
}