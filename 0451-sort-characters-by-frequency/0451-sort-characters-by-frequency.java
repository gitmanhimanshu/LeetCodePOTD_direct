class Solution {
    public String frequencySort(String s) {
   Map<Character,Integer> him=new HashMap<>();
        for(int i=0;i<s.length();i++){
            him.put(s.charAt(i),him.getOrDefault(s.charAt(i),0)+1);
        }
        int max=0;
        for(Character i: him.keySet()){
          int p=him.get(i);
            if(p>max){
                max=p;
            }
            }
        List<Character> [] a=new ArrayList[max+1];
        for(Character i: him.keySet()){
            if(a[him.get(i)]==null){
                a[him.get(i)]=new ArrayList<>();
            }
            a[him.get(i)].add(i);
        }
        StringBuilder ans=new StringBuilder();
        for(int i=a.length-1;i>=0;i--){
            if(a[i]!=null){
             for(char n:a[i]){
                 for(int k=0;k<i;k++){
                 ans.append(n);
             }
             }
            }
        }
        return ans.toString();
    }
}