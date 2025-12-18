class Solution {
    public int romanToInt(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int ans= getNum(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(getNum(s.charAt(i))>getNum(s.charAt(i-1))){
                ans+=getNum(s.charAt(i))- (2*getNum(s.charAt(i-1)));
            }else{
                ans+=getNum(s.charAt(i));
            }
           
        }
         return ans;
    }

    int getNum(char n) {

        switch (n) {

            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;

        }
    }
}