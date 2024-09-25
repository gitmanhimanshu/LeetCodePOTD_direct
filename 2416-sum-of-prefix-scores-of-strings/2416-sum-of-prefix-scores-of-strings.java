class trie{
trie(){
    root=new Node();
}
       class Node{
Node child[];
boolean isEnd;
int c;
Node (){
    child=new Node[26];
    isEnd=false;
    c=0;
}
    }
     Node root;
    void insert(String s){
        Node curr=root;
        for(int i=0;i<s.length();i++){
            int ind=s.charAt(i)-'a';
            if(curr.child[ind]==null){
                curr.child[ind]=new Node();
            }
           
            curr=curr.child[ind];
             curr.c++;
        }
      curr.isEnd=true;
    }
    int prefix(String s){
        int c=0;
        Node curr=root;
        for(int i=0;i<s.length();i++){
             int ind=s.charAt(i)-'a';
            if(curr.child[ind]==null){
                break;
            }
          
            curr=curr.child[ind];
              c+=curr.c;
        }
        return c;
    }
    
}
class Solution {
    public int[] sumPrefixScores(String[] words) {
        int ans[]=new int[words.length];
        trie him=new trie();
        for(String i: words){
            him.insert(i);
        }
        int k=0;
        for(String i:words){
            ans[k++]=him.prefix(i);
        }
        return ans;
    }
}