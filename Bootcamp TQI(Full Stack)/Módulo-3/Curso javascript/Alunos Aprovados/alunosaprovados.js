const alunos=[
    {
        nome:'Afonso',
        nota:8,
        turma:'J1',
    },
    {
        nome:'Priscila',
        nota:5,
        turma:'J2', 
    }
]


function alunosaprovados(arr,media){
    media>=6
    let aprovados=[];
    
    for(i=0;i<arr.length;i++){
        
        const {nota,nome}=arr[i];
        
        if(nota>=media){
            aprovados.push(nome);
        }
    }
    return aprovados;
}


console.log(alunosaprovados(alunos,5))