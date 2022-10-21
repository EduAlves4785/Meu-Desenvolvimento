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
public class ExercicioHeranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro c1=new Carro();
        Moto m1=new Moto();
        Caminhao ca1=new Caminhao();
        
        c1.acelerar();
        m1.frear();
        ca1.marchare();
    }
    
}


class Veiculo{
    public void acelerar(){
        System.out.println("acelerando");
    }
    
    public void frear(){
        System.out.println("freando");
    }
    
    public void marchare(){
        System.out.println("dando a ré");
    }

}

class Carro extends Veiculo{

    public Carro() {
    }
    
    
}

class Moto extends Veiculo{
    
     public Moto() {
    }
}

class Caminhao extends Veiculo{
    
     public Caminhao() {
    }
}