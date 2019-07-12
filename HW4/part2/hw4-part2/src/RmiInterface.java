import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RmiInterface extends Remote {
	public String connectedS(String name) throws RemoteException;
	public double[][] computeIncideMatrix(int vertice,int edge,String[] vertices,String []sourceVertice,String []destVertice,double []edgeWeigth) throws RemoteException;
        public String MinimumSpanningTree(Graph graph)throws RemoteException;
}