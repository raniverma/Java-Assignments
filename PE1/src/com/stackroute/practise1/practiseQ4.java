package com.stackroute.practise1;

import java.util.Scanner;

public class practiseQ4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        if(n==0)
            System.out.print("error");
        int val=1;
        for(int i=1;i<=n;i++){
            int count=0;
            for(int j=i;j<=i;) {
                if(count>=j)
                    break;
                else {
                    System.out.print(j + " ");
                    count++;
                }
            }
        }
    }
}
