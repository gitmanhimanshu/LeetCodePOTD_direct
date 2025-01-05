class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        // StringBuilder sb=new StringBuilder(s);
        // for(int a[]:shifts){
        //     int s1=a[0];
        //     int e=a[1];
        //     int d=a[2];
        //     for(int i=s1;i<=e;i++){
        //         char c=sb.charAt(i);
        //         if(d==0){
        //             if(c=='a'){
        //                 c='z';
        //             }else{
        //                 c--;
        //             }
        //         }else{
        //             if(c=='z'){
        //                 c='a';
        //             }else{
        //                 c++;
        //             }
        //         }
        //         sb.setCharAt(i,c);
        //     }
            
        // }
        // return sb.toString();
       int n = s.length();
        int[] a = new int[n + 1];
        for (int[] shift : shifts) {
            a[shift[0]] += shift[2] == 1 ? 1 : -1;
            a[shift[1] + 1] += shift[2] == 1 ? -1 : 1;
        }
        int netShift = 0;
        for (int i = 0; i < n; i++) {
            netShift += a[i];
            a[i] = netShift;
        }
        StringBuilder result = new StringBuilder(s);
        for (int i = 0; i < n; i++) {
            int shift = a[i] % 26;
            if (shift < 0) shift += 26;
            result.setCharAt(i, (char) ('a' + (s.charAt(i) - 'a' + shift) % 26));
        }
        return result.toString();
        
    }
}