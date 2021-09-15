package edu.it.nicolas;

class PreComputo {
    public static final Integer PIEDRA = 0;
    public static final Integer PAPEL = 1;
    public static final Integer TIJERA = 2;

    public static final Integer EMPATE = 0;
    public static final Integer JUGADOR1 = 1;
    public static final Integer JUGADOR2 = 2;

    public static int jugar (int j1, int j2){
        int [][] jugadas = new int [3][3];

        jugadas[PIEDRA][PIEDRA] = EMPATE;
        jugadas[PIEDRA][PAPEL] = JUGADOR2;
        jugadas[PIEDRA][TIJERA] = JUGADOR1;
        jugadas[PAPEL][PIEDRA] = JUGADOR1;
        jugadas[PAPEL][PAPEL] = EMPATE;
        jugadas[PAPEL][TIJERA] = JUGADOR2;
        jugadas[TIJERA][PIEDRA] = JUGADOR2;
        jugadas[TIJERA][PAPEL] = JUGADOR1;
        jugadas[TIJERA][TIJERA] = EMPATE;

        switch (jugadas[j1][j2]) {
            case 0:
                System.out.println("Empate");
                break;
            case 1:
                System.out.println("Ganaste!");
                break;
            default:
                System.out.println("La suerte no estuvo de tu lado :( - Intentalo otra vez.");
                break;
        }
        return jugadas[j1][j2];
    }
}
