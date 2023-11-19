import java.util.ArrayList;

public class DFS {
     // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] vis = new boolean[V];
        
        ans.add(0);
        vis[0] = true;
        
        dfsOfGraphHelper(adj, 0, ans,vis);
        return ans;
    }
    
    public void dfsOfGraphHelper(ArrayList<ArrayList<Integer>> adj, int src, ArrayList<Integer> ans,boolean[] vis){
           
        
        ArrayList<Integer> nbrs = adj.get(src);
        
        for(int v: nbrs){
            if(vis[v] == false){
                ans.add(v);
                vis[v] = true;
                dfsOfGraphHelper(adj, v,ans,vis);
            }
        }
        
        
    }

}
