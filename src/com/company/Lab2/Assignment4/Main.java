package com.company.Lab2.Assignment4;

import com.company.Lab2.Assignment1.Employee;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n\n");
        System.out.println("Test of the RetailItem Class\n");

        RetailItem objR1 = new RetailItem("Jacket", 12, 59.95);
        RetailItem objR2 = new RetailItem("Designer Jeans", 40, 34.95);
        RetailItem objR3 = new RetailItem("Shirt", 20, 24.95);

        System.out.println("Description" + "\t" + "Units on Hand" + "\t" + "Price");
        System.out.println("-----------------------------------------------------------");
        System.out.println(objR1.getDescription() + "\t\t" + objR1.getUnitsOnHand() + "\t\t" + objR1.getPrice());
        System.out.println(objR2.getDescription() + "\t" + objR2.getUnitsOnHand() + "\t\t" + objR2.getPrice());
        System.out.println(objR3.getDescription() + "\t\t" + objR3.getUnitsOnHand() + "\t\t" + objR3.getPrice());
    }
}
