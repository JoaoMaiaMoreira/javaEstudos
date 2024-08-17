package co.anima;

public class Reptil extends Animal {
    private String corScama;

    public String getCorScama() {
        return corScama;
    }

    public void setCorScama(String corScama) {
        this.corScama = corScama;
    }

    @Override
    public void locomover() {
        System.out.println("Rasteja");
    }

    @Override
    public void alimentar() {
        System.out.println("Arroz");
    }
}
