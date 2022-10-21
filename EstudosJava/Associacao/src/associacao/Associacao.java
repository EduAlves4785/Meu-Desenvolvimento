/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package associacao;

/**
 *
 * @author Eduardo
 */
public class Associacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

//Estrutural Composição
class Pessoa{
    Endereco edereco;
}

class Endereco{

}

//Estrutural agregação
class Disciplina{
    Aluno aluno;
    
}

class Aluno{

}

//Comportamental dependencia
class Compra{
    public void finalizar(Cupom cupom){
    
    }
}

class Cupom{}