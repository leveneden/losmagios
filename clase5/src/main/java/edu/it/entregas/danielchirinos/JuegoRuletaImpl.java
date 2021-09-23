package edu.it.entregas.danielchirinos;

import java.util.*;
import java.util.stream.Collectors;

public class JuegoRuletaImpl implements JuegoRuleta {

    private static final int PRIMERA_CASILLA = 1;
    private static final int ULTIMA_CASILLA = 36;

    private Set<Apostador> jugadores = new HashSet<>();
    private List<Apuesta> apuestas = new ArrayList<>();

    @Override
    public void agregar(Apostador jugador) {
        jugadores.add(jugador);
    }

    @Override
    public void listarApuesta(Apostador jugador, int fichas, int casilla) throws IllegalArgumentException {
        validarCasilla(casilla);

        boolean fichasFueronDebitadas = false;

        try {
            jugador.debitar(fichas);
            fichasFueronDebitadas = true;
        } catch(InsuficientesFichasException e) {
            System.out.println("Este apostador no posee suficientes fichas. La apuesta no fue registrada.");
        }

        if (fichasFueronDebitadas)
            apuestas.add(new Apuesta(jugador, fichas, casilla));
    }

    @Override
    public void jugar() {
        // girar ruleta
        int casillaGanadora = random(PRIMERA_CASILLA, ULTIMA_CASILLA);

        // definir ganadores
        List<Apuesta> apuestasGanadoras =
                apuestas
                .stream()
                .filter(apuesta -> apuesta.getCasilla() == casillaGanadora)
                .collect(Collectors.toList());

        // recompensar ganadores
        recompensarGanadores(apuestasGanadoras, obtenerTotalDeFichas(apuestas), obtenerTotalDeFichas(apuestasGanadoras));

        // limpiar lista de apuestas
        apuestas.clear();
    }

    private void recompensarGanadores(List<Apuesta> apuestasGanadoras, int totalFichasApostadas, int totalFichasApostadasEnApuestasGanadoras) {
        for (Apuesta apuesta : apuestasGanadoras) {
            int gananciaProporcianal = Math.round(map(
                    apuesta.getFichas(),
                    0,
                    totalFichasApostadasEnApuestasGanadoras,
                    0,
                    totalFichasApostadas
            ));
            apuesta.getApostador().recompensar(gananciaProporcianal);
        }
    }

    private int obtenerTotalDeFichas(List<Apuesta> apuestas) {
        return apuestas
                .stream()
                .mapToInt(Apuesta::getFichas)
                .sum();
    }

    private void validarCasilla(int casilla) throws IllegalArgumentException {
        if (casilla < PRIMERA_CASILLA || casilla > ULTIMA_CASILLA)
            throw new IllegalArgumentException(
                String.format(
                    "No existe la casilla %d en el juego de la ruleta. Ingrese un nimero de casilla entre 1 y 36",
                    casilla
                )
            );
    }

    private int random(int low, int high) {
        return new Random().nextInt(high-low) + low;
    }

    static public float map(float value, float istart, float istop, float ostart, float ostop) {
        return ostart + (ostop - ostart) * ((value - istart) / (istop - istart));
    }
}
