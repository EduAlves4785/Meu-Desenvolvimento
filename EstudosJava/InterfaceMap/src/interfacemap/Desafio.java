/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacemap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Eduardo
 */
public class Desafio {
    public static void main(String[] args) {
        Set<Double>dados =new LinkedHashSet<>(Arrays.asList(1d));
        int lances=0;
        Double soma=0d;
        int i;
        for(i=0;dados.size()<100d;i++){
            soma++;
            dados.add(soma);
            System.out.println(soma);
        }
        System.out.println(dados);
    }
}
