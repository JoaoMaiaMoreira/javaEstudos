package hotel;

public class Estudante {
    private String email;
    private String nome;
    private int quarto;

    public Estudante(String email, int quarto, String nome) {
        this.email = email;
        this.quarto = quarto;
        this.nome = nome;
    }

    public int getQuarto() {
        return quarto;
    }

    public void setQuarto(int quarto) {
        this.quarto = quarto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "email='" + email + '\'' +
                ", nome='" + nome + '\'' +
                ", quarto=" + quarto +
                '}';
    }
}
