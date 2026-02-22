class Solution {
     String decimalToBinary(int n)
    {
        int remainder, quotient = n;
        String binaryNum = "";
        while (quotient > 0) {
            remainder = quotient % 2;
            binaryNum
                = Integer.toString(remainder) + binaryNum;
            quotient = quotient / 2;
        }
        return binaryNum;
    }
    public int binaryGap(int n) {
        String binary = decimalToBinary(n);
        Map<Integer,Integer> him=new HashMap<>();
        int ans=0;
        int sum=0;
        for(int i=0;i<binary.length();i++){
            int e=binary.charAt(i)-'0';
            if(e==1){
                if(him.containsKey(sum)){
                    ans=Math.max(ans,i-him.get(sum));
                }
                sum=sum+1;
                him.put(sum,i);
            }
        }
        return ans;
    }
}