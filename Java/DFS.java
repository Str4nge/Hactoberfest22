package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DFS {
    public static void main(String[] args) {
        /*
          Create a adjoin list at first not a adjoin matrix because if the row or col values are high it will fail to work
         */
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            adj.add(new ArrayList < > ());
        }

        adj.get(1).add(2);
        adj.get(1).add(3);
        adj.get(1).add(4);
        adj.get(1).add(5);
        adj.get(2).add(4);
        adj.get(2).add(1);
        adj.get(3).add(1);
        adj.get(4).add(1);
        adj.get(4).add(2);
        adj.get(5).add(1);

        ArrayList<Integer> dfs = findDFS(5,adj);
        printAns(dfs);
    }
    public static ArrayList<Integer> findDFS(int data , ArrayList<ArrayList<Integer>> adj)
    {


        ArrayList<Integer> storedDFS = new ArrayList<>();
        boolean visited[] = new boolean[data+1];
        for (int i = 1; i<=data ;i++)
        {
            if(!visited[i])
            {
                dfs(i , adj , visited ,storedDFS );
            }
        }

        return storedDFS;

    }
    public static void dfs(int node , ArrayList<ArrayList<Integer>> adj , boolean[] visited , ArrayList<Integer> storedDFS)
    {
        storedDFS.add(node);
        visited[node] = true;

        for (Integer it:adj.get(node))
        {
            if(!visited[it])
            {
                dfs(it , adj , visited , storedDFS);
            }
        }
    }
    static void printAns(ArrayList < Integer > ans) {
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
