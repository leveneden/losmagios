package edu.it;

public class ServicioGeneraQRAnual implements Runnable {
    public void run() {
        var arrSrvQR = new ServicioGeneraQR[52];

        for (int x = 0; x < arrSrvQR.length; x++) {
            arrSrvQR[x] = new ServicioGeneraQR("Telecentro 433", String.valueOf((x+3)*(x+1)*77));
        }

        for (var z : arrSrvQR) {
            z.generarCodigoQR();
        }
    }
}
