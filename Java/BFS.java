
import java.util.*;
public class BFS {
    public static void main(String[] args) {
        /*
          Create a adjoin list at first not a adjoin matrix because if the row or col values are high it will fail to work
         */
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0 ; i<5 ; i++)
        {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(1).add(0);

        adj.get(0).add(2);
        adj.get(2).add(0);

        adj.get(0).add(3);
        adj.get(3).add(0);

        adj.get(2).add(4);
        adj.get(4).add(2);


        ArrayList<Integer> bfs = findBFS(5,adj);
        printAns(bfs);
    }
    public static ArrayList<Integer> findBFS(int data , ArrayList<ArrayList<Integer>> adj)
    {
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean visited[] = new boolean[data];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        visited[0] = true;
        int level = 0;

        while (!q.isEmpty())
        {
            Integer node = q.poll();
            bfs.add(node);

            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it

            for (Integer it:adj.get(node))
            {
                if(visited[it] == false)
                {
                    visited[it] = true;
                    q.add(it);
                }
                level++;
            }
        }
        return bfs;

    }
    static void printAns(ArrayList < Integer > ans) {
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
