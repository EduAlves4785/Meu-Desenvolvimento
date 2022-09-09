/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author PC
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String n1="Eduardo";
        String n2="Eduardo";
        String n3=new String("Eduardo");
        String res;
        res=(n1.equals(n3))?"igual":"diferente";    
        System.out.println(res);
    }
    
}
