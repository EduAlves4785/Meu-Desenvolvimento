/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosset;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Eduardo
 */
public class ExercicioArcoiris {
    public static void main(String[] args) {
        Set<Cores>ArcoIris =new HashSet<>();
        ArcoIris.add(new Cores("vermelha"));
        ArcoIris.add(new Cores("laranja"));
        ArcoIris.add(new Cores("amarela"));
        ArcoIris.add(new Cores("verde"));
        ArcoIris.add(new Cores("azul"));
        ArcoIris.add(new Cores("azulescuro"));
        ArcoIris.add(new Cores("violeta"));
        System.out.println("Exiba as cores,uma a baixo da outra:");
        for(Cores cor:ArcoIris)System.out.println(cor.getNome());
        System.out.println(" ");
        System.out.println("Quantidade de cores do arco-íris");
        int contador=0;
        for(Cores cor:ArcoIris)contador++;
        System.out.println("São "+contador+" cores");
        System.out.println(" ");
        System.out.println("Ordenar por ordem alfabética");
        Set<Cores>ArcoIris1=new TreeSet<>(new OrdenaCor());
        ArcoIris1.addAll(ArcoIris);
        System.out.println(ArcoIris1);
        System.out.println(" ");
        System.out.println("Mostre as cores em uma ordem aleatória: ");
        Set<Cores>ArcoIris2 =new HashSet<>(ArcoIris);
        System.out.println(ArcoIris2);
        System.out.println("Mostre na ordem reversa: ");
        System.out.println(" ");
        System.out.println("Cores que começam com a letra V");
        Iterator<Cores> iterator= ArcoIris.iterator();
        System.out.println(ArcoIris);
        System.out.println(" ");
        
        
    }
}

class Cores {
    private String nome;

    public Cores(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cores{" + "nome=" + nome + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cores other = (Cores) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    boolean contains(String v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

class OrdenaCor implements Comparator<Cores>{
    
    @Override
    public int compare(Cores a1, Cores a2) {
        int nome=a1.getNome().compareTo(a2.getNome());
        if(nome!=0)return nome;
        return nome;
    }
}


