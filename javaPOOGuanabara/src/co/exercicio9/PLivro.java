package co.exercicio9;

public class PLivro {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Joao", 17, "masculino");
        Livro l1 = new Livro("A revolucao dos bichos", "George", 130, p1);
        l1.abrir();
        l1.folhear(500);
        System.out.println(l1.detalhes());
    }
}
