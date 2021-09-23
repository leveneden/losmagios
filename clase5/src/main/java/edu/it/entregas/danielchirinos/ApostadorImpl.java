package edu.it.entregas.danielchirinos;

public class ApostadorImpl implements Apostador {

    private String nombre;
    private int fichas;

    public ApostadorImpl(String nombre, int fichas) {
        this.nombre = nombre;
        this.fichas = fichas;
    }

    public ApostadorImpl(String nombre) {
        this.nombre = nombre;
        this.fichas = 0;
    }

    @Override
    public void debitar(int fichas) {
        if (this.fichas - fichas < 0)
            throw new InsuficientesFichasException(
                String.format("%s no tiene %d fichas para apostar. Solo posee %d fichas.",
                    this.nombre,
                    this.fichas,
                    this.fichas
                )
            );

        this.fichas -= fichas;
    }

    @Override
    public void recompensar(int fichas) {
        this.fichas += fichas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFichas() {
        return fichas;
    }
}
