class Solution {
    public boolean isAnagram(String s, String t) {
        if(t.length()!=s.length()){
            return false;
        }
        char a[]=s.toCharArray();
        char b[]=t.toCharArray();
       Arrays.sort(a);
          Arrays.sort(b);
        for(int i=0;i<a.length;i++){
            if(!(a[i]==b[i])){
                return false;
                }
        }
        
    
        return true;
    }
}