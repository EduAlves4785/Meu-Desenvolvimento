/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucaodosistema;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoDoSistema {

    public static void main(String[] args) {
        Toolkit t=Toolkit.getDefaultToolkit();
        Dimension d=t.getScreenSize();
        System.out.println("A resolução é:"+d.width+"x"+d.height);
    }
    
}
