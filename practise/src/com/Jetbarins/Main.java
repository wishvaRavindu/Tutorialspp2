package com.Jetbarins;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num = 0;
        double total = 0;
        double value = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Centimeters to Inches\n2.Inches to Centimeters\n3.Meters to feet\n4.Foot to Meters\n" +
                "5.Miles to Kilometers\n6.Kilometers to Miles\n");
        num = getting_inputs_from_user(sc);

            switch (num) {
                case 1:
                    value = getting_inputs(sc);
                    total = value * 2.54;
                    System.out.printf("Your Conversion in Inches : %.2f" , total);
                    break;
                case 2:
                    value = getting_inputs(sc);
                    total = value * 0.393;
                    System.out.printf("Your Conversion in Centimeters : %.2f" ,total);
                    break;
                case 3:
                    value = getting_inputs(sc);
                    total = value * 0.305;
                    System.out.printf("Your Conversion in Foot : %.2f" , total);
                    break;
                case 4:
                    value = getting_inputs(sc);
                    total = value * 3.281;
                    System.out.printf("Your Conversion in Meters : %.2f" , total);
                    break;
                case 5:
                    value = getting_inputs(sc);
                    total = value * 1.609;
                    System.out.printf("Your Conversion in Kilometers : %.2f" ,total);
                    break;
                case 6:
                    value = getting_inputs( sc);
                    total = value * 0.621;
                    System.out.printf("Your Conversion in Miles : %.2f" , total);
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