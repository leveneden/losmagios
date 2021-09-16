package edu.it.ejemplos;

import java.util.Scanner;

interface Participante {
    Integer obtenerJugada();
}

class Consola implements Participante {
    public Integer obtenerJugada() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese por favor un entero");
        return scn.nextInt();
    }
}

class Random implements Participante {
    public Integer obtenerJugada() {
        System.out.println("Generando un random....");
        return (int)(Math.random()*3);
    }
}

public class Polimorfismo implements Runnable {
    public Participante[] instanciar() {
        return new Participante[] {
            new Random(),
            new Random()
        };
    }

    public void run() {
        Participante[] dosParticipantes;

        Participante[] arrPart = instanciar();

        System.out.println(arrPart[0].obtenerJugada());
        System.out.println(arrPart[1].obtenerJugada());
    }
}
