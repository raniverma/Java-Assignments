package com.stackroute.practise1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.lang.Integer;

public class practiseQ7 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        String number=sc.nextLine();

        int len=number.length();

        Integer[] arr=new Integer[len];

        for(int i=0;i<len;i++){
            arr[i]=number.charAt(i)-'0';
        }
        Arrays.sort(arr ,Collections.reverseOrder());
        Integer num=0;
        for(int j=0;j<len;j++){
            num=num*10+arr[j];
        }

        System.out.println("Sorted number in non-increasing order :" + num);
        Integer sum=0;
        while(num!=0){
            if((num%10)%2==0){
                sum+=(num%10);
            }
            num=num/10;
        }
        System.out.println("Sum of even numbers :" +sum);
        if(sum>15)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
