class Solution {
    public List<List<Integer>> generate(int numRows) {
       
       List<List<Integer>> h=new ArrayList<>();
     
       List<Integer> dp=new ArrayList<>();
      
       dp.add(1);
       h.add(dp);
       for(int i=0;i<numRows-1;i++){
        List<Integer> a=new ArrayList<>();
        a.add(1);
                for(int j=1;j<=h.get(i).size()-1;j++){
                   a.add(h.get(i).get(j)+(h.get(i).get(j-1)));
                  
                }
                a.add(1);
                
             
          h.add(a);
              
        }
        return h;
    }
}