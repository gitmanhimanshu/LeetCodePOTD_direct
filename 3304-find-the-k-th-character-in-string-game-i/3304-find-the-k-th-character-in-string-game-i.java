class Solution {
    public char kthCharacter(int k) {
     StringBuilder sb=new StringBuilder();
     sb.append('a');
     StringBuilder temp=new StringBuilder();
     while(sb.length()<k){
        for(int i=0;i<sb.length();i++){
            char c=sb.charAt(i);
            if(c=='z'){
                c='a';
            }else{
                c++;
            }
            temp.append(c);
        }
        sb.append(temp);
        temp.setLength(0);
     }   
     return sb.charAt(k-1);
    }
}