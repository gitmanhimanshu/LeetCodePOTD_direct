class Solution {
    public int totalWaviness(int num1, int num2) {
        int c=0;
        for(int i=num1;i<=num2;i++){
            c+=wave(i);
        }
        return c;
    }
    int wave(int n){
        String s=String.valueOf(n);
        if(s.length()<=2){
            return 0;
        }
        int c=0;
        for(int i=1;i<s.length()-1;i++){
            int peeche=s.charAt(i-1);
            int mid=s.charAt(i);
            int aage=s.charAt(i+1);
            if((mid>peeche&& mid >aage)||(mid<peeche&& mid <aage)){
                c++;
            }
        }
        return c;
    }
    
}