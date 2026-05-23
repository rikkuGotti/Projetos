package _java_javaScript;

public class Java_Cenario5 extends Thread {
    
    public void run(){
        System.out.println("Executando paralelo");
    }

    public static void main(String[] args) {
        Java_Cenario5 cenario = new Java_Cenario5();
        
        cenario.start();
        
        System.out.println("Executando main!");
    }
}
