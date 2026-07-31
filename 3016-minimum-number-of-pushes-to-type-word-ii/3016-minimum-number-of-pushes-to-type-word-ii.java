class Solution {
    public int minimumPushes(String word) {
       Map<Character,Integer> him=new HashMap<>();
       for(Character c:word.toCharArray()){
        him.put(c,him.getOrDefault(c,0)+1);
       } 
       int ans=0;
         PriorityQueue<Integer> h=new PriorityQueue<>(Collections.reverseOrder());
       for(Integer j:him.values()){
h.add(j);
       }
  
int i=0;
while(!h.isEmpty()){
 ans+=h.poll()*((i/8)+1);
i++;
}

       return ans; 
    }
}