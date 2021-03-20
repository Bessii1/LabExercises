package com.company.Lab3.Assignment5;

public class Person {
    private String name;
    private String addres;
    private String telephone;

    public Person(String name, String addres, String telephone) {
        this.name = name;
        this.addres = addres;
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
