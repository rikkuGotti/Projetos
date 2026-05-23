package _java_javaScript;

class Pessoa {
    
    String nome;

    Pessoa(String nome) {
        this.nome = nome;
    }

    void apresentar() {
        System.out.println("Olá, meu nome é " + nome);
    }
}

public class Java_Cenario4 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Enrico");
        pessoa.apresentar();
    }
}
