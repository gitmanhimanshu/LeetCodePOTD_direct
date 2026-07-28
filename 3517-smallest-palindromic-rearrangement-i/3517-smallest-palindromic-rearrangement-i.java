class Solution {
    public String smallestPalindrome(String s) {
        char c[]=s.toCharArray();
        int n=c.length;
        Arrays.sort(c,0,n/2);
        // System.out.println(c);
        for(int i=0;i<n/2;i++){
            c[n-i-1]=c[i];
        }
        return new String(c);
            }
}