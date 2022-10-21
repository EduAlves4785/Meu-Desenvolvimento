/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacaomap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author Eduardo
 */
public class OrdenacaoMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ordem aleatória");
        Map<String,Livro>meusLivros=new HashMap<>();
        meusLivros.put("Ivan Jaf",new Livro("O vampiro que descobriu o Brasil",120));
        meusLivros.put("Ivan Jaf",new Livro("O Ladrão de Raios - Capa Nova: (Série Percy Jackson e os Olimpianos)",400));
        meusLivros.put("Ivan Jaf",new Livro("O menino do pijama listrado",192));
        for(Map.Entry<String,Livro>livro:meusLivros.entrySet()){
            System.out.println(livro.getKey()+"--"+livro.getValue().getNome());
        }
        System.out.println("-----------");
    }
    
}

class Livro{
    private String nome;
    private int paginas;

    public Livro(String nome, int paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public int getPaginas() {
        return paginas;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.nome);
        hash = 89 * hash + this.paginas;
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
        final Livro other = (Livro) obj;
        if (this.paginas != other.paginas) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Livro{" + "nome=" + nome + ", paginas=" + paginas + '}';
    }

    
    
    
}