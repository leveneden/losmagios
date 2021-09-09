package edu.it;

public class App {
    // varargs
    public static void transformaEnArray(Integer ...args) {
        for (var z : args) {
            System.out.println(z);
        }
    }
    public static void main(String[] args) throws Exception {
        // new ServicioGeneraQRAnual().run();
        transformaEnArray(1,2,5,4,3,4,7,6,8);
    }
}
