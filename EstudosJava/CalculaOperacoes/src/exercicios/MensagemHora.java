/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class MensagemHora {
    
    public static void horamsn(int hora){
        if(hora>=6 && hora<12){
            System.out.println("Bom dia");
        }else if(hora>=12 && hora<18){
            System.out.print("Boa tarde");
        }else{
            System.out.println("Boa noite");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Que horas são? :");
        int horas=sc.nextInt();
        horamsn(horas);
    }
   
}
