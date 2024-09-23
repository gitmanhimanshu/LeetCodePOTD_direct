class MyHashSet {
Set<Integer> him;
    public MyHashSet() {
        him=new HashSet<>();
    }
    
    public void add(int key) {
        him.add(key);
    }
    
    public void remove(int key) {
        if(him.contains(key)){
            him.remove(key);
        }
    }
    
    public boolean contains(int key) {
        return him.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */