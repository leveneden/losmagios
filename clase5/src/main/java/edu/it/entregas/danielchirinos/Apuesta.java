package edu.it.entregas.danielchirinos;

public class Apuesta {

    private final Apostador apostador;
    private final int fichas;
    private final int casilla;

    public Apuesta(Apostador apostador, int fichas, int casilla) {
        this.apostador = apostador;
        this.fichas = fichas;
        this.casilla = casilla;
    }

    public Apostador getApostador() {
        return apostador;
    }

    public int getFichas() {
        return fichas;
    }

    public int getCasilla() {
        return casilla;
    }
}
