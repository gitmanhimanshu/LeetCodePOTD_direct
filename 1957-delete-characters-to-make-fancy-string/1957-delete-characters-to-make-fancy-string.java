class Solution {
    public String makeFancyString(String s) {
     StringBuilder him=new StringBuilder();
        for(char i:s.toCharArray()){
            if(him.length()>=2&&him.charAt(him.length()-2)==i&&him.charAt(him.length()-1)==i){
                continue;
            }else{
                him.append(i);
                
            }
        }
        return him.toString();
    }
}