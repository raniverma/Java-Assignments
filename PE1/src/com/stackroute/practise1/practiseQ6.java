package com.stackroute.practise1;

import java.util.Scanner;

public class practiseQ6 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        char ch=sc.next().charAt(0);

        if(ch>='a'&&ch<='z'){
            System.out.println("Small letter");
        }
        else if(ch>='A'&&ch<='Z'){
            System.out.println("Capital letter");
        }
        else if(ch>='0' && ch<='9'){
            System.out.println("digit");
        }
        else
            System.out.println("Special symbol");
    }
}
