/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BEDO
 */
public class Part3_hw3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Form form=new Form();
        form.setVisible(true);
        
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        ClockwiseIterator myIterator=new ClockwiseIterator(arr);
        while(myIterator.hasNext())
            System.out.println(myIterator.next());
        }   
}
