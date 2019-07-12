
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BEDO
 */
public class SolutionContext {
    private NumericalSolutionStrategy strategy;
    private static final double EPSILON = 1e-3;
   
    private double[][] myMatris;
    private static final int MAX_ITERATIONS = 100;
    private double[] cozum=new double[100];  
    private int satir_;
    private int sutun_;
    public String output;
    public boolean flag=true;

    SolutionContext(String filename) throws IOException {
       
         Oku(filename);
               
    }


    public void setSolution(NumericalSolutionStrategy strategy){
        this.strategy=strategy;
    }
    public void creatSolution(){
       strategy.Set_satir(satir_);
       strategy.Set_sutun(sutun_);
        strategy.denklem(myMatris,cozum);
        output=strategy.print_sonuc();
    }
      public void Oku(String filename) throws IOException ,FileNotFoundException{
        try{
            File file = new File(filename);
            Scanner scn = new Scanner(file);
            String arr[] = null;
            String line;
            double tmp[][]=new double[100][100];
            int count=-1;
            int j=0;
            
            while (scn.hasNextLine()) {
                
                count++;
                line=scn.nextLine();
                arr=line.split(",");
                
                int i;
                for( i=0; i<(arr.length)-1; i++){
                    
                    
                    tmp[count][i] =Double.parseDouble(arr[i]);
                    
                    
                }
                
                cozum[j]= Double.parseDouble(arr[(arr.length)-1]);
                
                j++;
                
            }
            satir_=count+1;
            sutun_=arr.length-1;
            
            myMatris=new double[satir_][sutun_];
            for (int i=0; i<satir_; ++i)
            {
                for (int k=0; k<sutun_; ++k)
                {
                    myMatris[i][k]=tmp[i][k];
                }
            }
            flag=true;
        }
        catch(FileNotFoundException a){
            a.toString();
            flag=false;
        }
        
        }
      public String display_matrix(){
        String output="";
        for (int i=0; i<satir_; ++i) 
        {
            for (int k=0; k<sutun_; ++k)
            {
                output+=String.format("  %.1f ", myMatris[i][k]);
              
            }
            output=output+"\n";
        }
         return output;
      }
      
       public String display_out(){
          String output="";
       
            for (int k=0; k<sutun_; ++k)
            {
                 output+=String.format("  %.1f \n", cozum[k]);
 
            }
            

         return output;
      }
       
    public int get_satir(){
        return satir_;
    }
    public int get_sutun(){
        return sutun_;
    }
    
}
