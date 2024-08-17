package co.Heranca;

public class Universitario extends Bolsista {
    private String universidade;
    private int periodo;

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    @Override
    public void pagarMensalidade() {
        super.pagarMensalidade();
    }
}
