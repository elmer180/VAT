package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cash = 0;
        String cont = "yes";
        double cashvat = 0;
        boolean using = true;
        final double vat = (double) 1.2;
        while (using == true) {
            System.out.println("enter your cash value");
            cash = input.nextInt();
            cashvat =(cash * vat);
            System.out.println("your price + VAT is £"+cashvat);
            System.out.println("do you want to enter another sum of money?say yes to continue");
            cont = input.next();
            if(!cont.equalsIgnoreCase("yes")) {
               using= false;
            }
        }
    }
}
