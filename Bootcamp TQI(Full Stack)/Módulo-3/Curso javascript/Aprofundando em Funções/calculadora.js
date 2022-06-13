function calculadora(){
    const operacao=prompt('Escolha uma operação:\n 1-soma(+)\n 2-subtração(-)\n3-multiplicação(*)\n4-divisão real(/)\n5-divisão inteira(%)\n6-potenciação(**)');
    console.log(operacao);

    if(!operacao||operacao>=7){
        alert('Operação inválida,digite novamente!')
        calculadora();        
    }else{
    
        let n1=Number(prompt('Insira o primeiro valor:'))
        let n2=Number(prompt('Insira o segundo valor:'))
        let resultado;

        if(!n1||!n2){
            alert("Erro-parâmetros errados")
            calculadora();
        }else{
            function soma(){
                resultado=n1+n2;
                alert(`${n1}+${n2}=${resultado}`)
                novaoperacao();
            }
    
            function subtracao(){
                resultado=n1-n2;
                alert(`${n1}-${n2}=${resultado}`)
                novaoperacao();
            }
    
            function multiplicacao(){
                resultado=n1*n2;
                alert(`${n1}*${n2}=${resultado}`)
                novaoperacao();    
            }
    
            function divisaoreal(){
                resultado=n1/n2;
                alert(`${n1}/${n2}=${resultado}`)
                novaoperacao();
            }
    
            function divisaointeira(){
                resultado=n1%n2;
                alert(`O resto da divisão de ${n1} e ${n2} é ${resultado}`)
                novaoperacao();
            }
            function potenciacao(){
                resultado=n1**n2;
                alert(`${n1} elevado a ${n2} é ${resultado}`)
                novaoperacao();
            }
    
            function novaoperacao(){
                let opcao=prompt('Deseja fazer outra operação?\n1-Sim\n2-Não')        
                
                if(opcao==1){
                    calculadora();        
                }else if(opcao==2){
                    alert('Até a próxima')
                }else{
                    alert('Digite uma opção válida')
                     novaoperacao();                        
                }
            }
        }
        
        if(operacao==1){
            soma();
        }else if(operacao==2){
            subtracao();
        }else if(operacao==3){
            multiplicacao();
        }else if(operacao==4){
        divisaoreal(); 
        }else if(operacao==5){
            divisaointeira();
        }else if(operacao==6){
            potenciacao();
        }}
        
       
}          

calculadora();