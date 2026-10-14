class Solution {
    public String maxSumOfSquares(int num, int sum) {
        int nine=sum/9;
        int other=sum%9;
        
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<nine){
            sb.append('9');
            i++;
        }
        
        if(other!=0){
            sb.append(other);
        }

        while(sb.length()<num){
            sb.append('0');
        }
        if(sb.length()>num){
            return "";
        }
        return sb.toString();
    }
}