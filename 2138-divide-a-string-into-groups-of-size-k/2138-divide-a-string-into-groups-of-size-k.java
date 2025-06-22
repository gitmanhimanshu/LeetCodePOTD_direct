class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n=s.length()/k;
        if(s.length()%k!=0){
            n+=1;
        }
        int i=0;
        int l=0;
        String ans[]=new String[n];
        while(i<s.length()){
            ans[l++]=s.substring(i,Math.min(i+k,s.length()));
            i=i+k;
        }
        StringBuilder temp=new StringBuilder(ans[ans.length-1]);
        while(temp.length()<k){
            temp.append(fill);
        }
        ans[ans.length-1]=temp.toString();
        return ans;
    }
}