package edu.it;

public class App {
    public static void main(String[] args) throws Exception {
        com.bolivarsoft.components.Menu m =
                com.bolivarsoft.components.MenuFileSystem.crearMenu();
        m.mostrar();
    }
}
