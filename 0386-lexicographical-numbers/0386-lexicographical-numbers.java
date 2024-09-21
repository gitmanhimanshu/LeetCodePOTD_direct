class Solution {
    public List<Integer> lexicalOrder(int n) {
   List<Integer> him=new ArrayList<>();
       for(int i=1;i<=n;i++){
        him.add(i);
       } 
       Collections.sort(him,new Comparator<Integer>(){
        
            public int compare(Integer a,Integer b){
                String s1=a+","+b;
                String s2=b+","+a;
                return s1.compareTo(s2);
            }
       });
       return him;
    }
}