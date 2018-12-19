package com.stackroute.pe2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Calfrequency {
    public static void main(String args[]){
        Calfrequency obj=new Calfrequency();
        obj.calcFrequency();
    }

    public void calcFrequency(){
        Calfrequency obj=new Calfrequency();
        Map<String,Integer> arr= obj.Splitfun();
        for(Map.Entry<String,Integer> entry:arr.entrySet()){
            System.out.println(entry.getKey()+ " -> " + entry.getValue());
        }
    }

    public Map<String,Integer> Splitfun(){
        Map<String,Integer> hmap = new HashMap<>();
        int i=0;
        BufferedReader br=null;
        String str="";
        try{
            br=new BufferedReader(new FileReader("/home/user/IdeaProjects/PE2/src/com/stackroute/pe2/FileDemo.txt"));
            while((str=br.readLine())!=null){
                String[] value=str.split("\\s*(\\.|,|\\s)\\s*");
                /*for(int j=0;j<value.length;j++){
                    System.out.println(value[j]);
                }
                System.out.println("-----------------");*/
                for(int j=0;j<value.length;j++){
                    if(hmap.containsKey(value[j])) {
                        hmap.compute(value[j],(key,val)->(val==null)?1:val+1);
                    }
                    else
                        hmap.put(value[j], 1);

                }
            }

        }catch (IOException e) {
            System.out.println("Unable to read file");
        }
        return hmap;
    }
}
