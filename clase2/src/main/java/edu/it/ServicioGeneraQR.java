package edu.it;

public class ServicioGeneraQR {
    private String nombreRed;
    private String codigoWiFi;

    public ServicioGeneraQR(String nombreRed, String codigoWiFi) {
        this.nombreRed = nombreRed;
        this.codigoWiFi = codigoWiFi;
    }
    public void generarCodigoQR() {
        System.out.println("Generando codigo wifi... " + codigoWiFi);
    }
}
