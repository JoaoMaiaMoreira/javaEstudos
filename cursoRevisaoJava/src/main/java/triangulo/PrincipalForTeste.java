package triangulo;

import java.util.Arrays;

public class PrincipalForTeste {
    public static void main(String[] args) {
        Triangulo t = new Triangulo(2,2,2);
        Triangulo t2 = new Triangulo(8,8,8);
        System.out.println(t.calcularArea());
    }
}
