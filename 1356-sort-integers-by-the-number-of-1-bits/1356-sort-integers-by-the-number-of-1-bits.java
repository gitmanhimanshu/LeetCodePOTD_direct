class pair implements Comparable<pair>{
    int n;
    int bit;
    pair(int n,int bit){
        this.n=n;
        this.bit=bit;
    }
    public int compareTo( pair o){
int diff=this.bit-o.bit;
if(diff!=0){
    return diff;
}
return this.n-o.n;
    }
}
class Solution {
    int find(int n) {
        int c = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                c++;
            }
            n /= 2;
        }
        return c;
    }
    public int[] sortByBits(int[] arr) {
        PriorityQueue<pair> him=new PriorityQueue<>();
        for(int i:arr){
            him.add(new pair(i,find(i)));
        }
        int k=0;
 while(!him.isEmpty()){
    arr[k++]=him.poll().n;
 }
 return arr;
    }
}