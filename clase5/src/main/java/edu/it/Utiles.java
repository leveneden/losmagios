package edu.it;

public class Utiles {
    public static double redondear2decimlaes(Double x) {
        return Math.round(x*100.00) / 100.00;
    }
    public static double redondear(Double x, Integer cantDecimales) {
        Double z = Math.pow(10, cantDecimales);
        return Math.round(x*z) / z;
    }
}
