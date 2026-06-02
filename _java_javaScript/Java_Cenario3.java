package _java_javaScript;  
// Pacote que organiza a classe.

public class Java_Cenario3 {  
// Classe principal do programa.

    static int soma(int a, int b) {  
    // Função auxiliar chamada "soma".
    // Recebe dois números inteiros como parâmetros e retorna a soma deles.
        return a + b;
    }
    
    public static void main(String[] args) {  
    // Função principal (main), ponto de entrada do programa Java.
    // Aqui o programa chama a função "soma" e exibe o resultado no console.
        System.out.println("A soma é: " + soma(5, 3));
    }
}