import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
public class Graph implements Serializable
{ 
    
    public double[][] incidence_matrix;
    public String []vertex;
    public String output="";
    
    // A class to represent a graph edge 
    public class Edge implements Comparable<Edge> ,Serializable
    { 
        int src, dest, weight; 
  
        // Comparator function used for sorting edges  
        // based on their weight 
        public int compareTo(Edge compareEdge) 
        { 
            return this.weight-compareEdge.weight; 
        } 
    }; 
  
    // A class to represent a subset for union-find 
    public class subset 
    { 
        int parent, rank; 
    }; 
  
    int V, E;    // V-> no. of vertices & E->no.of edges 
    Edge edge[]; // collection of all edges 
  
    // Creates a graph with V vertices and E edges 
    public Graph(int v, int e) 
    { 
        incidence_matrix = new double[v][v];
        vertex=new String[v];
        V = v; 
        E = e; 
        edge = new Edge[E]; 
        for (int i=0; i<e; ++i) 
            edge[i] = new Edge(); 
    } 
  
    // A utility function to find set of an element i 
    // (uses path compression technique) 
    public int find(subset subsets[], int i) 
    { 
        // find root and make root as parent of i (path compression) 
        if (subsets[i].parent != i) 
            subsets[i].parent = find(subsets, subsets[i].parent); 
  
        return subsets[i].parent; 
    } 
  
    // A function that does union of two sets of x and y 
    // (uses union by rank) 
    public void Union(subset subsets[], int x, int y) 
    { 
        int xroot = find(subsets, x); 
        int yroot = find(subsets, y); 
  
        // Attach smaller rank tree under root of high rank tree 
        // (Union by Rank) 
        if (subsets[xroot].rank < subsets[yroot].rank) 
            subsets[xroot].parent = yroot; 
        else if (subsets[xroot].rank > subsets[yroot].rank) 
            subsets[yroot].parent = xroot; 
  
        // If ranks are same, then make one as root and increment 
        // its rank by one 
        else
        { 
            subsets[yroot].parent = xroot; 
            subsets[xroot].rank++; 
        } 
    } 
  
    // The main function to construct MST using Kruskal's algorithm 
    public void KruskalMST() 
    { 
        Edge result[] = new Edge[V];  // Tnis will store the resultant MST 
        int e = 0;  // An index variable, used for result[] 
        int i = 0;  // An index variable, used for sorted edges 
        for (i=0; i<V; ++i) 
            result[i] = new Edge(); 
  
        // Step 1:  Sort all the edges in non-decreasing order of their 
        // weight.  If we are not allowed to change the given graph, we 
        // can create a copy of array of edges 
        Arrays.sort(edge); 
  
        // Allocate memory for creating V ssubsets 
        subset subsets[] = new subset[V]; 
        for(i=0; i<V; ++i) 
            subsets[i]=new subset(); 
  
        // Create V subsets with single elements 
        for (int v = 0; v < V; ++v) 
        { 
            subsets[v].parent = v; 
            subsets[v].rank = 0; 
        } 
  
        i = 0;  // Index used to pick next edge 
  
        // Number of edges to be taken is equal to V-1 
        while (e < V - 1) 
        { 
            // Step 2: Pick the smallest edge. And increment  
            // the index for next iteration 
            Edge next_edge = new Edge(); 
            next_edge = edge[i++]; 
  
            int x = find(subsets, next_edge.src); 
            int y = find(subsets, next_edge.dest); 
  
            // If including this edge does't cause cycle, 
            // include it in result and increment the index  
            // of result for next edge 
            if (x != y) 
            { 
                result[e++] = next_edge; 
                Union(subsets, x, y); 
            } 
            // Else discard the next_edge 
        } 
  
        // print the contents of result[] to display 
        // the built MST 
        output+="Minimum Spanning Tree :\n"; 
        for (i = 0; i < e; ++i)
            output+=result[i].src+" -- " +result[i].dest+" == " + result[i].weight+"\n"; 
    } 
        
    public double[][] getIncidence_matrix() {
        return incidence_matrix;
    }
    public void setVertex(String[] vertex) {
        this.vertex = vertex;
    }
    public String[] getVertex() {
        return vertex;
    }
    public int findIndex(String key){

        for(int i=0;i<this.vertex.length;i++){
            if(key.equals(this.vertex[i]))
                return i;
        }
        return 0;
    }

    public void makeEdge(String src, String dst, double weigth)
    {
        try
        {
            int indx1=findIndex(src);
            int indx2=findIndex(dst);
            
            incidence_matrix[indx1][indx2] = weigth;
        }
        catch (ArrayIndexOutOfBoundsException index)
        {
            System.out.println("The vertices does not exists");
        }
    }

    public double getEdge(String src, String v)
    {
        try
        {
            int indx1=findIndex(src);
            int indx2=findIndex(v);
            return incidence_matrix[indx1][indx2];
        }
        catch (ArrayIndexOutOfBoundsException index)
        {
            System.out.println("The vertices does not exists");
        }
        return -1;
    }
  

} 