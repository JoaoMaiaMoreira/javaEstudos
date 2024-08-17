package co.anima;

public class Ave extends Animal {
    private String corPelo;

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void fazerNinho(){

    }

    @Override
    public void locomover() {
        System.out.println("Voa");
    }

    @Override
    public void alimentar() {
        System.out.println("biscoito");
    }
}
