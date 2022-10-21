/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idiomadosistema;

import java.util.Locale;

/**
 *
 * @author PC
 */
public class IdiomaDoSistema {

    public static void main(String[] args) {
        Locale lingua=Locale.getDefault();
        System.out.println("A linguagem do sistema está em:"+lingua.getDisplayLanguage());
    }   
    
}
