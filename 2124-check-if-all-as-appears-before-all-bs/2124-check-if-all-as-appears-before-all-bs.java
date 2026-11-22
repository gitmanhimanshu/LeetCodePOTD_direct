class Solution {
    public boolean checkString(String s) {
        int a=-1;
        int b=-1;
        for(int i=s.length()-1;i>=0;i--){
            if(a==-1 &&s.charAt(i)=='a'){
                a=i;
            }
            if(s.charAt(i)=='b'){
                b=i;
            }
        }
        if(a==-1||b==-1){
            return true;
        }
        return a<b;
    }
    
}