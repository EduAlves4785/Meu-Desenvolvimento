// bolean
var vDuf=false;
console.log(typeof(vDuf));

//number
var numero=1;
console.log(typeof(numero));

//string
var nome='edu';
console.log(typeof(nome));

//como declarar
var nome1='eduardo';//pode ter valor alterado
nome1='alves';
console.log(nome1);

let nome2='eduzin';//pode ter valor alterado
nome2='edus';
console.log(nome2);

const constante='geraldo';//não pode ter valor alterado
console.log(constante);

//escopo

var escopoglobal='global';
console.log(escopoglobal);

function escopolocal(){
    let escopolocalinterno='local';
    console.log(escopolocalinterno);
}

escopolocal();

//atribuição
var atribuicao='Irineu';

//comparação
var comparacao='0'==0;
console.log(comparacao);

//comparação idêntica
var comparacaoidentica='0'===0;
console.log(comparacaoidentica);

//adição
var adicao=1+1;
console.log(adicao); 

//subtração
var subtracao=1-1;
console.log(subtracao); 

//multiplicação
var multiplicacao=2*8;
console.log(multiplicacao);

//divisão real
var divisaoreal=6/2;
console.log(divisaoreal);

//divisão inteira(resto da divisão)
var divisaointeira=5%2;
console.log(divisaointeira);

//potenciação
var potenciacao=2**10;
console.log(potenciacao);

//maior que
var maiorque=5>2;//irá retornar true
console.log(maiorque);

//menor que
var menorque=5<2;//irá retornar false
console.log(menorque);

//maior ou igual
var maiorigual=5>=2;//irá retornar true
console.log(maiorigual);

//menor ou igual
var menorigual=5<=2;//irá retornar false
console.log(menorigual);

//considera que todos os valores sejam true
var e=true && false;//retorna false pois o e precisa que todos os valores sejam verdadeiros
console.log(e);

//considera que qualquer valor seja true
var ou=true||false;
console.log(ou);

//inverte o valor de true para false ou vice-versa
var nao=!true;
console.log(nao);