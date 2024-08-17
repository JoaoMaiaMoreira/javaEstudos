package co.calculadora;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println("co.calculadora.Calculadora em java!");
        System.out.println("Digite numero operacao numero");
        System.out.println("digite + para adicao, * para multiplicacao, / para divisao, - para subtracao");
        System.out.println("exemplo: 1 + 2");
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[2]);
        if(args[1].equals("+")){
            somar(x,y);
        }
        if(args[1].equals("-")){

            menos(x,y);
        }
        if(args[1].equals("/")){
            divisao(x,y);
        }

        if(args[1].equals("*")){
            multiplicar(x,y);
        }

    }
    static void somar(int x, int y){
        System.out.println(x + y);
    }

    static void menos(int x, int y){
        System.out.println(x - y);
    }

    static void divisao(int x, int y){
        System.out.println(x / y);
    }

    static void multiplicar(int x, int y){
        System.out.println(x * y);
    }

}
