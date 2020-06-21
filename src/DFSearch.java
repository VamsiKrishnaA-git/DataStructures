import com.sun.corba.se.impl.orbutil.graph.Graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.io.*;
import java.util.*;

public class DFSearch {

        private int V; // No. of vertices

        // Array of lists for Adjacency List Representation
        private LinkedList<Integer> adj[];

        // Constructor
        DFSearch(int v)
        {
            V = v;
            adj = new LinkedList[v];
            for (int i=0; i<v; ++i)
                adj[i] = new LinkedList();
        }

        //Function to add an edge into the graph
        void addEdge(int v, int w)
        {
            adj[v].add(w); // Add w to v's list.
        }

        // A function used by DFS
        void DFSUtil(int v,boolean visited[])
        {
            // Mark the current node as visited and print it
            visited[v] = true;
            System.out.println(v+" ");

            // Recur for all the vertices adjacent to this vertex
            Iterator<Integer> i = adj[v].listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                    DFSUtil(n,visited);
            }
        }

        // The function to do DFS traversal. It uses recursive DFSUtil()
        void DFS()
        {
            boo lean visited[] = new boolean[V];
            int k=0;

            for (k=0; k<V; ++k)
                if (visited[k] == false) {
                    DFSUtil(k, visited);
                    System.out.println("---");
                }

             if (k>0)
                 System.out.println("Disconnected graph");
        }

        public static void main(String args[])
        {
            DFSearch g = new DFSearch(15);

            g.addEdge(0, 1);
            g.addEdge(0, 2);
            g.addEdge(1, 2);
            g.addEdge(2, 0);
            g.addEdge(2, 3);
            g.addEdge(3, 3);
            g.addEdge(10,11);
            g.addEdge(11,12);
            g.addEdge(12,14);
            System.out.println("Following is Depth First Traversal");

            g.DFS();
        }
    }
