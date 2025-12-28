class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        solve(digits,0,ans,"");
        return ans;
    }
    void solve(String digits,int ind,List<String> ans,String t){
        if(ind==digits.length()){
            ans.add(t);
            return;
        }
        String data=get(digits.charAt(ind));
        for(char i:data.toCharArray()){
            solve(digits,ind+1,ans,t+i);

        }

    }
  String get(char c) {
    switch (c) {
        case '1':
            return "";          // usually no letters on 1
        case '2':
            return "abc";
        case '3':
            return "def";
        case '4':
            return "ghi";
        case '5':
            return "jkl";
        case '6':
            return "mno";
        case '7':
            return "pqrs";
        case '8':
            return "tuv";
        case '9':
            return "wxyz";
        case '0':
            return " ";         // space
        case '*':
            return "*";
        case '#':
            return "#";
        default:
            return "";
    }
}
}