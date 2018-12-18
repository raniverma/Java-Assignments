package com.stackroute.practise1;

import java.util.Scanner;

public class practiseQ10 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        int num=sc.nextInt();
        String ans=str;
        String sub="";
        int n=num;
        for(int i=str.length()-1;n!=0 && i>=0;i--){
            sub+=str.charAt(i);
            n--;
        }
        StringBuilder sb=new StringBuilder(sub);
        sub=sb.reverse().toString();
        while(num!=0){
            ans+=sub;
            num--;
        }
        System.out.println(ans);
    }
}
