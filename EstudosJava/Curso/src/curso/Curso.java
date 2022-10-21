/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso;

/**
 *
 * @author Eduardo
 */
public class Curso {

    String periodo;
    String nivelCurso;
    String areaTematica;
    String propriedade;
    String modalidade;
    
    Curso(String pe,String nC,String aT,String pr,String md){
        periodo=pe;
        nivelCurso=nC;
        areaTematica=aT;
        propriedade=pr;
        modalidade=md;  
    }
    
    
    public static void main(String[] args) {
        Curso c=new Curso("Noturno","Tecnólogo","Análise e Desenvolvimento de Sistemas","Privada","Presencial");
        
        System.out.println("Periodo:"+c.periodo);
        System.out.println("Nível do Curso:"+c.nivelCurso);
        System.out.println("Área Tematica:"+c.areaTematica);
        System.out.println("Propriedade:"+c.propriedade);
        System.out.println("Modalidade:"+c.modalidade);
        
    }
    
}
