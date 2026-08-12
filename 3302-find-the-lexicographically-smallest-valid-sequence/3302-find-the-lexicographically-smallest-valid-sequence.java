class Solution {
    public int[] validSequence(String word1, String word2) {
        int suff[]=new int[word1.length()];
        int n=word1.length();
        int m=word2.length();
        int i=n-1;
        int j=m-1;
        while(i>=0){
            int c=i<n-1?suff[i+1]:0;
            if(j>=0&& word1.charAt(i)==word2.charAt(j)){                
                suff[i]=c+1;
                j--;
            }else{
                suff[i]=c;
            }
            i--;
        }
        int ans[]=new int[m];
        boolean usedPower=false;
        j=0;
        int k=0;
        for(i=0;i<n&&k<m;i++){
            if(word1.charAt(i)==word2.charAt(j)){
                ans[k++]=i;
                j++;
            }else{
                int remaining = (i + 1 < n) ? suff[i + 1] : 0;
                if(!usedPower && remaining >= m-j-1){
                    ans[k++]=i;
                    usedPower=true;
                    j++;
                }
            }
        }
        if(k<m){
            return new int[0];
        }
        return ans;
    }
}