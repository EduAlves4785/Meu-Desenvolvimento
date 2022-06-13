
function adicionar(){

    let text=document.getElementById("tarefa").value;/*chamando o input texto,o value é o valor digitado*/
    let list=document.getElementById("lista").innerHTML;/*chamando a a lista,o inner irá add coisas do js para o html*/

    list+="<li>"+text+"</li>"/*adiciona items a lista,usando também os items acima*/

    document.getElementById("lista").innerHTML=list;
    document.getElementById("tarefa").value=null;
}