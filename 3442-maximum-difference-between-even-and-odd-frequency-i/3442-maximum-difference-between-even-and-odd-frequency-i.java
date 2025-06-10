class Solution {
    public int maxDifference(String s) {
        int a[]=new int[26];
        for( char i:s.toCharArray()){
            a[i-'a']++;
        }
        int evenmin=Integer.MAX_VALUE;
        // int oddmin=Integer.MAX_VALUE;
        // int evenmax=Integer.MIN_VALUE;
        int oddmax=Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++ ){
            if(a[i]%2==0&&a[i]!=0&&a[i]<evenmin){
                evenmin=a[i];
            }
            if(a[i]%2!=0&&a[i]>oddmax){
                oddmax=a[i];
            }
        }
        return oddmax-evenmin;
    }
}