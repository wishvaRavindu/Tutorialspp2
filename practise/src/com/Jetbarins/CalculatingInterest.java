package com.Jetbarins;
import java.util.Scanner;
public class CalculatingInterest {
    public static void main(String[] args) {
        double deposite = 0;
        double interest = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the amount of money you want to deposite : ");
        deposite = scan.nextDouble();
        if(deposite<10000){
            System.out.println("Minimum deposite 10,000");
        }
        else if (deposite >= 10000 && deposite <= 24999.99){
            System.out.println("Rate : "+2.76);
            interest = (deposite/100)*2.76;
            System.out.printf("Interest : %.2f",interest);
        }
        else if (deposite >= 25000 && deposite <= 49999.99){
            System.out.println("Rate : "+3.16);
            interest = (deposite/100)*3.16;
            System.out.printf("Interest : %.2f",interest);
        }
        else if (deposite >= 50000 && deposite <= 250000){
            System.out.println("Rate : "+3.20);
            interest = (deposite/100)*3.20;
            System.out.printf("Interest : %.2f",interest);
        }
        else {
            System.out.println("Maximum deposite value is 250,000");
        }
    }
}
