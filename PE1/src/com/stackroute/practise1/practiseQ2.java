package com.stackroute.practise1;

import java.util.Scanner;

public class practiseQ2 {

    public static void main(String aregs[]){

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        if(n%2!=0 && (n>20 && n<30))
            System.out.println("Tom");
        else if(n%2==0 && (n>20 && n<30))
            System.out.println("Jerry");
        else
            System.out.println("Other");

    }
}
