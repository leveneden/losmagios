package edu.it;

public class App {
    public static void main(String[] args) throws Exception {
        JuegosParaApostar jpa = (JuegosParaApostar)
                Class
                        .forName(args[0])
                        .getConstructor()
                        .newInstance();

        jpa.jugar();
    }
}
