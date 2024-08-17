package co.curso;

import co.curso.Caneta;

public class Main {
    public static void main(String[] args) {
       Caneta c1 = new Caneta("vermelha", 7.0f);
        Caneta c2 = new Caneta("Verde", 0.6f);
        c1.Status();

       c1.Cara("vemelha", 3.0f);
       c1.setTampada(false);

        c1.Status();

    }
}