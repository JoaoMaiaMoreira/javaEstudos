package triangulo;

public class Triangulo {
    private double a;
    private double b;
    private double c;

    public Triangulo(double a, double c, double b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }

    public double calcularArea(){
        double p = (a + b + c)/2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

}
