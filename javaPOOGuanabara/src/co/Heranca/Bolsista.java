package co.Heranca;

public class Bolsista extends Aluno {
    private float Bolsa;

    public float getBolsa() {
        return Bolsa;
    }

    public void setBolsa(float bolsa) {
        Bolsa = bolsa;
    }

    @Override
    public void pagarMensalidade() {
        super.pagarMensalidade();
    }
}
