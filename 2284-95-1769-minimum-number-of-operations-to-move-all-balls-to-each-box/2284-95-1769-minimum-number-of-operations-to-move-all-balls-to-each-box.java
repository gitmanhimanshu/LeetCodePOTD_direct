class Solution {
    public int[] minOperations(String boxes) {
        int a[] = new int[boxes.length()];
        int k = 0;
        for (char i : boxes.toCharArray()) {
            if (i == '1') {
                a[k] = 1;
            }
            k++;
        }
        int ans[]=new int[a.length];
        for(int i=0;i<a.length;i++){
                int l=i-1;
                int r=i+1;
                int c=0;
                while(l>=0){
                    if(a[l]==1){
                        c+=(i-l);
                    }
                    l--;
                }
                while(r<a.length){
                    if(a[r]==1){
                        c+=(r-i);
                    }
                    r++;
                }
                ans[i]=c;
        }
return ans;
    }
}