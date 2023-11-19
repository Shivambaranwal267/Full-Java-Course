import java.util.ArrayList;

public class ConnectedComponents {

  class Solution {

    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
      //adjacency matrix to adjacency list
      ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
      for (int i = 0; i < V; i++) {
        graph.add(new ArrayList<>());
      }

      for (int i = 0; i < V; i++) {
        for (int j = 0; j < adj.get(i).size(); j++) {
          if (adj.get(i).get(j) == 1) {
            graph.get(i).add(j);
            graph.get(j).add(i);
          }
        }
      }

      boolean[] vis = new boolean[V];
      int count = 0;

      for (int i = 0; i < V; i++) {
        if (vis[i] == false) {
          dfsOfGraphHelper(graph, i, vis);
          count++;
        }
      }

      return count;
    }

    public static void dfsOfGraphHelper(
      ArrayList<ArrayList<Integer>> adj,
      int src,
      boolean[] vis
    ) {
      ArrayList<Integer> nbrs = adj.get(src);

      for (int v : nbrs) {
        if (vis[v] == false) {
          vis[v] = true;
          dfsOfGraphHelper(adj, v, vis);
        }
      }
    }
  }
}
