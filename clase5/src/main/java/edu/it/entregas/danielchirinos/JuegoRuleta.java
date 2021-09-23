package edu.it.entregas.danielchirinos;

public interface JuegoRuleta {
    void agregar(Apostador jugador);
    void listarApuesta(Apostador jugador, int fichas, int casilla);
    void jugar();
}
