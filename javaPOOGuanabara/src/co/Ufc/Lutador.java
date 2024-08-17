package co.Ufc;

public class Lutador implements lutadorApresentacao {
    private String nome, categoria, nacionalidade ;

    private int idade,  vitorias, derrotas, empate ;

    private double altura, peso;




    public Lutador(String nome, String nacionalidade, int idade, double altura, float peso, int vitorias, int derrotas, int empate) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empate = empate;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getAltura(){
        return this.altura;
    }



    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso < 70.3){
            this.categoria = "Leve";
        }else if(this.peso <= 83.9){
            this.categoria = "Medio";
        }else if(this.peso >= 93){
            this.categoria = "Pesado";
        }else{
            categoria = "Invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }

    @Override
    public void apresentar() {
        System.out.println("Apresemtamos o " + this.nome);
        System.out.println("Com incriveis " + this.vitorias + " vitorias");
        System.out.println("E apenas " + this.derrotas + " derrotas");
        System.out.println("E " + this.empate + " empates");
    }

    @Override
    public void status() {
        System.out.println("-----" + this.nome + ", status:");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Peso: " + this.peso);
        System.out.println("Altura: " + this.altura);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Vitoria: " + this.vitorias);
        System.out.println("Derrotas: " + this.derrotas);
        System.out.println("Empates: " + this.empate);
    }

    @Override
    public void ganharLuta() {
        this.vitorias = this.vitorias + 1;
    }

    @Override
    public void perderluta() {
     this.derrotas = this.derrotas + 1;
    }

    @Override
    public void empatarLuta() {
        this.empate = this.empate + 1;
    }
};


