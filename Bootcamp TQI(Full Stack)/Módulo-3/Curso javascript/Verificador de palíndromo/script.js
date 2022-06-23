function verificapalindromo(palavra){

    if(!palavra)return;
    
    return palavra.split("").reverse().join("")===palavra;
}
