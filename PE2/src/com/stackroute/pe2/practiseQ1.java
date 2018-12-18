package com.stackroute.pe2;

import java.util.Scanner;

public class practiseQ1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        practiseQ1 obj=new practiseQ1();
        System.out.println(obj.reverse(str));
        if(obj.reverse(str).equals(str)){
            System.out.println("String is palindrome");
        }
        else
            System.out.println("String is not a palindrome");


    }
    /*method to reverse the string*/
    public String reverse(String str){
        for(int i=str.length()-1;i>=0;i--){
            str+=str.charAt(i);
        }
        str=str.substring(str.length()/2,str.length());
        return str;
    }
}
