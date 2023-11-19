import java.util.ArrayList;
import java.util.Queue;

public class TopologicalSort {
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
        
        int indegree[] = new int[V];
        for(int i=0;i<V;i++){
            for(int v: adj.get(i)){
                indegree[v]++;
            }
        }
        
        Queue<Integer> q = new LinkedList<>();
        
        int topo[]= new int[V];
        
        for(int i=0;i<V;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        
        int i=0;
        while(!q.isEmpty()){
            int node=q.poll();
            topo[i++]= node;
            for(int v: adj.get(node)){
                indegree[v]--;
                if(indegree[v]==0){
                    q.add(v);
                }
            }
        }
        
        return topo;
    }

}
