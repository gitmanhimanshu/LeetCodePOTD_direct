class Solution {
    Map<Integer,Set<Integer> >him;
    boolean isAvailable(int r,int a,int b,int c,int d){
        return !him.get(r).contains(a)&&!him.get(r).contains(b)&&!him.get(r).contains(c)&&!him.get(r).contains(d);
    }
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        him=new HashMap<>();
        for(int a[]:reservedSeats){
            if(him.get(a[0])==null){
                him.put(a[0],new HashSet<>());
            }
            him.get(a[0]).add(a[1]);
        }
       int r = (n - him.size()) * 2;
        for(int i:him.keySet()){
            boolean groupA=isAvailable(i,2,3,4,5);
            boolean groupB=isAvailable(i,4,5,6,7);
            boolean groupC=isAvailable(i,6,7,8,9);
            if(groupA && groupC){
                r+=2;
            }else if(groupA || groupB ||groupC){
                r++;
            }
        }
        return r;
        
    }
}