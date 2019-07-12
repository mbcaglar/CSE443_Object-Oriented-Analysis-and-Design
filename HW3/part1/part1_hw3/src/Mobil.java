/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BEDO
 */
public class Mobil implements ModernPayment{

    @Override
    public int pay(String cardNo, float amount, String destination, String installments) {
       return (int)amount;
    }
    
}
