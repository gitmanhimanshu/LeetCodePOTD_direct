class trie{
trie(){
    root=new Node();
}
       class Node{
Node child[];
boolean isEnd;
Node (){
    child=new Node[10];
    isEnd=false;
}
    }
     Node root;
    void insert(String s){
        Node curr=root;
        for(int i=0;i<s.length();i++){
            int ind=s.charAt(i)-'0';
            if(curr.child[ind]==null){
                curr.child[ind]=new Node();
            }
            curr=curr.child[ind];
        }
      curr.isEnd=true;
    }
    int prefix(String s){
        int c=0;
        Node curr=root;
        for(int i=0;i<s.length();i++){
             int ind=s.charAt(i)-'0';
            if(curr.child[ind]==null){
                break;
            }
            c++;
            curr=curr.child[ind];
        }
        return c;
    }
    
}


class Solution {
 
   
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        trie him=new trie();
        for(int i:arr1){
            him.insert(Integer.toString(i));
        }
        int ans=0;
        for(int i:arr2){
            ans=Math.max(ans,him.prefix(Integer.toString(i)));
        }
        return ans;
    }
}