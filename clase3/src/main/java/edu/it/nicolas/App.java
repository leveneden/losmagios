package edu.it.nicolas;

import java.util.Scanner;
import java.util.Random;

public class App {
    // varargs ... args
    public static void main(String[] args) throws Exception {
        // new ServicioGeneraQRAnual().run();
        Scanner teclado = new Scanner (System.in);
        Random aleatorio = new Random();

        int respuesta;
        int manoJ1;
        int manoJ2 = (aleatorio.nextInt(3));

        System.out.println("�Queres jugar a Piedra, Papel o Tijeras?\n S� = 1\n No = 2\n");
        respuesta = teclado.nextInt();

        if (respuesta == 1){
            System.out.println("Eleg� tu mano\n 0 = PIEDRA\n 1 = PAPEL\n 2 = TIJERA \n");
            manoJ1 = teclado.nextInt();
            switch (manoJ1) {
                case 0:
                    System.out.println("Jugador 1: Piedra");
                    break;
                case 1:
                    System.out.println("Jugador 1: Papel");
                    break;
                case 2:
                    System.out.println("Jugador 1: Tijera");
                    break;
                default:
                    System.out.println("Dato incorrecto");
                }
            switch (manoJ2) {
                case 0:
                    System.out.println("Jugador 2: Piedra");
                break;
                case 1:
                    System.out.println("Jugador 2: Papel");
                    break;
                case 2:
                    System.out.println("Jugador 2: Tijera");
                    break;
                default:
            }
            PreComputo.jugar(manoJ1, manoJ2);

        }else{
            System.out.println("Adi�s Mundo");
        }
    }
}
