class Solution {
    List<Integer> him;
    public List<Integer> lexicalOrder(int n) {
        him=new ArrayList<>();
        for(int i=1;i<=9;i++){
            find(i,n);
        }
        return him;
    }
    void find(int t,int n){
        if(him.size()==n){
            return;
        }
        him.add(t);
        for(int i=0;i<=9;i++){
        int num=t*10+i;
        if(num>n){
            return ;
        }
        find(num,n);
        }
    }
}