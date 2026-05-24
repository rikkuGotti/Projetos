class Pessoa {
    constructor(nome) {
        // Função construtora da classe Pessoa.
        // É chamada quando criamos um novo objeto e inicializa o atributo "nome".
        this.nome = nome;
    }
    
    apresentar() {
        // Função da classe Pessoa que imprime uma apresentação no console.
        // Usa o atributo "nome" para personalizar a mensagem.
        console.log("Olá, meu nome é " + this.nome);
    }
}

let p = new Pessoa("Enrico Gotti");
p.apresentar();
// Aqui chamamos a função "apresentar" do objeto criado,
// que exibe a mensagem personalizada no console.