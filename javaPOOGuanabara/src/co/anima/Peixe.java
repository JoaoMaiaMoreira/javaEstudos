package co.anima;

public class Peixe extends Animal{
    private String corScama;

    public String getCorScama() {
        return corScama;
    }

    public void setCorScama(String corScama) {
        this.corScama = corScama;
    }

    public void soltarBolhas(){

    }

    @Override
    public void locomover() {
        System.out.println("Nada");
    }

    @Override
    public void alimentar() {
        System.out.println("racao");
    }
}
