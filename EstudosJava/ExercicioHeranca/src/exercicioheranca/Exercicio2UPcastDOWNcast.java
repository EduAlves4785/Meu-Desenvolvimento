/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioheranca;

/**
 *
 * @author Eduardo
 */
public class Exercicio2UPcastDOWNcast {
    public static void main(String[] args) {
        Funcionario f01=new Funcionario();
        
        Funcionario g1=new Gerente();
        Funcionario v1=new Vendedor();
        Funcionario f1=new Faxineiro();
        
        Vendedor vendedor=(Vendedor)new Funcionario();
    }
}

class Funcionario{
    public void apresentacao(){
        System.out.println("Sou funcionário");
    }
}

class Gerente extends Funcionario{

    public Gerente() {
    }
    
    public void apresentacao(){
        System.out.println("Sou gerente");
    }
    
}

class Vendedor extends Funcionario{

    public Vendedor() {
    }
    
    public void apresentacao(){
        System.out.println("Sou vendedor");
    }
    
}

class Faxineiro extends Funcionario{

    public Faxineiro() {
    }
    
    public void apresentacao(){
        System.out.println("Sou faxineiro");
    }
    
}