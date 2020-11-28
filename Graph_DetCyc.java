import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
class Graph_DetCyc
{
    private final int V;
    private final List<List<Integer>> adj;
    public Graph_DetCyc(int V)
    {
        this.V = V;
        adj = new ArrayList<Integer>(V);
        for(int i=0; i<V; i++)
        {
            adj.add(new LinkedList<Integer>());
        }
    }
    private boolean isCycleUtil(int i , boolean[] visited , boolean[] recStack)
    {
        if(recStack[i])
        {
            return true;
        }
        if(visited[i])
        {
            return false;
        }
        visited[i] = true;
        
        recStack[i] = true;
        List<Integer>children = adj.get(i);
        for(Integer c: children)
        {
            if(isCycleUtil(c , visited , recStack))
            {
                return true;
            }
        }
        recStack[i] = false;
    }
    private void addEdge(int source , int dest)
    {
        adj.get(source).add(dest);
    }
    private boolean isCyclic()
    {
        boolean[] visited =  new boolean [V];
        boolean[] recStack =  new boolean [V];
        for(int i = 0; i < V; i++)
        {
            if(isCycleUtil(i , visited , recStack))
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        Graph_DetCyc g = new Graph_DetCyc();
        g.addEdge(0 , 1);
        g.addEdge(0 , 2);
        g.addEdge(1 , 2);
        g.addEdge(2 , 0);
        g.addEdge(2 , 3);
        g.addEdge(3 , 3);
        if(g.isCyclic())
        {
            System.out.println("Cyclic");
        }
        else
        {
            System.out.println("Acyclic");
        }
    }
}
        