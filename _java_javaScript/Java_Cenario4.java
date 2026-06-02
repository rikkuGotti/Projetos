package _java_javaScript;  
// Pacote que organiza a classe.

class Pessoa {  
// Classe que representa uma pessoa.

    String nome;

    Pessoa(String nome) {  
    // Função construtora da classe Pessoa.
    // É chamada quando criamos um novo objeto e inicializa o atributo "nome".
        this.nome = nome;
    }

    void apresentar() {  
    // Função da classe Pessoa que imprime uma apresentação no console.
    // Usa o atributo "nome" para personalizar a mensagem.
        System.out.println("Olá, meu nome é " + nome);
    }
}

public class Java_Cenario4 {  
// Classe principal do programa.

    public static void main(String[] args) {  
    // Função principal (main), ponto de entrada do programa Java.
    // Cria um objeto da classe Pessoa e chama sua função "apresentar".
        Pessoa pessoa = new Pessoa("Enrico");
        pessoa.apresentar();
    }
}