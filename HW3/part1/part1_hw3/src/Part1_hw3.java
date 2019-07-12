/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author BEDO
 */
public class Part1_hw3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Form form=new Form();
        form.setVisible(true);
        ModernPayment mobil = new Mobil(); 
        TurboPayment manuel = new Manuel(); 
        int tutar;

        TurboPayment modernAdapter = new ModernPaymentAdaptor(mobil); 
  
        System.out.println("With Modern Payment...");
        tutar=mobil.pay("141044073", 100, "Kuveyttürk Bankası", "1.Taksit"); 
        System.out.println("141044073 nolu müşteri 1.Taksit için : "+tutar+" TL ödedi.\n");
  
        System.out.println("With Turbo Payment...");
        tutar=manuel.payInTurbo("141044073", 100, "Kuveyttürk Bankası", "1.Taksit"); 
        System.out.println("141044073 nolu müşteri 1.Taksit için : "+tutar+" TL ödedi.\n");
  
        System.out.println("With Modern Payment Adaptor...");
        tutar=manuel.payInTurbo("141044073", 100, "Kuveyttürk Bankası", "1.Taksit"); 
        System.out.println("141044073 nolu müşteri 1.Taksit için : "+tutar+" TL ödedi.\n");

    }
    
}
