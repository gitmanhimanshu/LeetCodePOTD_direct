class Solution {
    public int[] findOriginalArray(int[] changed) {
        Map<Integer, Integer> him = new HashMap<>();
        for (int i : changed) {
            him.put(i, him.getOrDefault(i, 0) + 1);
        }
        if(changed.length%2!=0){
            return new int[0];
        }
Arrays.sort(changed);
List<Integer> him1=new ArrayList<>();
for(int i:changed){
  if(him.get(i)==0){
    continue;
  }
  if(!him.containsKey(i*2)||him.get(i*2)==0){
    return new int[0];
  }
  him1.add(i);
 him.put(i, him.getOrDefault(i, 0) - 1);
  him.put(i*2, him.getOrDefault(i*2, 0) - 1);

}
int ans[]=new int[him1.size()];
int k=0;
for(Integer i:him1){
    ans[k++]=i;
}
return ans;
    }
}