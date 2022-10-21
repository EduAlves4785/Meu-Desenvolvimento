/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciopo;

/**
 *
 * @author Eduardo
 */
public class ExercicioPo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carro carro=new Carro("Preto","Sedan",66);
        carro.calculaValorTanque(6.46f,carro.getCapacidadeTanque());
    }
    
}

class Carro{
    private String cor;
    private String modelo;
    private int capacidadeTanque;

    public Carro() {
    }

    public Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }
    
    
    
    
    public void calculaValorTanque(float valorLitro,int tanque){
        float conta=(valorLitro*tanque)+tanque;
        System.out.println("Para encher o tanque é R$"+conta);
    }
}