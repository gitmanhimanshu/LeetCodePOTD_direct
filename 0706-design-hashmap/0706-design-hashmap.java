class MyHashMap {
    Map<Integer,Integer>him;

    public MyHashMap() {
        him=new HashMap<>();
    }
    
    public void put(int key, int value) {
        him.put(key,value);
    }
    
    public int get(int key) {
        if(!him.containsKey(key)){
            return -1;
        }
        return him.get(key);
    }
    
    public void remove(int key) {
         if(!him.containsKey(key)){
            return ;
        }
       him.remove(key); 
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */