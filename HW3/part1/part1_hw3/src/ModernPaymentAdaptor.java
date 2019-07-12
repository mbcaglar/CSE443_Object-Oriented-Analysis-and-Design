/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BEDO
 */
public class ModernPaymentAdaptor implements TurboPayment{
    ModernPayment modern;
    public ModernPaymentAdaptor(ModernPayment modern){
        this.modern=modern;
        
    }

    @Override
    public int payInTurbo(String turboCardNo, float turboAmount, String destinationTurboOfCourse, String installmentsButInTurbo) {
       return modern.pay(turboCardNo, turboAmount, turboCardNo, installmentsButInTurbo);
    }
}
