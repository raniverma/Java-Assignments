package com.stackroute.pe2;

import java.util.Scanner;

public class Factorial{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
          int num=sc.nextInt();
       /* long val=sc.nextLong();*/

        Factorial obj=new Factorial();
        System.out.println("Int Factorials: ");
        if(obj.longFactorial(num)==-1)
            System.out.println("The factorial of " + num + " is out of range.");
        else
        System.out.println("The Factorial of "+ num + " is " +obj.intFactorial(num));
       /* System.out.println("Long Factorials: ");
        if(obj.longFactorial(val)==-1)
            System.out.println("The factorial of " + val + " is out of range.");
        else
        System.out.println("The Factorial of "+ val + " is " +obj.longFactorial(val));*/
    }

    public int intFactorial(int number){
        int value=Integer.MAX_VALUE;
        if(number<0){
            System.out.println("Number should be non-negative");
        }
        int fact=1;
        for(int c=1;c<=number;c++){
            fact*=c;
        }

        if(fact<value)
            return -1;
        else
        return fact;
    }

    public long longFactorial(long number){
        long value=Long.MAX_VALUE;

        if(number<0){
            System.out.println("Number should be non-negative");
        }
        long fact=1;
        for(long c=1;c<=number;c++){
            fact*=c;
        }
        if(value>fact)
            return -1;
        else
        return fact;
    }

}
