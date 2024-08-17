package co.anima;

public class Cachorro extends Mamifero {
    public void pegarBola(){

    }

    public void reagir(String frase){
        if (frase.equals("morde")) {
            System.out.println("Te mordeu mane");
        }else{
            System.out.println("Mancinho slk");
        }
    }

    public void reagir(int hora){
        if(hora == 20){
            System.out.println("Ta mimindo");
        }
    }

    public void reagir (boolean dono){
        if(dono){
            System.out.println("Abana o rabo");
        }else{
            System.out.println("Sai da qui");
        }
    }

}
