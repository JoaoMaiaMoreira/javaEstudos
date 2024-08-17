package co.banco;

import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {

        Conta c1 = new Conta();
        c1.setNumeroConta(696969);
        c1.setNome("Joao");
        c1.abrirConta("c");
        c1.adicionar(10);
        c1.estadoAtual();

        Conta c2 = new Conta();
        c2.setNumeroConta(606060);
        c2.setNome("Joana");
        c2.abrirConta("cp");
        c2.sacar(100);
        c2.estadoAtual();


        //Minha resolucao:
        //Fui bem longe nessa penser que era para fazer de X forma mas na verdade é de A forma kkkj
//        Scanner scanner = new Scanner(System.in);
//        Conta c1 = new Conta();
//        System.out.println("Qual seu nome?");
//        String nome = scanner.nextLine();
//        c1.setNome(nome);
//        String resposta = "s";
//            System.out.println("Ola" + c1.getNome() + " qual conta voce deseja abrir?c para corrente, cp para conta poupança");
//            String tipo = scanner.nextLine();
//            c1.setTipoDeConta(tipo);
//            if (c1.getTipoDeConta().equals("c")) {
//                System.out.println("deseja sacar ou adicionar dinheiro? s ou a");
//                String movimento = scanner.nextLine();
//                if (movimento.equals("s")) {
//                    System.out.println("qual valor deseja sacar?");
//                    int money = scanner.nextInt();
//                    c1.sacar(money);
//                } else {
//                    System.out.println("Adionar quanto?");
//                    int money = scanner.nextInt();
//                    c1.adicionar(money);
//                }
//
//                System.out.println("quer fazer outra transferencia?");
//                String resp = scanner.nextLine();
//                resposta = resp;
//
//            } else {
//                System.out.println("Deseja transferir ou aicionar? t ou a");
//                String movimento = scanner.nextLine();
//
//            }
//            System.out.println("Seu saldo final foi" + c1.saldo);
//
    }

}
