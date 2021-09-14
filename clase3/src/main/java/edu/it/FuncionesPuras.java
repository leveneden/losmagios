package edu.it;

public class FuncionesPuras {
    public static int optimizarSuma(Integer x, Integer y) {
        int[][] ambosConj = new int[10][10];

        ambosConj[2][3] = 5;
        ambosConj[3][4] = 7;
        ambosConj[2][4] = 6;
        ambosConj[3][3] = 6;

        return ambosConj[x][y];
    }
    public static Integer sumar(Integer x, Integer y) {
        if (x==2 && y==3) {
            return 5;
        }
        if (x==3 && y==4) {
            return 7;
        }
        if (x==2 && y==4) {
            return 6;
        }
        if (x==3 && y==3) {
            return 6;
        }
        return 0;
    }
    public static void mostrarBondadesFuncionesPuras() {
        // set de x {2, 3}
        // set de y {3, 4}
        System.out.println(optimizarSuma(3,4));
    }
}
