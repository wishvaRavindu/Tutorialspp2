package com.Jetbarins;

import java.util.Scanner;

public class GeomatryCircleArea {
    public static void main(String[] args) {
        int num = 0;
        double area = 0;
        double value = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Calculating Area of the Circle\n2.Calculating the Circumference of circle\n");
        num = getting_inputs_from_user(sc);

        switch (num) {
            case 1:
                value = getting_inputs(sc);
                area = 3.1416*(value*value);
                System.out.printf("Area of the circle : %.2f" , area);
                break;
            case 2:
                value = getting_inputs(sc);
                area = 2*3.1416*value;
                System.out.printf("Circumference of the circle : %.2f" ,area);
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
                System.out.print("Enter the radius : ");
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
                System.out.print("Enter what you want to Calculate : ");
                num = Integer.parseInt(sc.nextLine()) ;
                count = 2;
            } catch (Exception e) {
                System.out.println("Enter only Intergers \n");

            }
        }
        return num;
    }
}
