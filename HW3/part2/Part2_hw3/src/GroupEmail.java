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
import java.util.List;

public class GroupEmail extends EmailAdress{
    private String mail;
    private String name;
    private String surname;
    private List<EmailAdress> mailList;

    public GroupEmail(String mail, String name, String surname) {
        this.mail = mail;
        this.name = name;
        this.surname = surname;
        this.mailList = new ArrayList<EmailAdress>();
    }

    @Override
    public String getMail() {
        return mail;
    }

    @Override
    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }


    public EmailAdress getEmail(int i) {
        return mailList.get(i);
    }


    public void addEmail(EmailAdress mail) {
        mailList.add(mail);
    }

    public void removeEmail(EmailAdress mail) {
        mailList.remove(mail);
    }

    @Override
    public void print() {

        System.out.println("This is a group: " + this.getMail() + " - " + getName() + " " + getSurname());//+"\n--------------------------------------------------------------------------");
        Iterator iterator=mailList.iterator();
        while(iterator.hasNext()){
            EmailAdress e=(EmailAdress)iterator.next();
            System.out.print("      ");
            e.print();
        }
        System.out.println("--------------------------------------------------------------------------");

    }
}