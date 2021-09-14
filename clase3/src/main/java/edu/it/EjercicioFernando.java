package edu.it;

import java.util.Scanner;

public class EjercicioFernando implements Runnable {
    public final Integer PIEDRA = 1;
    public final Integer PAPEL = 2;
    public final Integer TIJERA = 3;

    public final Integer EMPATE = 0;
    public final Integer JUGADOR1 = 1;
    public final Integer JUGADOR2 = 2;

    private void mostrarJugadasIndividuales(Integer resultado, Integer jugada1, Integer jugada2) {
        System.out.println("Mostrar resultado pero componiendolo");
    }

    public Integer fnPuraJuego(Integer jugada1, Integer jugada2) {
        if (jugada1==PIEDRA) {
            if (jugada2==PIEDRA) {
                System.out.println("Empate: Usted eligió 1-Piedra y su oponente eligió 1-Piedra ");
                return EMPATE;
            }
            if (jugada2==PAPEL) {
                System.out.println("Perdió: Usted eligió 1-Piedra y su oponente eligió 2-Papel ");
                return JUGADOR2;
            }
            if (jugada2==TIJERA) {
                System.out.println("Ganó: Usted eligió 1-Piedra y su oponente eligió 3-Tijera ");
                return JUGADOR1;
            }
        }

        if (jugada1==PAPEL) {
            if (jugada2==PAPEL) {
                System.out.println("Empate: Usted eligió 2-Papel y su oponente eligió 2-Papel ");
                return EMPATE;
            }
            if (jugada2==TIJERA) {
                System.out.println("Perdió: Usted eligió 2-Papel y su oponente eligió 3-Tijera ");
                return JUGADOR2;
            }
            if (jugada2==PIEDRA) {
                System.out.println("Ganó: Usted eligió 2-Papel y su oponente eligió 1-Piedra ");
                return JUGADOR1;
            }
        }

        if (jugada1==TIJERA) {
            if (jugada2==TIJERA) {
                System.out.println("Empate: Usted eligió 3-Tijera y su oponente eligió 3-Tijera ");
                return EMPATE;
            }
            if (jugada2==PIEDRA) {
                System.out.println("Perdió: Usted eligió 3-Tijera y su oponente eligió 1-Piedra ");
                return JUGADOR2;
            }
            if (jugada2==PAPEL) {
                System.out.println("Ganó: Usted eligió 3-Tijera y su oponente eligió 1-Papel ");
                return JUGADOR1;
            }
        }

        throw new RuntimeException("HAY UN PROBLEMA EN LA LOGICA");
    }

    private void mostrarMenu() {
        System.out.println("1-Jugar contra la computadora");
        System.out.println("2-salir ");
        System.out.println("Elegir opción: ");
    }

    private Integer menuCon4Intentos() {
        Scanner input=new Scanner(System.in);
        int opcion = 0;

        for (Integer intentos = 1; intentos <= 4; intentos++) {
            mostrarMenu();

            opcion = input.nextInt();
            if ((opcion == 1) || (opcion == 2)) {
                return opcion;
            }

            if (intentos==4) {
                System.out.println("Cantidad de intentos > 4");
                System.exit(0);
            }
        }

        throw new RuntimeException("Error en la logica");
    }

    private Integer ingresarJugada() {
        Scanner input = new Scanner(System.in);

        Integer jugada1 = 0;

        for (;;) {
            System.out.println("");
            System.out.println("Ingrese Jugada: 1-Piedra; 2-Papel; 3-Tijera ");

            jugada1 = input.nextInt();
            if ((jugada1 >= 1) && (jugada1 <= 3)) {
                return jugada1;
            }
            System.out.println("Error debe ingresar una jugada entre 1 y 3: ");
        }
    }

    private void armarUnaJugada() {
        int jugada1,jugada2;

        jugada1 = ingresarJugada();
        jugada2 = (int)(Math.random()*(3-1+1)+1); //(int)(Math.random()*(x-y+1)+y);

        Integer ganador = fnPuraJuego(jugada1, jugada2);
        mostrarJugadasIndividuales(ganador, jugada1, jugada2);
    }

    public void run() {
        for (boolean salir = false; !salir;){
            Integer opcion = menuCon4Intentos();

            if (opcion==2) {
                salir = true;
                continue;
            }

            armarUnaJugada();
        }
    }
}
