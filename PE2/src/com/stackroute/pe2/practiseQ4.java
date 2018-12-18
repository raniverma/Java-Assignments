package com.stackroute.pe2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class practiseQ4 {
    public static void main(String args[]){
        BufferedReader br=null;
        String str="";
        try{
            br=new BufferedReader(new FileReader("/home/user/IdeaProjects/PE2/src/com/stackroute/pe2/file1.txt"));
            while((str=br.readLine())!=null){
                System.out.println(str.toUpperCase());
            }

        }catch (IOException e) {
            System.out.println("Unable to read file");
        }

    }
}
