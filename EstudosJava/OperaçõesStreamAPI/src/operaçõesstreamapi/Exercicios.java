/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaçõesstreamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 * @author Eduardo
 */
public class Exercicios {
    public static void main(String[] args) {
        List<String>numerosAleatorios=
            Arrays.asList("1","0","4","1","2","3","9","9","6","5");
    
        System.out.println("Imprima todos os elementos dessa lista de string:");
        numerosAleatorios.forEach(System.out::print);
        System.out.println("----------");
        System.out.println("Pegue os 5 primeiros numeros e coloque dentro de um set:");
        Set<String> collect = numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet());
        System.out.println("----------");
        System.out.println("Transforme a lista de string em lista de numeros inteiros");
        numerosAleatorios.stream()
            .map(Integer::parseInt)
            .collect(Collectors.toList())
            .forEach(System.out::print);
        System.out.println("----------");
        System.out.println("Pegue os números pares e maiores que 2 e coloque numa lista:");
        List<Integer>ListPares=numerosAleatorios.stream()
            .map(Integer::parseInt)
            .filter(i->i%2==0 && i>2).collect(Collectors.toList());
        System.out.println(ListPares);
        System.out.println("----------");
        System.out.println("Media dos numeros");
        numerosAleatorios.stream()
            .mapToInt(Integer::parseInt)
            .average()
            .ifPresent(System.out::println);
        System.out.println("----------");
        System.out.println("Remova valores ímpares:");
        List<Integer>numerosAleatorios1=numerosAleatorios.stream()
            .map(Integer::parseInt)
            .collect(Collectors.toList());
        
        numerosAleatorios1.removeIf(i->(i%2!=0));
        System.out.println(numerosAleatorios1);
    
    
    }
    
    
}
