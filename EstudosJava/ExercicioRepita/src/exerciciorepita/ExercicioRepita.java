/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int total=0,num,pares=0,impares=0,acima100=0,media=0,s=0;
       do{
          num=Integer.parseInt(JOptionPane.showInputDialog(null,"Informe um número:(0 interrompe)"));
          s+=num;
          total++;
          if(num%2==0 || num!=0){
            pares++;
          }else{
              impares++;
          }
          if(num>100){
              acima100++;
          }
          media=s;
       }while(num!=0);
       JOptionPane.showMessageDialog(null, "<html><br>Total de valores: "+total+"<br>Total de números pares: "+pares+"<br>Numeros impares: "+impares+"<br>Numeros acima de 100: "+acima100+"<br>Media dos valores: "+media+"</html>");
    }
}

/**int n,s=0;
        do{
           n=Integer.parseInt(JOptionPane.showInputDialog(null,"Informe um número:(0 interrompe)"));
           s+=n;
        }while(n!=0);
        JOptionPane.showMessageDialog(null, "<html>O resultado é <hr>"+s+"</html>");
    }*/