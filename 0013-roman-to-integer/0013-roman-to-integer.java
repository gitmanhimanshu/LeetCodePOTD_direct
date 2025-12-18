class Solution {
    public int romanToInt(String s) {
        if(s.length()==0){
return 0;}
        int sum=get(s.charAt(0));
        for(int i=1;i<s.length();i++){
           
            if(get(s.charAt(i))>get(s.charAt(i-1))){
                sum=sum+get(s.charAt(i))-(2*get(s.charAt(i-1)));
            }
            else{
                sum=sum+get(s.charAt(i));
            }
        }
        return sum;
    }
    int get(char n){
        int a=0;
        switch(n){
          
                   case 'I':return 1;
                   case 'V':return 5;
                   case 'X':return 10;
                   case 'L':return 50;
                   case 'C':return 100;
                       case 'D':return 500;
                 case 'M': return 1000;
            default: return 0;
                                    

                                

        }
    }
}