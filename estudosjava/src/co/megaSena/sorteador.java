package co.megaSena;

import co.megaSena.User;

import java.util.Random;

public class sorteador {
    public static void main(String[] args) {
        Random sortea = new Random();
        int i = 0;
        while (i < 6){
            int numero = sortea.nextInt(60);
            System.out.println(numero);
            i++;
        }

        for (int j = 0; j < 6 ; j++) {
            int numero = sortea.nextInt(60);
            System.out.println(numero);
            i++;
        }

      User user = new User();

    }
}
