
class Solution {
    public String frequencySort(String s) {

        Map<Character, Integer> him = new HashMap<>();
        for (char i : s.toCharArray()) {
            him.put(i, him.getOrDefault(i, 0) + 1);

        }

        int max=0;
        for(int i:him.values()){
            max=Math.max(i,max);
        }
        List<Character>[] arr=new ArrayList[max+1];
        for(Character i:him.keySet()){
            if(arr[him.get(i)]==null){
                arr[him.get(i)]=new ArrayList<>();
            }
            arr[him.get(i)].add(i);
        }
        StringBuilder sb=new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            if (arr[i]!=null)
            {
                for(Character c:arr[i]){
                    for(int l=1;l<=i;l++){
                        sb.append(c);
                    }
                }
            }       
             }
return sb.toString();
    }
}