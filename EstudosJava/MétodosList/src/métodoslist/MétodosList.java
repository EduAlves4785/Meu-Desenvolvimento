/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package métodoslist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Eduardo
 */
public class MétodosList {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Crie uma lista e adicione 7 notas: ");
        List<Double>notas=new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas);
        
        System.out.println("Exiba a posição da nota 5: "+notas.indexOf(5d));
        
        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4,8d);
        System.out.println(notas);
        
        System.out.println("Substitua a nota 5 pela nota 6: ");
        notas.set(notas.indexOf(5d),6.0);
        System.out.println(notas);
        
        System.out.println("Confira se a nota 5 está na lista: "+notas.contains(5d));
        
        System.out.println("Exiba todas as notas na ordem que foram informados: ");
        for(Double nota:notas)System.out.println(nota);
        
        System.out.println("Exiba a terceira nota adicionada: "+notas.get(2));
        
        System.out.println("Exiba a menor nota: "+Collections.min(notas));
        
        System.out.println("Exiba a maior nota: "+Collections.max(notas));
        
        System.out.print("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma=0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma+=next;
        }
        System.out.println(soma);
        
        System.out.println("Exiba a média das notas: "+(soma/notas.size()));
        
        System.out.println("Remova a nota 0: "+notas.remove(0d)+" "+notas);
        
        System.out.println("Remova a nota na posição 0: ");
        notas.remove(0);
        System.out.println(notas);
        
        System.out.print("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next<7)iterator1.remove();
        }
        System.out.println(notas);
        
        System.out.print("Apague toda a lista: ");
        notas.clear();
        System.out.println(notas);
        
        System.out.println("Confira se a lista está vazia: "+notas.isEmpty());
        
        System.out.print("Crie uma lista chamada notas2"+
                " e coloque todos os elementos da list ArrayList nessa nova lista: ");
        List <Double> notas2= new LinkedList<Double>();
        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5.0);
        notas2.add(7.0);
        notas2.add(0.0);
        notas2.add(3.6);
        System.out.println(notas2);
        
        System.out.println("Mostre a pirmeira nota da nova lista: "+notas2.get(0));
        
        System.out.print("Mostra a primeira nota da nova lista removendo-o: ");
        notas2.remove(0);
        System.out.println(notas2.get(0));
    }
    
}
