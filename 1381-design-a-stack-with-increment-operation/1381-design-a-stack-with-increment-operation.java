class CustomStack {
int a[];
    int top;
    int ele;
    int size;
    public CustomStack(int maxSize) {
        a=new int[maxSize];
        top=-1;
        ele=0;
        size=maxSize;
    }
    
    public void push(int x) {
        if(ele<size){
            a[++top]=x;
            ele++;
        }
    }
    
    public int pop() {
        if(top!=-1){
            int x=a[top];
            top--;
            ele--;
            return x;
        }
        return -1;
    }
    
    public void increment(int k, int val) {
        k=Math.min(k,top+1);
        for(int i=0;i<k;i++){
            a[i]+=val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */