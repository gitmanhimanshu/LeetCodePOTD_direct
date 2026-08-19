class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> him=new LinkedList<>();
        Set<String> vis=new HashSet<>();
        int l=0;
        if(!wordList.contains(endWord)){
            return l;
        }
        Set<String> h=new HashSet<>(wordList);
        him.add(beginWord);
        while(!him.isEmpty()){
            int n=him.size();
            l++;
            for(int i=1;i<=n;i++){
                String t=him.poll();
                char c[]=t.toCharArray();
                for(int j=0;j<t.length();j++){
                    char old=c[j];
                    for(char k='a';k<='z';k++){
                        c[j]=k;
                    String new1=new String(c);
                    if(new1.equals(endWord)){
                        return l+1;
                    }
                    if(!vis.contains(new1)&&h.contains(new1)){
                        him.add(new1);
                        vis.add(new1);
                    }
                    }
                    c[j]=old;
                }
            }
        }
        return 0;
    }
}