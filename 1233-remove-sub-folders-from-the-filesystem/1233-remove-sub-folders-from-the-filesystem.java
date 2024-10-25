class trie {
    class Node {
        Node child[];
        boolean isLast;

        Node(){
            child=new Node[27];
            isLast=false;
        }

    }

    trie() {
        root = new Node();
    }
    Node root;
    boolean insert(String s){
        Node curr=root;
        for(int i=0;i<s.length();i++){
            int ind=s.charAt(i)=='/'?26:(s.charAt(i)-'a');
            if(curr.child[ind]==null){
                curr.child[ind]=new Node();
            }
            curr=curr.child[ind];
            if(curr.isLast==true){
               if(i+1<s.length()&&s.charAt(i+1)=='/'){
                return true;
               }
            }

        }
        curr.isLast=true;
        return false;
    }

}

class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder,(a,b)->{
            return a.length()-b.length();
        });
       List<String> him=new ArrayList<>();
       trie h=new trie();
       for(String i:folder){
        if(!h.insert(i)){
            him.add(i);
        }
       }
       return him;
    }
}