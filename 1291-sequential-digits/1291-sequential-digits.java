class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> him=new ArrayList<>();
        for(int i=1;i<=9;i++){
            int num=i;
            int n2=i+1;
            while(num<=high&&n2<=9){
                num=num*10+n2;
                if(num>=low&&num<=high){
                    him.add(num);
                }
                n2++;
            }
        }
        Collections.sort(him);
        return him;

    }
}