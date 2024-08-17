package co.Heranca;

public class Professor extends Pessoa {
    private String especionalidade;
    private float salario;

    public void receberAumento(){

    }

    public String getEspecionalidade() {
        return especionalidade;
    }

    public void setEspecionalidade(String especionalidade) {
        this.especionalidade = especionalidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
