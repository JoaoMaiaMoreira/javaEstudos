package co.Joao;

import javax.security.auth.login.AccountLockedException;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {



        User userA = new User("Joao", "Carlinhos");
        System.out.println(userA.output());
        System.out.println(userA.toString());



//
//        List<String> nomes = new ArrayList<>();
//
//        nomes.add("Bianca");
//        nomes.add("Banana");
//        nomes.add("Arroz");
//
//        Collections.sort(nomes);
//
//        for(String nome : nomes){
//            System.out.println(nome);
//        }

        //verifica se a lista esta vazia:
//        System.out.println(nomes.isEmpty());
//
//        int index = nomes.indexOf("Banana");
//
//        System.out.println(index);
//
//        //buscar elemento pelo index
//        for (int i = 0; i < nomes.size(); i++) {
//            System.out.println(nomes.get(i));
//        }
//
//        System.out.println(nomes.toString());
//        int[] numero = new int[]{1,2,3};
//        int[] numero2 = new int[]{1,2,3};
//
//        System.out.println(Arrays.equals(numero, numero2));
//

//        int[] numeros = new int[]{
//                10,1000,30,40,50,60,70
//    };
//        Arrays.sort(numeros); // <- hasCode int[]| (identificador)
//        System.out.println(numeros);
//        System.out.println(Arrays.toString(numeros));


//        System.out.println("Ate qual numero sua sequencia vai?");
//        Scanner input = new Scanner(System.in);
//        int numero = input.nextInt();
//        int n1 = 0;
//        int n2 = 1;
//        int valor = 0;
//
//        for (int i = 0; i < numero ; i++) {
//          valor = n1 + n2;
//            System.out.println(valor);
//          n1 = n2;
//          n2 = valor;
//        }




//        List<User> users = new ArrayList<>();
//
//        for (int i = 0; i < 10; i++) {
//            User atual = new User("Nome" + 60 + i, "Gozo");
//            users.add(atual);
//            System.out.println(users.get(i).getNome());
//
//        };













//        List<User> users = new ArrayList<>();
//
//        for (int i = 0; i < 20 ; i++) {
//            User atual = new User("Nome" + i, "Sobreno"+i );
//            users.add(atual);
//            System.out.println(users.get(i).getNome());
//        }



//        User[] users = new User[]{
//                new User("Bianca", "Bibiano"),
//                new User("Carlos", "bolsonaro")
//
//        };
//
//        System.out.println(users[1].getNome());
//        System.out.println(users[1].getSobreNome());

//        for (int i = 0; i < users.length; i++) {
//            User userAtual = new User();
//            userAtual.setNome("B" + i);
//            System.out.println(userAtual.getNome());
//            users[i] = userAtual;
//
//        }
//
//        System.out.println(users[9].getNome());

//        User userA = new User();
//        userA.setNome("Marcio");
//        userA.setSobreNome("Fernades");
//        System.out.println(userA.getNome());
//        System.out.println(userA.getSobreNome());


    };
}