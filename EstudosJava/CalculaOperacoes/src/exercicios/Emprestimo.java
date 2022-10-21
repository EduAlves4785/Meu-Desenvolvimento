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
public class Emprestimo {
    
        private static double arredondar(double valor) {
            return Math.round(valor);
        }
    
    
        public static void calculartotal(double valor1,int valor2){
            int parcela=0;
            double juros=0;
            if(valor2>12){
                System.out.println("Numero de parcelas maior que o permitido!"); 
            }else{
                for(int i=1;i<=valor2;i++){
                parcela++;
                juros+=0.01;
                double conta=(valor1/valor2)+(valor1*juros);
                conta=arredondar(conta);
                System.out.println("Parcela "+parcela+" com "+juros*100+"%"+" de juros são "+conta+" ao mês");
                }
            }
            return;
        }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Você pode parcelar em até 12 vezes");
        System.out.println("O juros aumenta 1% ao mês!");
        System.out.print("Qual o valor do empréstimo?: ");
        double valoremprestimo=sc.nextDouble();
        System.out.print("Quantas parcelas?: ");
        int parcelas=sc.nextInt();
        calculartotal(valoremprestimo,parcelas);
       
        
    }
}
