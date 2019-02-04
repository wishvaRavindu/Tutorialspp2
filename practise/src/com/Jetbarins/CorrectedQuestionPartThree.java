package com.Jetbarins;
import java.util.Scanner;
public class CorrectedQuestionPartThree {
    public static void main(String[] args) {
        int x ;
        Scanner input = new Scanner(System.in) ;
        System.out.print( "Enter an integer greater than zero: " ) ;
        x = input.nextInt() ;
        if (x == 0)
        {
            System.out.print( "Zero entered!\n" ) ;
        }

    }
}
