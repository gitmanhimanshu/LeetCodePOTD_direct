class Solution {
    public int findTheLongestSubstring(String s) {
        Map<String,Integer> him=new HashMap<>();
        int r=0;
        StringBuilder h=new StringBuilder();
        him.put("00000",-1);
        int a[]=new int[5];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                a[0]=(a[0]+1)%2;
            }
            if(s.charAt(i)=='e'){
                a[1]=(a[1]+1)%2;
            }
            if(s.charAt(i)=='i'){
                a[2]=(a[2]+1)%2;
            }
            if(s.charAt(i)=='o'){
                a[3]=(a[3]+1)%2;
            }
            if(s.charAt(i)=='u'){
                a[4]=(a[4]+1)%2;
            }
            for(int j=0;j<a.length;j++){
                h.append(a[j]);
            }
            if(him.containsKey(h.toString())){
                r=Math.max(r,i-him.get(h.toString()));
            }else{
                him.put(h.toString(),i);
            }
            h.setLength(0);
     }
        return r;
    }
}