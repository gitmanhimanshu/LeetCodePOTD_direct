class Solution {
    public List<String> letterCombinations(String digits) {
      String a[]=new String[10];
             List<String> him=new ArrayList<>();
        if(digits.equals("")){
            return him;
        }
        a[0]="";
        a[1]="";
        a[2]="abc"; a[3]="def"; a[4]="ghi"; a[5]="jkl"; a[6]="mno"; a[7]="pqrs"; a[8]="tuv";
        a[9]="wxyz";
   
        find(0,digits,him,a,"");
        return him;
    }
    void find(int ind,String digits,List<String> him,String a[],String n){
        if(ind==digits.length()){
            him.add(n);
            return;
        }
        String str=a[digits.charAt(ind)-'0'];
        for(int i=0;i<str.length();i++){
            n=n+str.charAt(i);
            find(ind+1,digits,him,a,n);
            n=n.substring(0,n.length()-1);
        }
    }
}