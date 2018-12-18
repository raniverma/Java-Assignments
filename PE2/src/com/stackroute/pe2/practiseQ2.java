package com.stackroute.pe2;

import java.util.Scanner;
import java.lang.Math;

public class practiseQ2 {
    public static void main(String srgs[]){
        Scanner sc=new Scanner(System.in);
        int var=sc.nextInt();
        practiseQ2 obj=new  practiseQ2();

        if(obj.mylog(var,4)==(int)obj.mylog(var,4)){
            System.out.println("Number is power of 4");
        }
        else
            System.out.println("Number is not power of 4");
    }

    public double mylog(int a,int b){
        return(Math.log(a)/Math.log(b));
    }
}
