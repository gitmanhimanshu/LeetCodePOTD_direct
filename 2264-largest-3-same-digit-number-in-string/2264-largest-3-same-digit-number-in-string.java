class Solution {
    public String largestGoodInteger(String s) {
        String max = "";
        int n = s.length();
        for(int i=0;i<n-2;i++){
            if(s.charAt(i) == s.charAt(i+1) && s.charAt(i+1) == s.charAt(i+2)){
                if(max.length() == 0) 
                    max = s.substring(i,i+3);
                else if(Integer.parseInt(max) < Integer.parseInt(s.substring(i,i+3))) 
                    max = s.substring(i,i+3);
            }
        }
        return max;
    }
}