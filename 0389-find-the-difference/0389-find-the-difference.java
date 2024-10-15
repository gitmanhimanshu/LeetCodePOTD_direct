class Solution {
    public char findTheDifference(String s, String t) {
//       HashMap<Character,Integer> him=new HashMap<>();
//       for(char i:s.toCharArray()){
//         him.put(i,him.getOrDefault(i,0)+1);

//       }
//       for(char i:t.toCharArray()){
//         if(!him.containsKey(i)){
//             return i;
//         }
//          him.put(i,him.getOrDefault(i,0)-1);
//          if(him.get(i)==0){
//             him.remove(i);
//          }
//       }
//       return ' ';
        int a[]=new int[26];
        for(char i:t.toCharArray()){
            a[i-'a']++;
        }
         for(char i:s.toCharArray()){
            a[i-'a']--;
        }
    for(int i=0;i<a.length;i++){
        if(a[i]!=0){
            return (char)(i+'a');
        }
    }
        return ' ';
    }
}