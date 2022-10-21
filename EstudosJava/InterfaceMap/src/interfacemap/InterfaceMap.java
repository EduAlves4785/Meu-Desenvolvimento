/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacemap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Eduardo
 */
public class InterfaceMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Crie um dicionário e relacione os modelos e seus respectivos consumos:");
        Map<String,Double>carrosPopulares=new HashMap<>();
        carrosPopulares.put("Gol",14.4);
        carrosPopulares.put("Uno",15.6);
        carrosPopulares.put("Mobi",16.1);
        carrosPopulares.put("HB20",14.5);
        carrosPopulares.put("Kwid",15.6);
        System.out.println(carrosPopulares);
        System.out.println("-----------");
        System.out.println("Substitua o consumo do gol por 15,2 Km/L:");
        carrosPopulares.put("Gol",15.2);
        System.out.println(carrosPopulares);
        System.out.println("-----------");
        System.out.println("Confira se o modelo Tucson está no dicionário:"+carrosPopulares.containsKey("Tucson"));
        System.out.println("-----------");
        System.out.println("Exiba o consumo do uno:"+carrosPopulares.get("Uno"));
        System.out.println("-----------");
        System.out.println("Exiba os modelos:");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);
        System.out.println("-----------");
        System.out.println("Exiba os consumos dos carros:");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);
        System.out.println("-----------");
        System.out.println("Exiba o modelo mais econõmico:");
        Double consumo = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> nomes = carrosPopulares.entrySet();
        String modelMaisEficiente="";
        for(Map.Entry<String, Double>entry:nomes){
            if(entry.getValue().equals(consumo))modelMaisEficiente=entry.getKey();
            System.out.println(""+modelMaisEficiente+" "+consumo);
        }
        System.out.println("-----------");
        System.out.println("Exiba o modelo menos econõmico:");
        Double consumo1 = Collections.min(carrosPopulares.values());
        Set<Map.Entry<String, Double>> nomes1 = carrosPopulares.entrySet();
        String modelMaisEficiente1="";
        for(Map.Entry<String, Double>entry:nomes1){
            if(entry.getValue().equals(consumo1))modelMaisEficiente1=entry.getKey();
            System.out.println(""+modelMaisEficiente1+" "+consumo1);
        }
        System.out.println("-----------");
        System.out.print("Exiba as somas dos consumos: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma=0d;
        while(iterator.hasNext()){
            soma+=iterator.next();
        }
        System.out.print(soma);
        System.out.println("-----------");
        System.out.println("Exiba a média dos consumos:"+(soma/carrosPopulares.size()));
        System.out.println("-----------");
        System.out.print("Remova os modelos com consumo igual a 15.6:");
        Iterator<Double> iterator1= carrosPopulares.values().iterator();
        while(iterator1.hasNext()){
            if(iterator1.next().equals(15.6))iterator1.remove();
        }
        System.out.print(carrosPopulares);
        System.out.println("-----------");
        System.out.print("Exiba os carros na ordem que foram informados:");
        Map<String,Double>carrosPopulares1=new LinkedHashMap<>();
        carrosPopulares1.put("Gol",14.4);
        carrosPopulares1.put("Uno",15.6);
        carrosPopulares1.put("Mobi",16.1);
        carrosPopulares1.put("HB20",14.5);
        carrosPopulares1.put("Kwid",15.6);
        System.out.println(carrosPopulares1);
        System.out.println("-----------");
        System.out.print("Exiba apenas os modelos:");
        Map<String,Double>carrosPopulares2=new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.keySet().toString());
        System.out.println("-----------");
        System.out.print("Apague o dicionário de carros:");
        carrosPopulares.clear();
        System.out.println(carrosPopulares);
        System.out.println("-----------");
        System.out.println("Verifique se o dicionário está vazio: "+carrosPopulares.isEmpty());
        System.out.println("-----------");
        
        
    }
    
}
