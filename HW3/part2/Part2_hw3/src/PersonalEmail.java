/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BEDO
 */
public class PersonalEmail extends EmailAdress{
    private String mail;
    private String name;
    private String surname;

    public PersonalEmail(String mail, String name, String surname) {
        this.mail = mail;
        this.name = name;
        this.surname = surname;
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



    @Override
    public String toString() {
        return " "+getMail() + " " + getName() + " " + getSurname() ;
    }

    public void print() {
        System.out.println(this.toString());
    }
}