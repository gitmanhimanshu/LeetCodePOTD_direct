class Solution {
    public int numberOfSpecialChars(String word) {
        int a[]=new int[26];
        Arrays.fill(a,Integer.MAX_VALUE);
        int ans=0;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(Character.isLowerCase(c)){
                a[c-'a']=i;
            }

        }
        // System.out.println(Arrays.toString(a));
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(!Character.isLowerCase(c)){
                int ind=a[c-'A'];
                if(ind<i){
                    // System.out.println(c+" "+ind+" "+i);
                    ans++;
                }
                a[c-'A']=Integer.MAX_VALUE;
            }

        }
        
        return ans;
        
    }
}