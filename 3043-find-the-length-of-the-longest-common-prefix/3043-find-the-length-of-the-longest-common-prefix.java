class trie{
    trie(){
        root=new Node();
    }
    class Node{
        Node child[];
        boolean isEnd;
        Node(){
            child=new Node[10];
            boolean isEnd=false;
        }
    }
    Node root;
    void insert(String s){
        Node curr=root;
        for(int i=0;i<s.length();i++){
            int index=s.charAt(i)-'0';
            if(curr.child[index]==null){
                curr.child[index]=new Node();
            }
            curr=curr.child[index];
        }
        curr.isEnd=true;

    }
    int prefix(String s){
        Node curr=root;
        int c=0;
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
        trie t=new trie();
        for(int i:arr1){
            t.insert(Integer.toString(i));
        }
        int ans=Integer.MIN_VALUE;
        for (int i:arr2){
            ans=Math.max(ans,t.prefix(Integer.toString(i)));
        }
        return ans;
    }
}