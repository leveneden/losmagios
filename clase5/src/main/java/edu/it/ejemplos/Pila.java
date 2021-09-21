package edu.it.ejemplos;

public class Pila implements Runnable {
    public void run() {
        try {
            System.out.println("run:LLamando a ms1...");
            ms1(-5);
            System.out.println("run:Llame con exito a ms1");
            System.out.println("");
        }
        catch (Exception ex) {
            System.out.println("Hubo un error y no se pudo concretar");
        }
    }
    private void ms1(int x){
        System.out.println("ms1: llamare a ms2");
        ms2(x + 1);
        System.out.println("ms1:Llame con exito a ms2");
        System.out.println("");
    }
    private void ms2(int x){
        System.out.println("ms2: llamare a ms3");
        ms3(x + 1);
        System.out.println("ms2:Llame con exito a ms3");
        System.out.println("");
    }
    private void ms3(int x){
        System.out.println("ms3: llamare a ms4");
        ms4(x + 1);
        System.out.println("ms3:Llame con exito a ms4");
        System.out.println("");
    }
    private void ms4(int x){
        try {
            System.out.println("ms4: llamare a ms5");
            ms5(x + 1);
            System.out.println("ms4:Llame con exito a ms5");
            System.out.println("");
        }
        catch (Exception ex) {
            System.out.println("Lo agarro en ms4");
        }
        ms5(x + 1);
    }
    private void ms5(int x){
        System.out.println("ms5: llamare a ms6");
        ms6(x + 1);
        System.out.println("ms5:Llame con exito a ms6");
        System.out.println("");
    }

    private void ms6(int x){
        System.out.println("ms6: aqui termina la cadena.");
        System.out.println("El valor de x es: " + x);

        if (x == 0) {
            throw new RuntimeException("Ojo que no puede dividir por zero");
        }
    }

}
