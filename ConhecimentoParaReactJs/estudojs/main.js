//--------Nullish Coalescing Operator--------\\
//Para o Js o '0' é falso ou não válido para o operador ||
//const idade=null;

//document.body.innerText="Sua idade é: "+(idade??"Não informado");

//Objetos
/*const user={
  name:'Edu',
  idade:17,
  adress:{
    rua:'Plínio da cunha',
    numero:933,
  }
}
*/

  //Verifica se existe 'afaf' no objeto
  //document.body.innerText=('afaf' in user);

  //Chaves do objeto
  //document.body.innerText=Object.keys(user);

  //Retorna Vetor
  //document.body.innerText=JSON.stringfy(Object.entries(user));

//--------Desestruturação--------\\
  //const {adress}=user retorna o adress do obj
  //const {adress,idade:age,nickname='fernandes'}=user

  /*function mostraIdade(user){
    return user.idade
  }
  */ //retorna a idade

  /*
  function mostraIdade({idade}){
    return idade
  } retorna a idade desestruturando
  */

  //document.body.innerText=mostraIdade(user);

//--------Rest Operator--------\\

  //const {name,...rest}=user; //Resto das propriedades do usuário

  /*const arrays=[1,2,3,4,5,6,7,10]
  const [first,second]=arrays;  Também é possível desestruturas array

  const [first, ,third,...rest]=arrays; 

  document.body.innerText=JSON.stringify({first,third,rest});
  */

//--------Short Syntax--------\\
  /*
  const name="Eduardo"
  const idade=27

  const user={
    name,
    idade,
  }

  document.body.innerText=JSON.stringify(user);
  */

//--------Optional Chaining--------\\
  /*
  const user={
    name:'Edu',
    age:17,
    adress:{
      street:'Plínio da cunha',
      number:933,
      zip:{
        code:'687466',
        city:"Aparifa"
      },
      showFullAddress(){
        return "ok"
      }
    }
  }
  document.body.innerText=user.adress?.showFullAddress?.() Verifica se o adress exite,caso não exite ele não acessa o resto


  const key='street';

  /*document.body.innerText=user[key] /*O valor da key contém no user

  document.body.innerText=user.adress[key]
  */

//--------Métodos de array--------\\

  const array=[1,2,3,4,5]
  /*for(const i of array){ //Percorre array
    document.body.innerText+=i
  }
  */

  //array.forEach(item=>{ document.body.innerText+=item})

  //Map
  /*const novoArray=array.map(item=>{
    return item *2
  })//o uso do map serve para transformar o array e criar outra info com ele

  document.body.innerText=novoArray
  */

  //Filter
  /*const novoArray=array.filter(item=>item%2==0)
  .map(item=>item*10)

  document.body.innerText=JSON.stringify(novoArray)
  */

  //Every
  /*const todosItensSaoNumeros=array.every(item=>typeof item==='number')

  document.body.innerText=JSON.stringify(todosItensSaoNumeros)
  */

  //Some
  /*const peloMenosUmItemNaoENumero=array.some(item=>{
    return typeof item==='number'
  })
  //Apenas um precisa ser numero para retornar true
  document.body.innerText=JSON.stringify(peloMenosUmItemNaoENumero)
  */

  //Find
  /*const par=array.find(item=>item%2===0)
  //Retorna o primeiro que satisfaça a condição
  document.body.innerText=JSON.stringify(par)
  */

  //FindIndex
  /*const par=array.findIndex(item=>item%2===0)
  //Retorna a posição de onde foi encontrado
  document.body.innerText=JSON.stringify(par)
  */

  //Reduce
  /*const soma=array.reduce((acc,item)=>{
    document.body.innerText+=acc+","+item+"---"
    return acc+item
  },0)//iniciar a soma a partir de um número ou obj
  */

  //Template Literals
  /*const name='giu'
  const message=`Bem-vindo,${name?name:"Novato"}`
  document.body.innerText=message
  */

//Promisses

  //.then/ .catch

  /*const somaDoisNumeros=(a,b)=>new Promise((resolve,reject)=>{
    setTimeout(()=>{
      resolve(a+b)
    },2000)
  })
  somaDoisNumeros(1,2)
    .then(soma=>{
      document.body.innerText=soma
    })
    .catch(err=>{
      console.log(err)
    })

  */

  //fetch
  /*fetch('https://api.github.com/users/diego3g')
    .then(response=>{
      return response.json();
    })
    .then(body=>{
      console.log(body)
    })

    /*.then(response=>{
      response.json().then(body=>{
        console.log(body)
        document.body.innerText=JSON.stringify(body.followers)
      })
    })

    .catch(err=>{
      console.log(err)
    })
    .finally(()=>{
      console.log('Cabo')
    })//Vai executar idepedente se der certo ou errado
  */

  //Melhores formas de trabalhar com then e catch
  async function buscaDadosGitHub(){
    const response=await fetch('https://api.github.com/users/diego3g')//o await faz ele aguardar para executar o resto
    const body=await response.json()
    console.log(body.name)
    //async significa q tem um código q pode demorar um pouco para responder
  }
  buscaDadosGitHub()