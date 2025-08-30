class RandomizedSet {
    
Map<Integer,Integer> him;
List<Integer> h;
    public RandomizedSet() {
      him=new HashMap<>();
      h=new ArrayList<>();

    }
    
    public boolean insert(int val) {
        if(him.containsKey(val)){
            return false;
        }
        him.put(val,h.size());
        h.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!him.containsKey(val)){
            return false;
        }
        int ind=him.get(val);
        int c=h.get(h.size()-1);
        h.set(ind,c);
        h.remove(h.size()-1);
        him.put(c,ind);
        him.remove(val);
        return true;
        
    }
    
    public int getRandom() {
     int c = (int)(Math.random() * h.size());
        return h.get(c);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */