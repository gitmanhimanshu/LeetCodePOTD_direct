class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
           List<List<Integer>> him = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            him.add(new ArrayList<>());
        }
        int ans[]=new int[numCourses];
        int in[] = new int[numCourses];
        int l=0;
        for (int a[] : prerequisites) {
            him.get(a[1]).add(a[0]);
            in[a[0]]++;
        }
        // System.out.println(Arrays.toString(in));
        Queue<Integer> h = new LinkedList<>();
        for (int i = 0; i < in.length; i++) {
            if (in[i] == 0) {
                h.add(i);
                
            }
        }
        int c = h.size();
        // System.out.println(c);
        while (!h.isEmpty()) {
            int ele=h.poll();
            ans[l++]=ele;
            // System.out.println(ele);
            // System.out.println(him.get(ele));
            for(int i:him.get(ele)){
                in[i]--;
                // System.out.println(in[i]);
                if(in[i]==0){
                    c++;
                    h.add(i);
                }
            }
        }
        if(c<numCourses){
            return new int[0];
        }
        return ans;
    }
}