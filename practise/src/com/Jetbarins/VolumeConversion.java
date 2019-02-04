package com.Jetbarins;

import java.util.Scanner;

public class VolumeConversion {
    public static void main(String[] args) {
        int num = 0;
        double total = 0;
        double value = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Milliters to Fluid Ounce\n2.Fluid Ounce to Millitres\n3.Litre to Quarts\n4.Quarts to Litres\n");
        num = getting_inputs_from_user(sc);

        switch (num) {
            case 1:
                value = getting_inputs(sc);
                total = value * 0.035;
                System.out.printf("Your Conversion in Fluid Ounces : %.2f" , total);
                break;
            case 2:
                value = getting_inputs(sc);
                total = value * 28.413;
                System.out.printf("Your Conversion in Milliters : %.2f" ,total);
                break;
            case 3:
                value = getting_inputs(sc);
                total = value * 0.878;
                System.out.printf("Your Conversion in Quarts : %.2f" , total);
                break;
            case 4:
                value = getting_inputs(sc);
                total = value * 1.137;
                System.out.printf("Your Conversion in Litres : %.2f" , total);
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

