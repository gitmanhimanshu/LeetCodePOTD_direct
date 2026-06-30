class Solution {
    int get(char c) {
        switch (c) {
            case 'a':
                return 0;
            case 'e':
                return 1;
            case 'i':
                return 2;
            case 'o':
                return 3;
            case 'u':
                return 4;
            default:
                return 5;

        }
    }
    boolean isGot(int a[],int k){
       return (a[0]>0&&a[1]>0&&a[2]>0&&a[3]>0&&a[4]>0&&a[5]==k);        
    }


    public int countOfSubstrings(String word, int k) {
        int a[]=new int [6];
        int ans=0;

        int n=word.length();
        for(int i=0;i<n;i++){
            Arrays.fill(a,0);
            for(int j=i;j<n;j++){
                 a[get(word.charAt(j))]++;
                 if(isGot(a,k)){
                    ans++;
                 }
            }
        }
        return ans;
    }
}