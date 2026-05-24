package _java_javaScript;  
// Pacote que organiza a classe.

public class Java_Cenario5 extends Thread {  
// Classe principal que herda da classe Thread para permitir execução paralela.

    public void run(){  
    // Função "run" sobrescreve o método da classe Thread.
    // Contém o código que será executado em paralelo quando a thread for iniciada.
        System.out.println("Executando paralelo");
    }

    public static void main(String[] args) {  
    // Função principal (main), ponto de entrada do programa Java.
    // Cria uma instância da classe e inicia a execução paralela com "start".
        Java_Cenario5 cenario = new Java_Cenario5();
        
        cenario.start();  
        // Chama o método "start", que por sua vez executa o método "run" em uma thread separada.

        System.out.println("Executando main!");
        // Mensagem exibida pela thread principal.
    }
}
