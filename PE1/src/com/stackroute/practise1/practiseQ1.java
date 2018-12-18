package com.stackroute.practise1;

import java.util.*;

public class practiseQ1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        StringBuilder sb=new StringBuilder(str);

        int flag=0,sum=0;
        if((sb.reverse().toString()).equals(str)) {
            flag = 1;
        }

        for(int i=0;i<str.length();i++) {
            if ((str.charAt(i) - '0') % 2 == 0)
                sum += (str.charAt(i) - '0');
        }
        if(sum>25 && flag==1)
            System.out.println(str + " is palindrome and the sum of even numbers is greater than 25");
        else if(flag==1 && sum<25)
            System.out.println(str + " is palindrome and the sum of even numbers is less than 25");
        else
            System.out.println(str + " is not palindrome");

    }
}
