package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        double x = 0, y = 0;
        for (int i = 0; i < 2; i++) {
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();
            double p = (a + b + c)/2;
            if(i == 1){
                System.out.printf("Digite o segundo triangulo");
               y = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            }else{
                x = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            }

        }

        if(y > x){
            System.out.println(y);
        }else{
            System.out.println(x);
        }

        sc.close();
    }
}