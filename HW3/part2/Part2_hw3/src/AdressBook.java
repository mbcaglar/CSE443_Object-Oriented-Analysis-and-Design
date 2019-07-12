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
import java.util.List;

public class AdressBook {
    private List<EmailAdress> myEmailList = new ArrayList<EmailAdress>();

    public AdressBook(List<EmailAdress> myEmailList) {
        this.myEmailList = myEmailList;
    }

    public void addEmailAddress(EmailAdress mail){
        myEmailList.add(mail);
    }

    public void removeMailAddress(EmailAdress mail){
        myEmailList.remove(mail);
    }

    public void printMyMailList(){
        for (EmailAdress e : myEmailList) {
            System.out.println("**************************************************************************");
            e.print();
        }
    }
}