package com.Jetbarins;

public class EvaluatioQuestionOne {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        boolean result1 = true;
        boolean result2 = false;
        if (x <= 7){
            System.out.println(result1);
        }
        else {
            System.out.println(result2);
        }
        if(y!=3){
            System.out.println(result1);
        }
        else {
            System.out.println(result2);
        }
        if(2*y == x){
            System.out.println(result1);
        }
        else {
            System.out.println(result2);
        }
        if(!(x==y)){
            System.out.println(result1);
        }
        else {
            System.out.println(result2);
        }
        if((x <10) && (y > 0)){
            System.out.println(result1);
        }
        else {
            System.out.println(result2);
        }
        if((x < 10)||(y > 0)){
            System.out.println(result1);
        }
        else {
            System.out.println(result2);
        }
        if(++x > 10){
            System.out.println(result1);
        }
        else {
            System.out.println(result2);
        }
        if(!(x != 10)){
            System.out.println(result1);
        }
        else {
            System.out.println(result2);
        }
    }
}
