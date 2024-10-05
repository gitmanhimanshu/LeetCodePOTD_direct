class Solution {
    String find(String s){
        int a[]=new int[26];
        for(char i:s.toCharArray()){
            a[i-'a']++;
        }
        StringBuilder sb=new StringBuilder();
        for(int i:a){
            sb.append(i);
        }
        return sb.toString();
    }
    public boolean checkInclusion(String s1, String s2) {
        String l=find(s1);
        for(int i=0;i<=s2.length()-s1.length();i++){
            if(find(s2.substring(i,i+s1.length())).equals(l)){
                return true;
            }
        }
        return false;

    }
}