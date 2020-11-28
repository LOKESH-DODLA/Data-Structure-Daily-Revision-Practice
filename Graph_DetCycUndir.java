import java.util.*;
class Graph_DetCycUndir
{
    int V, E;
    Edge edge[];
    class Edge
    {
        int src , dest;
    }
    Graph_DetCycUndir(int v , int e)
    {
        V = v;
        E = e;
        edge = new Edge[E];
        for(int i=0; i<e; i++)
        {
            edge[i] = new Edge();
        }
    }
    int find(int parent[] , int i)
    {
        if(parent[i] == -1)
        {
            return i;
        }
        return find(parent , parent[i]);
    }
    void Union (int parent[] , int x , int y)
    {
        int xset = find(parent , x);
        int yset = find(parent , y);
        parent[xset] = yset;
    }
    int isCycle(Graph_DetCycUndir graph)
    {
        int parent[] = new int[graph.V];
        for(int i=0; i<graph.V; i++)
        {
            parent[i] = -1;
        }
        for(int i=0; i < graph.E; i++)
        {
            int x = graph.find(parent , graph.edge[i].src);
            int y = graph.find(parent , graph.edge[i].dest);
            if(x == y)
            {
                return 1;
            }
            graph.Union(parent, x, y);
            
        }
        return 0;
    }
    public static void main(String args[])
    {
        int V = 3 , E = 3;
        Graph_DetCycUndir g = new Graph_DetCycUndir(V , E);
        g.edge[0].src = 0;
        g.edge[0].dest = 1;
        g.edge[1].src = 1;
        g.edge[1].dest = 2;
        g.edge[2].src = 0;
        g.edge[2].dest = 2;
        if(g.isCycle(g) == 1)
        {
            System.out.println("Cyclic ");
        }
        else
        {
            System.out.println("Acyclic");
        }
    }
}
    