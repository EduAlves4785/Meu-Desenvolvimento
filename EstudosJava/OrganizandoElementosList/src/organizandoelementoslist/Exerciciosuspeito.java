/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organizandoelementoslist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class Exerciciosuspeito {
        
    
    public static void main(String[] args) {
        List<String>Respostas=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Telefonou para vítima?:");
        String p1=sc.next();
        Respostas.add(p1);

        System.out.print("Esteve no local do crime?:");
        String p2=sc.next();
        Respostas.add(p2);
        
        System.out.print("Mora perto da vítima?:");
        String p3=sc.next();
        Respostas.add(p3);
        
        System.out.print("Devia para vítima?:");
        String p4=sc.next();
        Respostas.add(p4);
        
        System.out.print("Já trabalhou com a vítima?:");
        String p5=sc.next();
        Respostas.add(p5);


        int contador=0;
        Iterator<String> iterator1 = Respostas.iterator();
        while(iterator1.hasNext()){
            String next = iterator1.next();
            if(next=="sim")contador+=1;
            System.out.println(contador);
        }
        
    }
}
