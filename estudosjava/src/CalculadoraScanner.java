import java.util.Scanner;

public class CalculadoraScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");
        Integer n1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Digite outro numero");
        Integer n2 = Integer.valueOf(scanner.nextLine());

        System.out.println("Digite um sinal de operacao");
        String operacao = scanner.nextLine();
        if(operacao.equals("+")){
            System.out.println(n1 + n2);
        }else{
            System.out.println("Ok, ta funcionando! Tem so adicao");
        }
    }
}
