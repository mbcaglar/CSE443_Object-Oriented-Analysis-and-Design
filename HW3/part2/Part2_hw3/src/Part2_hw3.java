
import java.util.ArrayList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BEDO
 */
public class Part2_hw3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Form form=new Form();
        form.setVisible(true);
        EmailAdress person1 = new PersonalEmail("bedirhan.caglar@gmail.com", "Bedirhan", "Caglar");
        EmailAdress person2 = new PersonalEmail("asiyegul@gmail.com", "Asiye", "Gul");
        EmailAdress person3 = new PersonalEmail("emrek@gmail.com", "Emre", "Kor");
        EmailAdress person4 = new PersonalEmail("ayse.varol@gmail.com", "Ayse", "Varol");

        EmailAdress person5 = new PersonalEmail("omerfrk@gtu.edu.tr", "Omer", "Ferk");
        EmailAdress person6 = new PersonalEmail("basak_babuz@gtu.edu.tr", "Basak", "Babuz");
        EmailAdress person7 = new PersonalEmail("seyma14@gtu.edu.tr", "Seyma","Kiy");
        EmailAdress person8 = new PersonalEmail("furkanaktas@gtu.edu.tr", "Furkan", "Aktas");

        EmailAdress person9 = new PersonalEmail("mbcaglar@gtu.edu.tr", "Bedirhan", "Caglar");
        EmailAdress person10 = new PersonalEmail("hasaricelebi@gtu.edu.tr", "Hasari", "Celebi");
        EmailAdress person11= new PersonalEmail("yakupgenc@gtu.edu.tr", "Yakup", "Genc");
        EmailAdress university = new GroupEmail("gtu@gtu.edu.tr", "GEBZE TECHNICAL UNIVERSITY", "EMAIL LIST");
        EmailAdress other = new GroupEmail("myother@gtu.edu.tr", "2014 SEASON FRIENDS", "EMAIL LIST");
        EmailAdress home = new GroupEmail("homemail@gmail.com", "HOME", "EMAIL LIST");

        
        other.addEmail(person5);
        other.addEmail(person6);
        other.addEmail(person7);
        other.addEmail(person8);
        
        home.addEmail(person1);
        home.addEmail(person2);
        home.addEmail(person3);
        home.addEmail(person4);

        university.addEmail(person10);
        university.addEmail(person11);
        university.addEmail(other);
        AdressBook myAdressBook = new AdressBook(new ArrayList<EmailAdress>());

        myAdressBook.addEmailAddress(person9);
        myAdressBook.addEmailAddress(university);
        myAdressBook.addEmailAddress(home);


        myAdressBook.printMyMailList();

    }
    
}
