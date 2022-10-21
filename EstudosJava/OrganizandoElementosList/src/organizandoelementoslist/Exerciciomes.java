/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organizandoelementoslist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class Exerciciomes {
    
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Temperatura do 1ºmês :");
        float janeiro=sc.nextFloat();
        System.out.print("Temperatura do 2ºmês :");
        float fevereiro=sc.nextFloat();
        System.out.print("Temperatura do 3ºmês :");
        float marco=sc.nextFloat();
        System.out.print("Temperatura do 4ºmês :");
        float abril=sc.nextFloat();
        System.out.print("Temperatura do 5ºmês :");
        float maio=sc.nextFloat();
        System.out.print("Temperatura do 6ºmês :");
        float junho=sc.nextFloat();
        
       ArrayList<Float>meses=new ArrayList();
        meses.add(janeiro);
        meses.add(fevereiro);
        meses.add(marco);
        meses.add(abril);
        meses.add(maio);
        meses.add(junho);
     
        Iterator<Float> iterator = meses.iterator();
        Float soma=0f;
        while(iterator.hasNext()){
            Float next = iterator.next();
            soma+=next;
        }
        float media=soma/6;
        
        System.out.println("A média foi "+media);
        int mes=0;
        String mesocorrido="";
        Iterator<Float> iterator1 = meses.iterator();
        while(iterator1.hasNext()){
            mes++;
            if(mes==1)mesocorrido="Janeiro";
            if(mes==2)mesocorrido="Fevereiro";
            if(mes==3)mesocorrido="Março";
            if(mes==4)mesocorrido="Abril";
            if(mes==5)mesocorrido="Maio";
            if(mes==6)mesocorrido="Junho";
            Float next = iterator1.next();
            if(next>media)System.out.println("Em "+mesocorrido+" a temperatura foi de "+next);
        }
    }
}

