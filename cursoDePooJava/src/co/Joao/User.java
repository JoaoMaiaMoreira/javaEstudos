package co.Joao;

import java.util.Objects;

public class User {
    //propriedades campo(objeto)
    private String nome;
    private String sobreNome;

    //gettes e setters
    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public String getNome() {
        return nome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getSobreNome() {
        return sobreNome;
    }


    //Construtor
    public User(String nome, String sobreNome){
        this.nome = nome;
        this.sobreNome = sobreNome;
    }

    public String output(){
        return nome.toUpperCase() + " " + sobreNome.toLowerCase();
    }

    public String output(boolean semUlimoNome){
        if(semUlimoNome){
            return output();
        }
        return nome;
    }

    public String toString(){
        return "nome: " + nome + " Seu sobrenome é " + sobreNome;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(nome, user.nome) && Objects.equals(sobreNome, user.sobreNome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, sobreNome);
    }
}
//  }
