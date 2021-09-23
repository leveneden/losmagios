package edu.it.entregas.danielchirinos;

public class InsuficientesFichasException extends IllegalStateException {

    public InsuficientesFichasException() {
        super();
    }

    public InsuficientesFichasException(String s) {
        super(s);
    }

    public InsuficientesFichasException(String message, Throwable cause) {
        super(message, cause);
    }

    public InsuficientesFichasException(Throwable cause) {
        super(cause);
    }
}
