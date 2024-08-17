package co.anima;

public class Principal {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Ave a = new Ave();
        Peixe p = new Peixe();
        Cachorro c = new Cachorro();
        Tartaruga t = new Tartaruga();
        m.locomover();
        r.locomover();
        a.locomover();
        p.locomover();
        t.locomover();
        c.locomover();
        c.alimentar();
        c.reagir("morde");
        c.reagir(20);
        c.reagir(false);
    }
}
