/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organizandoelementoslist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class OrganizandoElementosList {

    public static void main(String[] args) {
        // TODO code application logic here
        List<Gato> meusGatos = new ArrayList<>();
        meusGatos.add(new Gato("Jon",18,"preto"));
        meusGatos.add(new Gato("Simba",6,"tigrado"));
        meusGatos.add(new Gato("Jusara",5,"branco"));  

        
        System.out.println("Ordem de inserção:");
        System.out.println(meusGatos);
        
        System.out.println("Ordem aleatória");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);
        
        System.out.println("Ordem natural(Nome):");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);
        
        System.out.println("Ordem de idade:");
        Collections.sort(meusGatos,new ComparatorIdade());
        System.out.println(meusGatos);
        
        System.out.println("Ordem cor:");
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);
        
        System.out.println("Ordem nome/cor/idade");
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
    }
    
}


class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Gato{" + "nome=" + nome + ", idade=" + idade + ", cor=" + cor + '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome()); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}

class ComparatorIdade implements Comparator<Gato>{
    @Override
    public int compare(Gato g1,Gato g2){
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }

}

class ComparatorCor implements Comparator<Gato>{
    @Override
    public int compare(Gato g1,Gato g2){
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }

}

class ComparatorNomeCorIdade implements Comparator<Gato>{
    @Override
    public int compare(Gato g1,Gato g2){
        int nome=g1.getNome().compareToIgnoreCase(g2.getNome());
        if(nome!=0)return nome;
        
        int cor=g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor!=0)return cor;
        
        return Integer.compare(g1.getIdade(), g2.getIdade());

    
    }
}