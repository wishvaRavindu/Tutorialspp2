package com.Jetbarins;

import java.util.Scanner;

public class ConversionOfTemp {
    public static void main(String[] args) {
        int num = 0;
        double temp = 0;
        double value = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Celcius to Fahrenheit\n2.Fahrenheit to Celcius\n");
        num = getting_inputs_from_user(sc);

        switch (num) {
            case 1:
                value = getting_inputs(sc);
                temp = value*(9/5)+32;
                System.out.printf("Your Temperature in Fahrenhite : %.2f" , temp);
                break;
            case 2:
                value = getting_inputs(sc);
                temp = (value-32)*(5/9);
                System.out.printf("Your Temperature in Celcius : %.2f" ,temp);
                break;
            default:
                System.out.println("Inavlid Input");
        }
    }


    public static double getting_inputs(Scanner sc) {
        double value = 0;
        int count = 0;
        while (count != 1) {
            try {
                System.out.print("Enter the value you want to convert : ");
                value = Double.parseDouble(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Enter only Numbers \n");
            }
        }
        return value;
    }
    public static int getting_inputs_from_user(Scanner sc){
        int num = 0;
        int count = 1;
        while (count == 1) {
            try {
                System.out.print("Enter the Conversion option : ");
                num = Integer.parseInt(sc.nextLine()) ;
                count = 2;
            } catch (Exception e) {
                System.out.println("Enter only Intergers \n");

            }
        }
        return num;
    }
}
