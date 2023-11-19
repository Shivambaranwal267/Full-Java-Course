import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class SourceToDEstinationGraph {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        
        for(int i=0;i<m;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        int src = sc.nextInt();
        int dest = sc.nextInt();
        
        boolean[] vis = new boolean[n];
        sourceToDestinationPath(graph,n,src,vis);
        
        System.out.println(vis[dest]);

        sc.close();
    }
    
    
    public static void sourceToDestinationPath(ArrayList<ArrayList<Integer>> graph,int n,int src,boolean[] vis){
        Queue<Integer> queue = new LinkedList<>();
        // ArrayList<Integer> ans = new ArrayList<>();

        queue.add(src);
        vis[src] = true;

        while (queue.size() != 0) {
            int rem = queue.remove();

            for (int v : graph.get(rem)) {
                if (vis[v] == false) {
                    vis[v] = true;
                    queue.add(v);
                }
            }
        }


    }
}

