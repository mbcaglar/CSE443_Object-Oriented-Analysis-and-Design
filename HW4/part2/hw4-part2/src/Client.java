
import java.io.Serializable;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.lang.management.ManagementFactory;
import java.util.Scanner;



public class Client implements Serializable{
    private static RmiInterface lookUp;

    public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {

        lookUp = (RmiInterface) Naming.lookup("//localhost/MyServer");

        String name = ManagementFactory.getRuntimeMXBean().getName();

        String str=lookUp.connectedS(name);
        System.out.println(str);
        int v=0,e=0;
        int choice ;
        Scanner sc = new Scanner(System.in);

        System.out.println("---This is Client's Menu---");
        do{
            System.out.println("1. Given a graph it returns the minimum spanning tree");
            System.out.println("2. The incidence matrix corresponding to the given graph");
            System.out.println("0. Quit");
            System.out.print("--> ");
            choice = sc.nextInt();
            if(choice==0){
                break;
            }
            
            if(choice==1){
                    int V = 4; 
                    int E = 6;  
                    Graph graph = new Graph(V, E); 

                    graph.edge[0].src = 0; 
                    graph.edge[0].dest = 1; 
                    graph.edge[0].weight = 3; 

                    graph.edge[1].src = 0; 
                    graph.edge[1].dest = 2; 
                    graph.edge[1].weight = 7; 

                    graph.edge[2].src = 0; 
                    graph.edge[2].dest = 3; 
                    graph.edge[2].weight = 6; 


                    graph.edge[3].src = 1; 
                    graph.edge[3].dest = 2; 
                    graph.edge[3].weight = 11; 

                    graph.edge[4].src = 1; 
                    graph.edge[4].dest = 3; 
                    graph.edge[4].weight = 7;
                    
                    graph.edge[5].src = 2; 
                    graph.edge[5].dest = 3; 
                    graph.edge[5].weight = 6;

                   String out=lookUp.MinimumSpanningTree(graph);
                   System.out.println(out);
            }
            
            if(choice==2){

                    double [][]incideMatrix;
                    try {
                        System.out.println(" Enter the number of vertices: ");
                        v = sc.nextInt();
                        System.out.println(" Enter the number of edges: ");
                        e = sc.nextInt();

                        String []vertices=new String[v];
                        System.out.println(" Enter the vertices: ");
                        for(int i=0;i<v;i++){
                            vertices[i]=(String) sc.next();
                        }

                        String []sourceVertice=new String[e];
                        String []destVertice=new String[e];
                        double []edgeWeigth=new double[e];
                        for(int i=0;i<e;++i){
                            System.out.println(" Enter "+(i+1)+".edge");
                            System.out.println(" --enter source vertex");
                            sourceVertice[i]=sc.next();
                            System.out.println(" --enter destination vertex");
                            destVertice[i]=sc.next();
                            System.out.println(" --Enter the "+(i+1)+".edge"+" weigth");
                            edgeWeigth[i]=sc.nextDouble();

                        }
                        incideMatrix= lookUp.computeIncideMatrix(v,e,vertices,sourceVertice,destVertice,edgeWeigth) ;

                        System.out.println("Your Graph is ");
                        showEdge(vertices,incideMatrix);


                    }catch (Exception E)
                    {
                        System.out.println("Somthing went wrong");
                        return;
                    }


                }
            if(choice!=1 && choice!=2){
                 System.out.println("Sorry,Please enter number 0-1-2");
            }
            
            System.out.println("");
        }while(choice!=0);
        sc.close();

    }
    public static void showEdge(String[] vertices,double [][]incideMatrix){

        int max=findMaxString(vertices);
        for(int m=0;m<2*max;m++)
            System.out.print(" ");

        for(int j=0;j<vertices.length;j++) {
            System.out.print(vertices[j] );
            for(int m=0;m<max+1;m++)
                System.out.print(" ");
        }

        System.out.println();
        for(int i=0;i<vertices.length;i++)
        {
            System.out.print(vertices[i]+" ");
            for(int m=0;m<max+1-vertices[i].length();m++)
                System.out.print(" ");
            for(int m=0;m<max+1;m++)
                System.out.print(" ");
            for(int j=0;j<vertices.length;j++) {
                System.out.print(incideMatrix[i][j]);
                for(int m=0;m<max+1;m++)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static int findMaxString(String[] str){
        int max=0;

        for(int i=0;i<str.length;i++)
            if (max < str[i].length())
                max = str[i].length();

        return max;
    }
}
