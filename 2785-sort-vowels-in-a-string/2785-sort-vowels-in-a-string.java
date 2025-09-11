class Solution {
    public String sortVowels(String s) {
        StringBuilder v=new StringBuilder();
        for(Character i:s.toCharArray()){
            if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u'||i=='A'||i=='E'||i=='I'||i=='O'||i=='U'){
                v.append(i);
            }
        }
            char c[]=v.toString().toCharArray();
            Arrays.sort(c);
            StringBuilder ans=new StringBuilder();
              int j=0;
              for(Character i:s.toCharArray()){
                  if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u'||i=='A'||i=='E'||i=='I'||i=='O'||i=='U'){
              ans.append(c[j++]);
              continue;
            }
            ans.append(i);
              }
              return ans.toString();
        }
    }

