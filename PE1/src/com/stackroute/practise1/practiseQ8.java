package com.stackroute.practise1;

import java.util.Scanner;

public class practiseQ8 {
    public static void main(String args[]){
        int target=100;
        Scanner sc=new Scanner(System.in);
        while(true) {
            int n = sc.nextInt();
            if (n < target) {
                System.out.println("Number guessed is less than original number.");
            }
            else if(n>target){
                System.out.println("Number guessed is more than original number.");
            }
            else  if(n==target){
                System.out.println("Number guessed matches the original number.");
                break;
            }
        }

    }
}
