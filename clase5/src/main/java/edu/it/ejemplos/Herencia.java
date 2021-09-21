package edu.it.ejemplos;

class A {
    public void metodo1() {
        System.out.println("class A::metodo1");
    }
}

class B extends A {
    public void metodo1() {
        System.out.println("class B::metodo1");
    }
}

class C extends B {
    public void metodo1() {
        System.out.println("class C::metodo1");
    }
}

public class Herencia implements Runnable {
    public void run() {
        A a = new C();
        a.metodo1();
    }
}
