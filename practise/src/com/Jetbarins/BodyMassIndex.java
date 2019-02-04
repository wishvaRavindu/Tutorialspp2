package com.Jetbarins;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        double height = 0;
        double bodyMassIndex = 0;
        double weight = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculate Your Body Mass Index\n");
        height = getting_inputs_from_user(sc);
        weight = getting_inputs(sc);
        bodyMassIndex = (weight/(height*height));
        System.out.printf("Your BMI : %.1f",bodyMassIndex);
    }


    public static double getting_inputs(Scanner sc) {
        double weight = 0;
        int count = 0;
        while (count != 1) {
            try {
                System.out.print("Enter your weight : ");
                weight = Double.parseDouble(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Enter only Numbers \n");
            }
        }
        return weight;
    }
    public static double getting_inputs_from_user(Scanner sc){
        double height = 0;
        int count = 1;
        while (count == 1) {
            try {
                System.out.print("Enter your height : ");
                height = Double.parseDouble(sc.nextLine()) ;
                count = 2;
            } catch (Exception e) {
                System.out.println("Enter only Intergers \n");

            }
        }
        return height;
    }
}
