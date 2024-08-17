package co.Heranca;

public class Principal {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Bolsista b1 = new Bolsista();
        Universitario u1 = new Universitario();
        p2.setNome("Joao");
        p2.setCurso("TI");
        b1.setNome("Carlos");
        u1.setNome("Bianca");
        u1.setCurso("DBA");
        u1.setUniversidade("UFLA");
        u1.setBolsa(2000f);
        b1.setMatricula(111);
        b1.setBolsa(50.0f);
        b1.pagarMensalidade();
        u1.pagarMensalidade();
        p2.pagarMensalidade();
    }
}
