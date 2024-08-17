package co.Ufc;

public class Lutadores {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
              l[0] = new Lutador("McGregor", "Irlandes", 39, 1.80, 83, 16, 4, 2 );

        l[1] = new Lutador("Charles do Bronx", "Brasileiro", 32, 1.70, 83, 13, 5, 2);
        l[2] = new Lutador("Thawan", "arabe", 17, 1.60, 44, -3, 1,69 );
        l[3] = new Lutador("Joao", "japao", 17, 1.80, 44, 13, 6, 9);
        Luta l1 = new Luta();
        l1.marcarLuta(l[2], l[3]);
        l1.lutar();


    }
}
