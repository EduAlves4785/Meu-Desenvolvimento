/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organizandoelementosset;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Eduardo
 */
public class OrganizandoElementosSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ordem aleatória:");
        Set<Serie>minhasSeries=new HashSet<>();
        minhasSeries.add(new Serie("GoodDoctor","suspense",50));
        minhasSeries.add(new Serie("Broklin99","comédia",40));
        minhasSeries.add(new Serie("TheWalkingDead","terror",50));
        for(Serie serie:minhasSeries)System.out.println(serie.getNome()+"-"+serie.getGenero()+"-"+serie.getTempoEpisodio());
    
        System.out.println("Ordem de inserção:");
        Set<Serie>minhasSeries1=new LinkedHashSet<>();
        minhasSeries1.add(new Serie("GoodDoctor","suspense",50));
        minhasSeries1.add(new Serie("Broklin99","comédia",40));
        minhasSeries1.add(new Serie("TheWalkingDead","terror",50));
        for(Serie serie:minhasSeries)System.out.println(serie.getNome()+"-"+serie.getGenero()+"-"+serie.getTempoEpisodio());
        
        System.out.println("Ordem natural(Tempo de episódio):");
        Set<Serie>minhasSeries2=new TreeSet<>(minhasSeries1);
        for(Serie serie:minhasSeries2)System.out.println(serie.getNome()+"-"+serie.getGenero()+"-"+serie.getTempoEpisodio());
        System.out.println(minhasSeries2);
        
        System.out.println("Ordem Nome/Gênero/TempoEpisodio");
        Set<Serie>minhasSeries3=new TreeSet<>(new ComparatoNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries);
        for(Serie serie:minhasSeries3)System.out.println(serie.getNome()+"-"+serie.getGenero()+"-"+serie.getTempoEpisodio());
        System.out.println(minhasSeries2);
    }
    
}

class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private int tempoEpisodio;

    public Serie(String nome, String genero, int tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getTempoEpisodio() {
        return tempoEpisodio;
    }

    public void setTempoEpisodio(int tempoEpisodio) {
        this.tempoEpisodio = tempoEpisodio;
    }

    @Override
    public String toString() {
        return "Serie{" + "nome=" + nome + ", genero=" + genero + ", tempoEpisodio=" + tempoEpisodio + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.genero);
        hash = 59 * hash + Objects.hashCode(this.tempoEpisodio);
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
        final Serie other = (Serie) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.genero, other.genero)) {
            return false;
        }
        if (!Objects.equals(this.tempoEpisodio, other.tempoEpisodio)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio=Integer.compare(this.getTempoEpisodio(),serie.getTempoEpisodio());
        if(tempoEpisodio!=0)return tempoEpisodio;
        return this.getGenero().compareTo(serie.getGenero());
    }
    
    
}

class ComparatoNomeGeneroTempoEpisodio implements Comparator<Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {
         int nome=s1.getNome().compareTo(s2.getNome());
         if(nome!=0)return nome;
        
        int genero=s1.getGenero().compareTo(s2.getGenero());
        if(genero!=0)return genero;
        
        return Integer.compare(s1.getTempoEpisodio(),s2.getTempoEpisodio());
        
    }
}