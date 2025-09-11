class Solution {
    public String sortVowels(String s) {
        StringBuilder v = new StringBuilder();
        for (Character i : s.toCharArray()) {
            if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u' || i == 'A' || i == 'E' || i == 'I' || i == 'O'
                    || i == 'U') {
                v.append(i);
            }
        }

        char c[] = v.toString().toCharArray();
        Arrays.sort(c);
       int j=0;
       StringBuilder sb=new StringBuilder();
        for(char i:s.toCharArray()){
         if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u'||i=='A'||i=='E'||i=='I'||i=='O'||i=='U'){
            sb.append(c[j++]);
         }else{
            sb.append(i);
         }
        }
        return sb.toString();
    }
}
