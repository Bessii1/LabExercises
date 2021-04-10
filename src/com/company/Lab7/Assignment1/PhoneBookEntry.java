package com.company.Lab7.Assignment1;

import java.util.ArrayList;

public class PhoneBookEntry {
    private String name;
    private String phoneNumber;

    public PhoneBookEntry(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "PhoneBookEntry{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
class Main{
    public static void main(String[] args) {
        ArrayList<PhoneBookEntry> arrayList = new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
            String name = "Person "+(i+1);
            String phoneNumber= "04354427"+(i+1);
            arrayList.add(new PhoneBookEntry(name,phoneNumber));
        }
//        System.out.println(arrayList);
        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("For each version");
        System.out.println("------------------------");
        for (PhoneBookEntry x :arrayList) {
            System.out.println(x);
        }

    }

}
