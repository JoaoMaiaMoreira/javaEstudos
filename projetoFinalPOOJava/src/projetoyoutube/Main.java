package projetoyoutube;

import projetoyoutube.Gafanhoto;

import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
       Gafanhoto g1 = new Gafanhoto("Joao", 17, "Masculino", "jaaj");
       Gafanhoto g2 = new Gafanhoto("Bianca", 17,"Feminino", "Biiih");


       Video v[] = new Video[3];
        v[0] = new Video("imitando Galo");
        v[1] = new Video("Imitando siriema");
        v[2] = new Video("CPM22 - Um minuto para o fim do mundo");
//        System.out.println(v[0].toString());
//        System.out.println(g1.toString());


        Visualizacao visu = new Visualizacao(g1,v[0]);
        visu.avaliar();
        System.out.println(visu.toString());
        visu.avaliar(100);
        Visualizacao visu2 = new Visualizacao(g2, v[0]);
        System.out.println(visu2.toString());

    }
}