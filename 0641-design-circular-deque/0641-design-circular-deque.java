class MyCircularDeque {
    int a[];
    int f;
    int r;
    int ele;
    int size;

    public MyCircularDeque(int k) {
        a=new int[k];
        f=-1;
        r=-1;
        ele=0;
        size=k;
    }
    
    public boolean insertFront(int value) {
        if(isFull()){
            return false;
        }
        if(isEmpty()){
            f=0;
            r=0;
        }else{
            f=(f-1+size)%size;
        }
        a[f]=value;
        ele++;
        return true;
    }
    
    public boolean insertLast(int value) {
          if(isFull()){
            return false;
        }
        if(isEmpty()){
            f=0;
            r=0;
        }else{
            r=(r+1)%size;
        }
        ele++;
        a[r]=value;
        return true;
    }
    
    public boolean deleteFront() {
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
    
    public boolean deleteLast() {
         if(isEmpty()){
            return false;
        }
        if(f==r){
            f=r=-1;
        }else{
            r=(r-1+size)%size;
        }
        ele--;
        return true;
    }
    
    public int getFront() {
        if(isEmpty()){
            return -1;
        }
        return a[f];
    }
    
    public int getRear() {
         if(isEmpty()){
            return -1;
        }
        return a[r];
    }
    
    public boolean isEmpty() {
        return ele==0;
    }
    
    public boolean isFull() {
        return size==ele;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */