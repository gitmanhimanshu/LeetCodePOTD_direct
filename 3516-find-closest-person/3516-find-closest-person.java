class Solution {
    public int findClosest(int x, int y, int z) {
        int y1=z>y?z-y:y-z;
        int x1=(z>x)?z-x:x-z;
        if(x1<y1){
            return 1;
        }else if(x1>y1){
            return 2;
        }

        return 0;
    }
}