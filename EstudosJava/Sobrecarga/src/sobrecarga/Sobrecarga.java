/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecarga;

import java.util.Scanner;

/**public 
 *
 * @author Eduardo
 */
public class Sobrecarga {

    public static double calculaarea(int l){
        double conta=l*l;
        System.out.println("A area do quadrado é: "+conta);
        return conta;
    }
    
    public static double calculaarea(int b,int h){
        double conta=b*h;
        System.out.println("A area do retângulo é: "+conta);
        return conta;
    }
    
     public static double calculaarea(int B,int b,int h){
        double conta=((B+b)*h)/2;
        System.out.println("A area do trapézio é: "+conta);
        return conta;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Digite o lado do quadrado: ");
        int ladoQuadrado=sc.nextInt();
        calculaarea(ladoQuadrado);
        
        System.out.print("Digite a base do retãngulo: ");
        int baseRetangulo=sc.nextInt();
        System.out.print("Digite a altura do retãngulo: ");
        int alturaRetangulo=sc.nextInt();
        calculaarea(baseRetangulo,alturaRetangulo);
        
        System.out.print("Digite a base maior do trapézio: ");
        int baseMaior=sc.nextInt();
        System.out.print("Digite a base menor do trapézio: ");
        int baseMenor=sc.nextInt();
        System.out.print("Digite a altura do trapézio: ");
        int alturaTrapez=sc.nextInt();
        calculaarea(baseMaior,baseMenor,alturaTrapez);
    }
}
