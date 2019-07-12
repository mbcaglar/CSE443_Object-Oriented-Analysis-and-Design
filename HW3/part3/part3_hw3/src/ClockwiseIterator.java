/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BEDO
 */
import java.util.ArrayList;
import java.util.Iterator;
public class ClockwiseIterator implements Iterator{
    private ArrayList<Integer> mydata;
    private Iterator iter=null;
    public ClockwiseIterator(int[][] data){
        mydata=new ArrayList<Integer>();
        int m=data.length;
        int n=data[0].length;
        int x=0;
        int y=0;
        while(m>0 && n>0){
            if(m==1){
                for(int i=0; i<n; ++i){
                    mydata.add(data[x][y+1]);
                }
                break;
            }else if(n==1){
                for(int i=0; i<m; ++i){
                    mydata.add(data[x+1][y]);
                }
                break;
            }
            for(int i=0; i<n-1; i++){
                mydata.add(data[x][y]);
                y++;
            }

            for(int i=0; i<m-1; i++){
                mydata.add(data[x][y]);
                x++;
            }

            for(int i=0; i<n-1; i++){
                mydata.add(data[x][y]);
                y--;
            }

            for(int i=0; i<m-1; i++){
                mydata.add(data[x][y]);
                x--;
            }
            x++;
            y++;
            m=m-2;
            n=n-2;
        }
        iter=mydata.iterator();
    }
    public Object next(){
       return iter.next();
    }
    public  boolean hasNext(){
        return iter.hasNext();
    }

}