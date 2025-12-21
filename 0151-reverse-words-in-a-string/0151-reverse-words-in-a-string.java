class Solution {
    public String reverseWords(String s) {
        String a[]=s.trim().split(" ");
      StringBuilder sb=new StringBuilder();
      for(int i=a.length-1;i>=0;i--){
        String st=a[i];
        if(st.trim().length()>0){
            sb.append(st.trim());
            sb.append(" ");
        }
      }
      return sb.toString().trim();
    }
}