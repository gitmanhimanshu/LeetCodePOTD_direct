class Solution {

    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<Integer,List<String>> him=new HashMap<>();
        List<String> l1=Arrays.asList(list1);
        Map<String,Integer> l2=new HashMap<>();
        for(int i=0;i<list2.length;i++){
            l2.put(list2[i],i);
        }
  //      List<String> l2=new ArrayList<>();
        // for(String i: list1){
        //     l1.add(i);
        // }
       
        int min=Integer.MAX_VALUE;
        for(int i=0;i<l1.size();i++){
           if(l2.containsKey(l1.get(i))){
            int j=l2.get(l1.get(i));
            int n=i+j;
            if(!him.containsKey(n)){
                him.put(n,new ArrayList<>());
            }
            him.get(n).add(l1.get(i));
            if(min>n){
                min=n;
            }
           }
        }
       
        List<String> ans=him.get(min);
        
        return ans.toArray(new String[0]);
    }
}