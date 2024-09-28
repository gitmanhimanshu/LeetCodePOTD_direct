class MyCircularQueue {

    int a[];
    int size;
    int ele;
    int f;
    int r;

    public MyCircularQueue(int k) {
        a=new int[k];
        f=-1;
        r=-1;
        ele=0;
        size=k;
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        if(f==-1&&r==-1){
            f=0;
            r=0;
        }
        else {
            r=(r+1)%size;
        }
        a[r]=value;
        ele++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        if(f==r){
            f=r=-1;
        }else{
            f=(f+1)%size;
        }
        ele--;
        return true;
    }
    
    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return a[f];
    }
    
    public int Rear() {
         if(isEmpty()){
            return -1;
        }
        return a[r];
    }
    
    public boolean isEmpty() {
        return ele==0;
    }
    
    public boolean isFull() {
        return ele==size;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */