class MyLinkedList {
    LinkedList<Integer> him;

    public MyLinkedList() {
        him=new LinkedList<>();
    }
    
    public int get(int index) {
       if(index<him.size()){
           return him.get(index);
       }
       return -1; 
    }
    
    public void addAtHead(int val) {
        him.addFirst(val);
    }
    
    public void addAtTail(int val) {
        him.addLast(val);
    }
    
    public void addAtIndex(int index, int val) {
       if(index<=him.size()){
 him.add(index,val);
       }
    }
    
    public void deleteAtIndex(int index) {
        if(index<him.size())
       { him.remove(index);}
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */