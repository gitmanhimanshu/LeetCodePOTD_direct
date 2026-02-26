
// class Solution {
//    public  long convertBinaryToDecimal(String str){
//     double j=0;
//     for(int i=0;i<str.length();i++){
//         if(str.charAt(i)== '1'){
//          j=j+ Math.pow(2,str.length()-1-i);
//      }

//     }
//     return (long) j;
// }
//     public int numSteps(String s) {
//         int c=0;
//         long decimal = convertBinaryToDecimal(s);
//     while(decimal>1){
//         if((decimal&1)!=0){
//             decimal+=1;
//         }else{
//             decimal/=2;
//         }
//         c++;
//     }
//     return c;
//     }
// }
class Solution {
    public int numSteps(String s) {
        int steps = 0;
        int carry = 0;
        
        // Right se second last bit se start
        for (int i = s.length() - 1; i > 0; i--) {
            
            int bit = s.charAt(i) - '0';
            
            // current bit + carry
            if (bit + carry == 1) {
                // odd → add 1 then divide
                steps += 2;
                carry = 1;
            } else {
                // even → divide only
                steps += 1;
            }
        }
        
        return steps + carry;
    }
}