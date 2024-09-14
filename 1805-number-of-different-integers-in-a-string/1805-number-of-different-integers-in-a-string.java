class Solution {
    public int numDifferentIntegers(String word) {
        Set<String> him=new HashSet<>();
      StringBuilder s=new StringBuilder();
        for(int i=0;i<word.length();i++){
           
            while(i<word.length()&&Character.isDigit(word.charAt(i))){
                s.append(word.charAt(i));
                i++;
            }
            while(s.length()>1&&s.charAt(0)=='0'){
                s.deleteCharAt(0);
            }
            if(s.length()>0&&!him.contains(s.toString())){
                him.add(s.toString());
                i=i-1;
                        s.setLength(0);
            }else if(s.length()>0){
                i=i-1;
                s.setLength(0);
            }
        }
        return him.size();
    }
}