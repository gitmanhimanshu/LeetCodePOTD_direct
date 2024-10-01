class Solution {
    public boolean canArrange(int[] arr, int k) {
        Map<Integer, Integer> him = new HashMap<>();
        
      
        for (int i : arr) {
            int d = i % k;
            if (d < 0) {
                d = d + k;  
            }
            him.put(d, him.getOrDefault(d, 0) + 1);
        }

   
        for (int i : him.keySet()) {
            int d = k - i;

            
            if (i == 0) {
                if (him.get(i) % 2 != 0) {
                    return false;
                }
            } 
          
            else if (i == d) {  
                if (him.get(i) % 2 != 0) {
                    return false;
                }
            } 
           
            else if (!him.containsKey(d) ||! him.get(i) .equals( him.get(d))) {
                return false;
            }
        }
        return true;
    }
}
