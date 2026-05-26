class Solution {
    public int numberOfSpecialChars(String word) {
        int a[]=new int[26];
        int b[]=new int [26];
        for(char i:word.toCharArray()){
            if(Character.isUpperCase(i)){
                a[i-'A']++;
            }else{
                b[i-'a']++;
            }
        }
        int ans=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>0&&b[i]>0){
                ans++;
            }
        }
        return ans;
    }
}