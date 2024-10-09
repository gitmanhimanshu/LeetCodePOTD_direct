class Solution {
    public int minAddToMakeValid(String s) {
        int ans=0;
        int a=0;
        for(char i:s.toCharArray()){
            if(i=='('){
                a++;
            }else{
                if(a>0){
                    a--;
                }else{
                    ans++;
                }
            }
        }
        return ans+a;
    }
}