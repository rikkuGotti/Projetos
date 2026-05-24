async function tarefa() {
    // Função assíncrona chamada "tarefa".
    // Quando chamada, executa o código dentro dela (nesse caso, imprime uma mensagem).
    console.log("Executando em paralelo");
}

tarefa();
// Chamada da função "tarefa". 
// Mesmo sendo assíncrona, como não há await dentro dela, executa imediatamente.

console.log("Executando main!");
// Função console.log imprime a mensagem da execução principal.