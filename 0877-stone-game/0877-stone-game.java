class Solution {
    public boolean stoneGame(int[] piles) {
        int evsum=0;
        int odsum=0;
        for(int i=0;i<piles.length;i+=2){
            evsum+=piles[i];
        }
          for(int i=1;i<piles.length;i+=2){
           odsum+=piles[i];
        }
return evsum>odsum?true:true;
    }
}