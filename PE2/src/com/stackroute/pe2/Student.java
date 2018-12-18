package com.stackroute.pe2;

import java.util.Scanner;

public class Student {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int students=sc.nextInt();
        Student obj=new Student();
        obj.calculation(students);
    }

    public void calculation(int num){
        int sum=0,n=num;
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        while(num>0){
            Scanner sc=new Scanner(System.in);
            int grade=sc.nextInt();
            if(min>grade)
                min=grade;
            if(max<grade)
                max=grade;
            sum+=grade;
            num--;
        }
        System.out.println("The average is "+ sum/n);
        System.out.println("The minimum is "+ min);
        System.out.println("The maximum is "+ max);
    }
}
