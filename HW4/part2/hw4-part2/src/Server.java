
import java.io.Serializable;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.*; 




public class Server extends UnicastRemoteObject implements RmiInterface,Serializable{
    private static final long serialVersionUID = 1L;
   
    protected Server() throws RemoteException {
        super();
    }

    public String connectedS(String name) throws RemoteException{
        System.out.println(name+" Client Connected");
        return "Client accessed server";
    }
    public double[][] computeIncideMatrix(int vertice,int edge,String[] vertices,String []sourceVertice,String []destVertice,double []edgeWeigth) throws RemoteException{
        Graph graph=new Graph(vertice,edge);
        graph.setVertex(vertices);
        for(int i=0;i<sourceVertice.length;++i){
            graph.makeEdge(sourceVertice[i],destVertice[i],edgeWeigth[i]);
        }

        return graph.getIncidence_matrix();

    }
    public String MinimumSpanningTree(Graph graph)throws RemoteException{
        graph.KruskalMST();
        return graph.output;
    } 

    public static void main(String[] args){
        try {

            Naming.rebind("//localhost/MyServer", new Server());
            System.err.println("Server ready all time");
    

        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}

