package edu.it;

public class ConjeturaCollatz {
    public static Long dividirNumeroPor2(Long numero) {
    	numero /= 2;
    	System.out.println("El numero es: "+numero);
    	return numero;
    }
    public static Long  multiplicarNumero(Long numero) {
        numero = (numero * 3) + 1;
        System.out.println("El numero es: " + numero);
        return numero;
    }
    public static Boolean esPar(Long num) {
        return num % 2 == 0;
    }
    public static Boolean estaEnElLoop(Long num) {
        if (num == 4) {
            return true;
        }
        if (num == 2) {
            return true;
        }
        if (num == 1) {
            return true;
        }
        return false;
    }
    public static boolean noEstaEnElLoop(Long num) {
        return estaEnElLoop(num) == false;
    }
    public static boolean corroborar(Long num) {
        for (;noEstaEnElLoop(num);) {
            if (esPar(num)) {
                num = dividirNumeroPor2(num);
            }
            else {
                num = multiplicarNumero(num);
            }
        }
        System.out.println("EL numero quedo en: " +num);
        return true;
    }
}
