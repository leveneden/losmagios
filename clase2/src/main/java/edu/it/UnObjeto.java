package edu.it;

public class UnObjeto {
    public String strPublico;
    private String strPrivado;

    private void metodoPrivado() {
        System.out.println("Hola soy un metodo privado");
    }
    public static void metodoPublicoEstatico() {
        System.out.println("Hola soy un metodo publico estatico");
    }
    public void metodoPublico() {
        System.out.println("Hola soy un metodo publico");
    }
}
