class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long mas=(long)mass;
        for(int i:asteroids){
            if(mas<i){
                return false;
            }
            mas=mas+i;
        }
        return true;
    }
}