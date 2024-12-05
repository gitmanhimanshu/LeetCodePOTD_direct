class Solution {
    public boolean canChange(String start, String target) {
        int i = 0;
        int j = 0;
        while (i < start.length() || j < target.length()) {
            while ( i < start.length()&&start.charAt(i) == '_') {
                i++;
            }
            while ( j < target.length()&&target.charAt(j) == '_') {
                j++;
            }
            if (i == start.length() || j == target.length()) {
                return i == start.length() && j == target.length();
            }
            if(start.charAt(i)!=target.charAt(j)){
                return false;
            }
            if(start.charAt(i)=='L'){
                if(j>i){
                    return false;
                }
            }
            if(start.charAt(i)=='R'){
                if(j<i){
                    return false;
                }
            }
            i++;
            j++;
        }
        return true;
    }
}

// class Solution {
// public boolean canChange(String start, String target) {
// StringBuilder s=new StringBuilder();
// StringBuilder t=new StringBuilder();
// StringBuilder ins=new StringBuilder();
// StringBuilder tns=new StringBuilder();
// int k=-1;
// for(char i:start.toCharArray()){
// k++;
// if(i=='_'){
// continue;
// }
// s.append(i);
// ins.append(k);
// }
// k=-1;
// for(char i:target.toCharArray()){
// k++;
// if(i=='_'){
// continue;
// }
// t.append(i);
// tns.append(k);
// }
// if(s.length()!=t.length()){
// return false;
// }
// for(int i=0;i<s.length();i++){
// if(s.charAt(i)!=t.charAt(i)){
// return false;
// }else if(s.charAt(i)=='R'&&t.charAt(i)=='R'){
// if(ins.charAt(i)>tns.charAt(i))
// {
// return false;
// }
// }else if(s.charAt(i)=='L'&&t.charAt(i)=='L'){
// if(ins.charAt(i)<tns.charAt(i))
// {
// return false;
// }
// }
// }
// return true;
// }
// }