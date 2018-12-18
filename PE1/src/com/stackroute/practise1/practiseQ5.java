package com.stackroute.practise1;

import java.util.Scanner;

public class practiseQ5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        String n=sc.nextLine();

        String arr[]=n.split(" ");

        long sum=0;
        int flag=0;

        for(int i=0;i<arr.length;i++){
            String str=arr[i];
            for(int j=0;j<str.length();j++){
                if((str.charAt(j)>='a'&&str.charAt(j)>='z')||(str.charAt(j)>='A'&&str.charAt(j)>='Z')){
                    flag=1;
                }
                if(flag==1){
                    System.out.println("Error,The number is not an integer.");
                    break;
                }

            }
            if(flag==1)
                break;
            else
            {
                sum+=(Integer.parseInt(arr[i]));
            }
        }
        if(flag==0) {
            System.out.println(sum);
        }
    }
}
