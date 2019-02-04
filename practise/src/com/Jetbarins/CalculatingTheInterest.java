package com.Jetbarins;
import java.util.Scanner;

public class CalculatingTheInterest {
    public static void main(String[] args) {
        double loan = 0;
        double rate = 0;
        int years = 0;
        double interest = 0;
        Scanner sc = new Scanner(System.in);
        loan = LoanValue(sc);
        rate = interest_rate(sc);
        years = Years(sc);
        interest = loan*(rate/100)*years;
        System.out.printf("Your interest will be : %.1f",interest);
    }


    public static double LoanValue(Scanner sc) {
        double loan = 0;
        int count = 0;
        while (count != 1) {
            try {
                System.out.print("Enter Loan Value : ");
                loan = Double.parseDouble(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Enter only Numbers \n");
            }
        }
        return loan;
    }
    public static double interest_rate(Scanner sc){
        double rate = 0;
        int count = 1;
        while (count == 1) {
            try {
                System.out.print("Enter your interest rate of the Loan : ");
                rate = Double.parseDouble(sc.nextLine()) ;
                count = 2;
            } catch (Exception e) {
                System.out.println("Enter only Intergers \n");

            }
        }
        return rate;
    }
    public static int Years(Scanner sc) {
        int years = 0;
        int count = 1;
        while (count == 1) {
            try {
                System.out.print("Enter your Loan duration in Months : ");
                years = Integer.parseInt(sc.nextLine());
                count = 2;
            } catch (Exception e) {
                System.out.println("Enter only Intergers \n");

            }
        }
        return years;
    }
}