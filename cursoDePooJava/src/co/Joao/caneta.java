package co.Joao;

public class caneta {
    private String cor;
    private String marca;
    private float ponta;

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPonta(float ponta){
        this.ponta = ponta;
    }

    public float getPonta() {
        return ponta;
    }

    public String getMarca(){
        return marca;
    }

    public String getCor(String azul) {
        return cor;
    }
}
