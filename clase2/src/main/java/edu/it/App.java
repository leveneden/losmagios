package edu.it;

import static edu.it.Utiles.redondear;

public class App {
    public static void main(String[] args) throws Exception {
        // new ServicioGeneraQRAnual().run();

        var calculadora = new CalculadorIndiceInflacion();
        var acumulado = calculadora.calcularInflacion(2.3d, 3d, 2.9d);
        System.out.println(redondear(acumulado, 3));

    }
}
