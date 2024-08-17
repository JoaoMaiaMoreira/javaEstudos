package co.curso;

public class Caneta {

    private String cor;
    private double ponta;

    private boolean tampada;

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setPonta(double ponta) {
        this.ponta = ponta;
    }

    public double getPonta() {
        return ponta;
    }

    public void Cara(String cor, float ponta){
        this.cor = cor;
        this.ponta = ponta;
    }

    public Caneta(String cor, float ponta) {
        this.setCor(cor);
        this.ponta = ponta;
        this.tampada = true;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }



    public void Status(){
        System.out.println("Caneta " + this.cor + ", ponta: " + this.ponta);
        if (tampada){
            System.out.println("a caneta esta tampada");
        }else {
            System.out.println("sua caneta esta sem tampa");
        }
    }

}
