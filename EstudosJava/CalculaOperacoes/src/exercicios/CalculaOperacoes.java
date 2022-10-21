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
public class CalculaOperacoes {

    public static void soma(int n1, int n2){
        int conta=n1+n2;
        System.out.println("A soma é "+conta);
        return;
    }
    
    public  static void subtracao(int n1,int n2){
        int conta=n1-n2;
        System.out.println("A subtrção é "+conta);
        return;
    }
     
    public  static void multiplica(int n1,int n2){
        int conta=n1*n2;
        System.out.println("A multiplicação é "+conta);
        return;
    }
    
    public static void divisao(int n1,int n2){
        int conta=n1/n2;
        System.out.println("A divisão é "+conta);
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Deigite o primeiro número: ");
        int n1=sc.nextInt();
        System.out.print("Deigite o primeiro segundo: ");
        int n2=sc.nextInt();
        
        soma(n1,n2);
        subtracao(n1,n2);
        multiplica(n1,n2);
        divisao(n1,n2);
        
        
    }
    
}
