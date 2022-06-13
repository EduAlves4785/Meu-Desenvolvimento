//array
let array=['string',1,true];
console.log(array);

//mais exemplos com array
let array1=['string',1,true,['array1']];
console.log(array1[0]);//vai imprimir 0 que é a string

//forEach(repetição de um indice ou item dentro de um array)
array.forEach(function(item,index){console.log(item,index)})

//push(add item no final do array)
array.push('olha a pedra');
console.log(array);

//pop(remove item no final do array)
array.pop();
console.log(array);

//shift(remove item do início do array)
array.shift();
console.log(array);

//unshift(adiciona item no início do array)
array.unshift('novo item');
console.log(array);

//indexOf(retorna o indíce de um valor)
console.log(array.indexOf(true));

//splice (remove ou retorna um item pelo indice)
array.splice(0,3);
console.log(array);

//slice(retorna uma parte de um array existente)
let novoarray=array.slice(0,3);
console.log(novoarray);

//objeto
let object={string:'string',number:1,boolean:true,array:['array'],objectinterno:{objectinterno:'objeto interno'}}
console.log(object.boolean);//pode se usar o . para acessar um objeto em específico

//destruturação do objeto
var string=object.string;
console.log(string);

var arrayinterno=object.array;
console.log(arrayinterno);

var{string,boolean,objectinterno}=object;
console.log(string,boolean,objectinterno);

