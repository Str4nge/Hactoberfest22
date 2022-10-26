package Graphs;
import java.util.*;
public class Dijkstra_Algo {
    /*
       So what is Dijkstra's Algorithm?
       --> When the source and destination is given and we have to find out the shortest path in the directed weighted graph
           Dijkstra come into picture. (IMPORTANT - It is not possible in negative weight graphs

           How to implement it ?
           We have to use min heap Priority Queue so that shortest distance get saved in the top

           Time Complexity - E log V
           Now lets code it

     */
    public static void main(String[] args) {
        int V = 5;
        int source = 0;

        // Adjacency list representation of the
        // connected edges by declaring List class object
        // Declaring object of type List<Node>
        ArrayList<ArrayList<Node> > adj
                = new ArrayList<ArrayList<Node> >();

        // Initialize list for every node
        for (int i = 0; i < V; i++) {
            ArrayList<Node> item = new ArrayList<Node>();
            adj.add(item);
        }

        // Inputs for the GFG(dpq) graph
        adj.get(0).add(new Node(1, 9));
        adj.get(0).add(new Node(2, 6));
        adj.get(0).add(new Node(3, 5));
        adj.get(0).add(new Node(4, 3));

        adj.get(2).add(new Node(1, 2));
        adj.get(2).add(new Node(3, 4));

        ShortestPath ob = new ShortestPath();
        int[] dist = ob.dijkstra(V,adj,source);
        for (int i:dist)
        {
            System.out.print(i+ " ");
        }


    }
}


class Node{
    int node,dist;
    public Node(int node , int dist)
    {
        this.dist = dist;
        this.node = node;
    }
}