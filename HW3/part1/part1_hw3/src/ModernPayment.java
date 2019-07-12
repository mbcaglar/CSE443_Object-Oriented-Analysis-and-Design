/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BEDO
 */
public interface ModernPayment {
    int pay(String cardNo, float amount, String destination, String installments);
}
