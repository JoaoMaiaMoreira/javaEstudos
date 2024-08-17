package hotel;

public class Quarto {
    private int numero;
    private boolean taOcupado;
    private Estudante responsavel;

    public Quarto(Estudante responsavel) {
        this.responsavel = responsavel;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Estudante getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Estudante responsavel) {
        this.responsavel = responsavel;
    }

    public boolean isTaOcupado() {
        return taOcupado;
    }

    public void setTaOcupado(boolean taOcupado) {
        this.taOcupado = taOcupado;
    }

    @Override
    public String toString() {
        return "Quarto{" +
                "numero=" + numero +
                ", taOcupado=" + taOcupado +
                ", responsavel=" + responsavel +
                '}';
    }
}
