package com.stackroute.pe2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Folder {
    public static void main(String args[]){
        Folder obj=new Folder();
        obj.findFiles();

    }

    public void findFiles(){
        List<String> results = new ArrayList<String>();


        File[] files = new File("/home/user/Documents").listFiles();

        for (File file : files) {
            if (file.isFile()) {
                results.add(file.getName());
            }
        }
        for(int i=0;i<results.size();i++){
            System.out.println(results.get(i));
        }

    }

}
