class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> him = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            him.add(new ArrayList<>());
        }
        int in[] = new int[numCourses];
        for (int a[] : prerequisites) {
            him.get(a[0]).add(a[1]);
            in[a[1]]++;
        }
        System.out.println(Arrays.toString(in));
        Queue<Integer> h = new LinkedList<>();
        for (int i = 0; i < in.length; i++) {
            if (in[i] == 0) {
                h.add(i);
            }
        }
        int c = h.size();
        System.out.println(c);
        while (!h.isEmpty()) {
            int ele=h.poll();
            System.out.println(ele);
            System.out.println(him.get(ele));
            for(int i:him.get(ele)){
                in[i]--;
                System.out.println(in[i]);
                if(in[i]==0){
                    c++;
                    h.add(i);
                }
            }
        }
        return c==numCourses;
    }
}