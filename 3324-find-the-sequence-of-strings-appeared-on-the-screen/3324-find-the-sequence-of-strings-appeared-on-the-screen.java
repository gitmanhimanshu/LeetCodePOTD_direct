class Solution {
    public List<String> stringSequence(String target) {
       List<String> ans=new ArrayList<>();
       StringBuilder temp=new StringBuilder();
       for(int i=0;i<target.length();i++){
        char ch='a'-1;
        while(ch!=target.charAt(i)){
            ch++;
            ans.add(temp.toString()+ch);
        }
        temp.append(ch);
       }
return ans;
    }
}