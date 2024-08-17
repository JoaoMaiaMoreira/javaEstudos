import java.util.Scanner;

public class validarSenha {
    public static void main(String[] args) {
        String senha = "S6969S";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua senha:");
        String senhaUser = scanner.nextLine();

        if(senha.equals(senhaUser)){
            System.out.println("logado com sucesso");
        }else{
            System.out.println("Sua senha nao é valida");
        }
    }

}

