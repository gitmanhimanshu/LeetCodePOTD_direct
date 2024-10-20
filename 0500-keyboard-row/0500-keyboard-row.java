class Solution {
    public String[] findWords(String[] words) {
        Set<Character> s1 = new HashSet<>();
        Set<Character> s2 = new HashSet<>();
        Set<Character> s3 = new HashSet<>();
        for (char i : "qwertyuiop".toCharArray()) {
            s1.add(i);
        }
        for (char i : "asdfghjkl".toCharArray()) {
            s2.add(i);
        }
        for (char i : "zxcvbnm".toCharArray()) {
            s3.add(i);
        }
        List<String> ans = new ArrayList<>();
        for (String s : words) {
            String st=s.toLowerCase();
            int a = 1;
            if (s2.contains(st.charAt(0))) {
                a = 2;
            }
            if (s3.contains(st.charAt(0))) {
                a = 3;
            }
            boolean same = false;
            for (int i = 1; i < st.length(); i++) {
                int b = 1;
                if (s2.contains(st.charAt(i))) {
                    b = 2;
                }
                if (s3.contains(st.charAt(i))) {
                    b = 3;
                }
                if(a!=b){
                    same=true;
                    break;
                }
            }
            if(!same){
                ans.add(s);
            }
        }
      String a[]=new String[ans.size()];
      int k=0;
      for(String i:ans){
a[k++]=i;
      }
      return a;
    }
}