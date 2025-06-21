class Solution {
    public int maxDistance(String s, int k) {
        int e = 0;
        int w = 0;
        int n = 0;
        int st = 0;
        int ans = 0;
        int step = 0;
        for (char i : s.toCharArray()) {
            if (i == 'N') {
                n++;
            } else if (i == 'W') {
                w++;
            } else if (i == 'E') {
                e++;
            } else {
                st++;
            }
            int temp=Math.abs(e-w)+Math.abs(n-st);
            step++;
            int lost=step-temp;
            int ex=0;
            if(lost!=0){
             ex=Math.min(k*2,lost);
            }
            temp+=ex;
            ans=Math.max(ans,temp);


        }
        return ans;
    }

}