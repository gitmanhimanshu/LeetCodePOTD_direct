class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> him=new HashMap<>();
        if(t.length()>s.length()){
            return "";
        }
        for(char c:t.toCharArray()){
            him.put(c,him.getOrDefault(c,0)+1);
        }
        int required=t.length();
        int i=0;
        int j=0;
        int start=i;
        int ans=Integer.MAX_VALUE;

        while(j<s.length()){
            char c=s.charAt(j);
            if(him.getOrDefault(c,0)>0){
                required--;
            }
            him.put(c,him.getOrDefault(c,0)-1);
            while(required==0){
                int length=j-i+1;
                if(length<ans){
                    ans=length;
                    start=i;
                }
                char b=s.charAt(i);
                him.put(b,him.getOrDefault(b,0)+1);
                if(him.get(b)>0){
                    required++;
                }
                i++;
            }
            j++;
            
        }
        return ans==Integer.MAX_VALUE?"":s.substring(start,start+ans);
    }
}