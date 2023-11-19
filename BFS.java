// import java.util.ArrayList;
// import java.util.Queue;
// import java.util.function.Function;

// public class BFS {
//     / Function to return Breadth First Traversal of given graph.
//     public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
//         // Code here
//         Queue<Integer> queue = new LinkedList<>();
// 		boolean[] vis = new boolean[V];
// 		ArrayList<Integer> ans = new ArrayList<>();

// 		queue.add(0);
// 		vis[0] = true;

// 		while (queue.size() != 0) {
// 			int rem = queue.remove();

// 			ans.add(rem);


// 			for (int v : adj.get(rem)) {
// 				if (vis[v] == false) {
// 				    vis[v] = true;
// 					queue.add(v);
// 				}
// 			}
// 		}
		
// 		return ans;
//     }

}
