/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosset;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Eduardo
 */
public class MetodosSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double>notas =new HashSet<>(Arrays.asList(7d,8.5,9.3,5d,7d,8d,3.6));
        System.out.println(notas.toString());
        
        System.out.println("Confira se a nota 5 está no conjunto: "+notas.contains(5d));
        
        System.out.println("Exiba a menor nota: "+Collections.min(notas));
        
        System.out.println("Exiba a maior nota: "+Collections.max(notas));
        
        System.out.println("Exibir a soma dos valors");
        Iterator<Double> iterator = notas.iterator();
        Double soma=0.0;
        while(iterator.hasNext()){
            Double next=iterator.next();
            soma+=next;
        }
        System.out.println("Exibir a soma dos valors:"+soma);
        
        System.out.println("Média das notas:"+(soma/notas.size()));
        
        System.out.print("Remova a nota 5.0:");
        notas.remove(5d);
        System.out.println(notas);
        
        System.out.println("Remova as notas menores que 7 e exiba na lista:");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next=iterator1.next();
            if(next<7)iterator1.remove();
        }
        System.out.println(notas);
        
        System.out.println("Exiba as notas na ordem em que foram informados:");
        Set<Double>notas2 =new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);
        
        System.out.println("Exiba todas as notas na ordem crescente:");
        Set<Double>notas3=new TreeSet<>(notas2);
        System.out.println(notas3);
        
        System.out.println("Apague todo o conjunto:");
        notas.clear();
        System.out.println(notas);
        
        System.out.println("Verifique se está vazio:"+notas.isEmpty());
    }
    
}
