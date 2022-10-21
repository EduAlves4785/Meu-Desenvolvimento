/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacemap;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Eduardo
 */
public class ExercicioMap {
    public static void main(String[] args) {
        Map<String,Double>Estados=new HashMap<>();
        Estados.put("PE",9.616621);
        Estados.put("AL",3.351543);
        Estados.put("CE",9.187103);
        Estados.put("RN",3.534265);
        System.out.println(Estados);
        System.out.println("-----------");
        System.out.println("Mude a população do RN:");
        Estados.put("RN",3.534165);
        System.out.println(Estados);
        System.out.println("-----------");
        System.out.println("Verificar se PB está na lista,caso não,o adicione:");
        if(Estados.containsKey("PB")){
            return;
        }else{
           Estados.put("PB",4.039277);
        }
        System.out.println(Estados);
        System.out.println("-----------");
        System.out.println("Exiba a população de PE:"+Estados.get("PE"));
        System.out.println("-----------");
        System.out.println("Exiba os estados e populações na ordem que foram informados:");
        Map<String,Double>Estados1=new LinkedHashMap<>();
        Estados1.put("PE",9.616621);
        Estados1.put("AL",3.351543);
        Estados1.put("CE",9.187103);
        Estados1.put("RN",3.534265);
        System.out.println(Estados1);
        System.out.println("-----------");
        System.out.println("Ordem alfabética");
        Map<String,Double>Estados2=new TreeMap<>();
        Estados2.putAll(Estados);
        System.out.println(Estados2);
        System.out.println("-----------");
        System.out.println("Estado com menor população:");
        Double pessoas = Collections.min(Estados1.values());
        Set<Map.Entry<String, Double>> nomes = Estados1.entrySet();
        String menorpopul="";
        for(Map.Entry<String, Double>entry:nomes){
            if(entry.getValue().equals(pessoas))menorpopul=entry.getKey();
            System.out.println(""+menorpopul+" "+pessoas);
        }
        System.out.println("-----------");
        System.out.println("Estado com maior população:");
        Double pessoas1 = Collections.max(Estados1.values());
        Set<Map.Entry<String, Double>> nomes1 = Estados1.entrySet();
        String maiorpopul="";
        for(Map.Entry<String, Double>entry:nomes1){
            if(entry.getValue().equals(pessoas1))maiorpopul=entry.getKey();
            System.out.println(""+menorpopul+" "+pessoas1);
        }
}

}

