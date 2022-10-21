/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class Interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Calculadora c=new Calculadora();
       
       c.soma(2, 3);
       c.subtracao(4, 2);
       c.multiplicacao(4, 5);
       c.divisao(8, 2);

    }
    
}

interface OperacaoMatematica{
    
    void soma(int a,int b);
    
    void subtracao(int a,int b);
    
    void multiplicacao(int a,int b);
    
    
    void divisao(int a,int b);
}

class Calculadora implements OperacaoMatematica{

    public Calculadora() {
    }

    
    
    
    @Override
    public void soma(int a, int b) {
        float conta=a+b;
        System.out.println(conta);
    }

    @Override
    public void subtracao(int a, int b) {
        float conta=a-b;
        System.out.println(conta);
    }

    @Override
    public void multiplicacao(int a, int b) {
        float conta=a*b;
        System.out.println(conta);
    }

    @Override
    public void divisao(int a, int b) {
        float conta=a/b;
        System.out.println(conta);
    }

    
      
}