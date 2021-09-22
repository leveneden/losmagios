package edu.it.ejemplos;

import java.util.Objects;

class Juego extends Object {
    private String nombre = "Ajedrez";

    public void jugar() {}

    public String toString() {
        return "la pepa pig";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Juego other = (Juego) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
}


public class Herencia1 {

}
