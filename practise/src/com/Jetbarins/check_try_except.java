package com.Jetbarins;
import java.util.Scanner;

public class check_try_except {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int c=1;
        int num = 0;
        while (c == 1) {
            try {
                System.out.println("enter a number");
                num = Integer.parseInt(scan.nextLine());
                c=2;
            } catch (Exception e) {
                System.out.println("enter a Number please : ");
            }
        }
    }
}
