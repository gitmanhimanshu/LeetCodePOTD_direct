class Solution {
    public int binaryGap(int n) {
        int last=-1;
        int pos=0;
        int ans=0;
        while(n>0){
            if((n&1)!=0){
                if(last!=-1){
                    ans=Math.max(ans,pos-last);
                }
                last=pos;
            }
            n=n>>1;
            pos++;
        }
        return ans;
    }
}


// class Solution {
// String decimalToBinary(int n) {
//     if (n == 0) return "0";

//     StringBuilder sb = new StringBuilder();

//     while (n > 0) {
//         sb.append(n % 2); 
//         n = n / 2;        
//     }

//     return sb.reverse().toString(); 
// }
//     public int binaryGap(int n) {
//         String binary = decimalToBinary(n);
//         Map<Integer,Integer> him=new HashMap<>();
//         int ans=0;
//         int sum=0;
//         for(int i=0;i<binary.length();i++){
//             int e=binary.charAt(i)-'0';
//             if(e==1){
//                 if(him.containsKey(sum)){
//                     ans=Math.max(ans,i-him.get(sum));
//                 }
//                 sum=sum+1;
//                 him.put(sum,i);
//             }
//         }
//         return ans;
//     }
// }