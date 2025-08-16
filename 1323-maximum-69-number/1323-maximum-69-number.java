class Solution {
    public int maximum69Number (int num) {
        String s=num+"";
        int c=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
                if(c==0 &&s.charAt(i)=='6'){
                    sb.append('9');
                    c++;
                }else{
                    sb.append(s.charAt(i));
                }
        }
        return Integer.parseInt(sb.toString());
    }
}