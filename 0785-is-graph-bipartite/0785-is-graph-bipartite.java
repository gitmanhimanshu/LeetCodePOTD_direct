import java.util.*;

class Solution {
    private static final int RED = 0;
    private static final int BLUE = 1;

    public boolean isBipartite(int[][] graph) {
        int[] check = new int[graph.length];
        Map<Integer, Set<Integer>> adjList = new HashMap<>();
        
        for (int i = 0; i < graph.length; i++) {
            adjList.put(i, new HashSet<>());
            for (int j : graph[i]) {
                adjList.get(i).add(j);
            }
        }
        
        Arrays.fill(check, -1);
        
        for (int i = 0; i < check.length; i++) {
            if (check[i] == -1 && !dfsCheck(check, i, adjList, RED)) {
                return false;
            }
        }
        return true;
    }
    
    private boolean dfsCheck(int[] check, int curr, Map<Integer, Set<Integer>> adjList, int color) {
        check[curr] = color;
        
        for (int neighbor : adjList.getOrDefault(curr, new HashSet<>())) {
            if (check[neighbor] == color) {
                return false;
            }
            if (check[neighbor] == -1 && !dfsCheck(check, neighbor, adjList, 1 - color)) {
                return false;
            }
        }
        return true;
    }
}
