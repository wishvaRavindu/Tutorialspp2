package com.Jetbarins;
import java.util.Scanner;

public class CheckingCharacters {
    public static void main(String[] args) {
        char charcters = 'y';
        char userInput = 'y';
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the character : ");
        try{
            userInput = scan.next(".").charAt(0);
            if(charcters == userInput){
                System.out.println("correct");
            }
            else{
                System.out.println("Incorrect");
            }
        }
        catch (Exception e){
            System.out.println("Enter only a character");
        }

    }
}
