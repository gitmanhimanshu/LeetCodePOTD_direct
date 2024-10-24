class Solution {
    public String convertToBase7(int num) {
        boolean neg=false;
        if(num==0){
            return "0";
        }
      if(num<0){
        num*=-1;
        neg=true;
      }  
    StringBuilder ans=new StringBuilder();
    while(num>0){
        ans.append(num%7);
        num/=7;
    }
    if(neg){
        return "-"+ans.reverse().toString();
    }
    return ans.reverse().toString();
    }
}