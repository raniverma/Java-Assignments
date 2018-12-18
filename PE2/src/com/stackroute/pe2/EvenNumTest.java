package com.stackroute.pe2;
import java.util.Scanner;

public class EvenNumTest {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println(isEven(number));
    }

    public static boolean isEven(int number){
        if(number%2==0)
            return true;
        else
            return false;
    }
}
