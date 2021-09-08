package edu.it;

public class App {
    private static int leerTeclado (String mensaje){
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        System.out.println(mensaje);
        return teclado.nextInt();
    }
    public static void main(String[] args) throws Exception {
        System.out.println("");
        System.out.println(ConjeturaCollatz.corroborar(111L));
    }
}
