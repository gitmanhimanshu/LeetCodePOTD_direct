class Solution {
    public String removeDigit(String number, char digit) {
        String ans="";
        for(int i=0;i<number.length();i++){
            if(number.charAt(i)==digit){
                String s=number.substring(0,i)+number.substring(i+1);
                if(ans.length()==0){
                    ans=s;
                }else{
                    if(ans.compareTo(s)<0){
                        ans=s;
                    }
                }


            }
        }
        return ans;
    }
}