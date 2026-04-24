class MyStack {
Deque<Integer> him;
    public MyStack() {
        him=new LinkedList<>();
    }
    
    public void push(int x) {
        him.addLast(x);
    }
    
    public int pop() {
    if(!empty()){
int a=him.removeLast();
 
 return a;
    }
    return -1;
    }
    
    public int top() {
        if(!empty()){
int a=him.removeLast();
 him.addLast(a);
 return a;

    }
     return -1;
    }
    
    public boolean empty() {
        return him.size()==0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */